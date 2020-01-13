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

import java.util.concurrent.BlockingQueue;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.WaitForTaskToComplete;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The vm component provides asynchronous call to another endpoint from the same
 * CamelContext.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VmEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the VM component.
     */
    public interface VmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedVmEndpointConsumerBuilder advanced() {
            return (AdvancedVmEndpointConsumerBuilder) this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: common
         */
        default VmEndpointConsumerBuilder size(int size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1000
         * Group: common
         */
        default VmEndpointConsumerBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default VmEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default VmEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default VmEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default VmEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the VM component.
     */
    public interface AdvancedVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default VmEndpointConsumerBuilder basic() {
            return (VmEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder limitConcurrentConsumers(
                boolean limitConcurrentConsumers) {
            doSetProperty("limitConcurrentConsumers", limitConcurrentConsumers);
            return this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder limitConcurrentConsumers(
                String limitConcurrentConsumers) {
            doSetProperty("limitConcurrentConsumers", limitConcurrentConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder multipleConsumers(
                boolean multipleConsumers) {
            doSetProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder multipleConsumers(
                String multipleConsumers) {
            doSetProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder pollTimeout(int pollTimeout) {
            doSetProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1000
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder pollTimeout(String pollTimeout) {
            doSetProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder purgeWhenStopping(
                boolean purgeWhenStopping) {
            doSetProperty("purgeWhenStopping", purgeWhenStopping);
            return this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         */
        default AdvancedVmEndpointConsumerBuilder purgeWhenStopping(
                String purgeWhenStopping) {
            doSetProperty("purgeWhenStopping", purgeWhenStopping);
            return this;
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
        default AdvancedVmEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedVmEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option is a: <code>java.util.concurrent.BlockingQueue</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedVmEndpointConsumerBuilder queue(BlockingQueue queue) {
            doSetProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * 
         * Group: advanced
         */
        default AdvancedVmEndpointConsumerBuilder queue(String queue) {
            doSetProperty("queue", queue);
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
        default AdvancedVmEndpointConsumerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedVmEndpointConsumerBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the VM component.
     */
    public interface VmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedVmEndpointProducerBuilder advanced() {
            return (AdvancedVmEndpointProducerBuilder) this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: common
         */
        default VmEndpointProducerBuilder size(int size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1000
         * Group: common
         */
        default VmEndpointProducerBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder blockWhenFull(boolean blockWhenFull) {
            doSetProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder blockWhenFull(String blockWhenFull) {
            doSetProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder discardIfNoConsumers(
                boolean discardIfNoConsumers) {
            doSetProperty("discardIfNoConsumers", discardIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder discardIfNoConsumers(
                String discardIfNoConsumers) {
            doSetProperty("discardIfNoConsumers", discardIfNoConsumers);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will be
         * discarded. By default, an exception will be thrown stating that the
         * queue is full. By enabling this option, the calling thread will give
         * up sending and continue, meaning that the message was not sent to the
         * SEDA queue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder discardWhenFull(
                boolean discardWhenFull) {
            doSetProperty("discardWhenFull", discardWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will be
         * discarded. By default, an exception will be thrown stating that the
         * queue is full. By enabling this option, the calling thread will give
         * up sending and continue, meaning that the message was not sent to the
         * SEDA queue.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder discardWhenFull(String discardWhenFull) {
            doSetProperty("discardWhenFull", discardWhenFull);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            doSetProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmEndpointProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            doSetProperty("failIfNoConsumers", failIfNoConsumers);
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
        default VmEndpointProducerBuilder lazyStartProducer(
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
        default VmEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default VmEndpointProducerBuilder offerTimeout(long offerTimeout) {
            doSetProperty("offerTimeout", offerTimeout);
            return this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default VmEndpointProducerBuilder offerTimeout(String offerTimeout) {
            doSetProperty("offerTimeout", offerTimeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default VmEndpointProducerBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default VmEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected.
         * 
         * The option is a: <code>org.apache.camel.WaitForTaskToComplete</code>
         * type.
         * 
         * Default: IfReplyExpected
         * Group: producer
         */
        default VmEndpointProducerBuilder waitForTaskToComplete(
                WaitForTaskToComplete waitForTaskToComplete) {
            doSetProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.WaitForTaskToComplete</code> type.
         * 
         * Default: IfReplyExpected
         * Group: producer
         */
        default VmEndpointProducerBuilder waitForTaskToComplete(
                String waitForTaskToComplete) {
            doSetProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the VM component.
     */
    public interface AdvancedVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default VmEndpointProducerBuilder basic() {
            return (VmEndpointProducerBuilder) this;
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
        default AdvancedVmEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedVmEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option is a: <code>java.util.concurrent.BlockingQueue</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedVmEndpointProducerBuilder queue(BlockingQueue queue) {
            doSetProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * 
         * Group: advanced
         */
        default AdvancedVmEndpointProducerBuilder queue(String queue) {
            doSetProperty("queue", queue);
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
        default AdvancedVmEndpointProducerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedVmEndpointProducerBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the VM component.
     */
    public interface VmEndpointBuilder
            extends
                VmEndpointConsumerBuilder, VmEndpointProducerBuilder {
        default AdvancedVmEndpointBuilder advanced() {
            return (AdvancedVmEndpointBuilder) this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: common
         */
        default VmEndpointBuilder size(int size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1000
         * Group: common
         */
        default VmEndpointBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the VM component.
     */
    public interface AdvancedVmEndpointBuilder
            extends
                AdvancedVmEndpointConsumerBuilder, AdvancedVmEndpointProducerBuilder {
        default VmEndpointBuilder basic() {
            return (VmEndpointBuilder) this;
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
        default AdvancedVmEndpointBuilder basicPropertyBinding(
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
        default AdvancedVmEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option is a: <code>java.util.concurrent.BlockingQueue</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedVmEndpointBuilder queue(BlockingQueue queue) {
            doSetProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * 
         * Group: advanced
         */
        default AdvancedVmEndpointBuilder queue(String queue) {
            doSetProperty("queue", queue);
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
        default AdvancedVmEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedVmEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * VM (camel-vm)
     * The vm component provides asynchronous call to another endpoint from the
     * same CamelContext.
     * 
     * Category: core,endpoint
     * Since: 1.1
     * Maven coordinates: org.apache.camel:camel-vm
     * 
     * Syntax: <code>vm:name</code>
     * 
     * Path parameter: name (required)
     * Name of queue
     */
    static VmEndpointBuilder vm(String path) {
        class VmEndpointBuilderImpl extends AbstractEndpointBuilder implements VmEndpointBuilder, AdvancedVmEndpointBuilder {
            public VmEndpointBuilderImpl(String path) {
                super("vm", path);
            }
        }
        return new VmEndpointBuilderImpl(path);
    }
}