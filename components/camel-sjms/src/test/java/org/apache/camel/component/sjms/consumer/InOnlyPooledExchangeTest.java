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
package org.apache.camel.component.sjms.consumer;

import org.apache.camel.CamelContext;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.sjms.support.JmsTestSupport;
import org.apache.camel.impl.engine.PooledExchangeFactory;
import org.junit.jupiter.api.Test;

public class InOnlyPooledExchangeTest extends JmsTestSupport {

    private static final String SJMS_QUEUE_NAME = "sjms:queue:in.only.consumer.queue";
    private static final String MOCK_RESULT = "mock:result";

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();
        context.adapt(ExtendedCamelContext.class).setExchangeFactory(new PooledExchangeFactory());
        return context;
    }

    @Test
    public void testSynchronous() throws Exception {
        final String expectedBody = "Hello World";
        MockEndpoint mock = getMockEndpoint(MOCK_RESULT);
        mock.expectedMessageCount(1);
        mock.expectedBodiesReceived(expectedBody);

        template.sendBody(SJMS_QUEUE_NAME, expectedBody);

        mock.assertIsSatisfied();
    }

    @Test
    public void testTwoSynchronous() throws Exception {
        MockEndpoint mock = getMockEndpoint(MOCK_RESULT);
        mock.expectedBodiesReceived("Hello World", "Bye World");

        template.sendBody(SJMS_QUEUE_NAME, "Hello World");
        template.sendBody(SJMS_QUEUE_NAME, "Bye World");

        mock.assertIsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from(SJMS_QUEUE_NAME)
                        .to(MOCK_RESULT);
            }
        };
    }

}
