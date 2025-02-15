/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jms;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.NotifyBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 */
public class JmsErrorHandlerLogStackTraceTest extends CamelTestSupport {

    @Test
    public void testErrorHandlerLogStackTrace() {
        JmsComponent jms = context.getComponent("jms", JmsComponent.class);
        assertFalse(jms.getConfiguration().isErrorHandlerLogStackTrace());

        // should fail
        NotifyBuilder notify = new NotifyBuilder(context).whenFailed(1).create();

        template.sendBody("jms:queue:foo", "Hello World");

        assertTrue(notify.matchesWaitTime());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // dont log any exhausted errors
                errorHandler(defaultErrorHandler().logExhausted(false));

                from("jms:queue:foo")
                        .throwException(new IllegalArgumentException("Forced"));
            }
        };
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();

        ConnectionFactory connectionFactory = CamelJmsTestHelper.createConnectionFactory();
        JmsComponent jms = JmsComponent.jmsComponentAutoAcknowledge(connectionFactory);
        jms.getConfiguration().setErrorHandlerLogStackTrace(false);
        jms.getConfiguration().setErrorHandlerLoggingLevel(LoggingLevel.ERROR);
        camelContext.addComponent("jms", jms);

        return camelContext;
    }

}
