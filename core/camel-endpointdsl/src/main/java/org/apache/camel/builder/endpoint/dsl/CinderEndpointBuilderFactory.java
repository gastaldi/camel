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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The openstack-cinder component allows messages to be sent to an OpenStack
 * block storage services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CinderEndpointBuilderFactory {


    /**
     * Builder for endpoint for the OpenStack Cinder component.
     */
    public interface CinderEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCinderEndpointBuilder advanced() {
            return (AdvancedCinderEndpointBuilder) this;
        }
        /**
         * OpenStack API version.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: V3
         * Group: producer
         */
        default CinderEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option is a: <code>org.openstack4j.core.transport.Config</code>
         * type.
         * 
         * Group: producer
         */
        default CinderEndpointBuilder config(Object config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option will be converted to a
         * <code>org.openstack4j.core.transport.Config</code> type.
         * 
         * Group: producer
         */
        default CinderEndpointBuilder config(String config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * Authentication domain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: default
         * Group: producer
         */
        default CinderEndpointBuilder domain(String domain) {
            doSetProperty("domain", domain);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CinderEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CinderEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to do.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CinderEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * OpenStack password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CinderEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The project ID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CinderEndpointBuilder project(String project) {
            doSetProperty("project", project);
            return this;
        }
        /**
         * OpenStack Cinder subsystem.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CinderEndpointBuilder subsystem(String subsystem) {
            doSetProperty("subsystem", subsystem);
            return this;
        }
        /**
         * OpenStack username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CinderEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OpenStack Cinder component.
     */
    public interface AdvancedCinderEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CinderEndpointBuilder basic() {
            return (CinderEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCinderEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCinderEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCinderEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCinderEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * OpenStack Cinder (camel-openstack)
     * The openstack-cinder component allows messages to be sent to an OpenStack
     * block storage services.
     * 
     * Category: cloud,paas
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-openstack
     * 
     * Syntax: <code>openstack-cinder:host</code>
     * 
     * Path parameter: host (required)
     * OpenStack host url
     */
    static CinderEndpointBuilder openstackCinder(String path) {
        class CinderEndpointBuilderImpl extends AbstractEndpointBuilder implements CinderEndpointBuilder, AdvancedCinderEndpointBuilder {
            public CinderEndpointBuilderImpl(String path) {
                super("openstack-cinder", path);
            }
        }
        return new CinderEndpointBuilderImpl(path);
    }
}