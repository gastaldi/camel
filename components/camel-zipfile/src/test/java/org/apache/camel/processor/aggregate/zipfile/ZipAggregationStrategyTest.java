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
package org.apache.camel.processor.aggregate.zipfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.camel.util.IOHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.apache.camel.test.junit5.TestSupport.deleteDirectory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZipAggregationStrategyTest extends CamelTestSupport {

    private static final int EXPECTED_NO_FILES = 3;
    private static final String TEST_DIR = "target/out_ZipAggregationStrategyTest";

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        deleteDirectory(TEST_DIR);
        super.setUp();
    }

    @Test
    public void testSplitter() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:aggregateToZipEntry");
        mock.expectedMessageCount(1);
        mock.expectedHeaderReceived("foo", "bar");

        assertMockEndpointsSatisfied();

        File[] files = new File(TEST_DIR).listFiles();
        assertNotNull(files);
        assertTrue(files.length > 0, "Should be a file in " + TEST_DIR + " directory");

        File resultFile = files[0];

        ZipInputStream zin = new ZipInputStream(new FileInputStream(resultFile));
        try {
            int fileCount = 0;
            for (ZipEntry ze = zin.getNextEntry(); ze != null; ze = zin.getNextEntry()) {
                fileCount++;
            }
            assertEquals(ZipAggregationStrategyTest.EXPECTED_NO_FILES, fileCount,
                    "Zip file should contains " + ZipAggregationStrategyTest.EXPECTED_NO_FILES + " files");
        } finally {
            IOHelper.close(zin);
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // Unzip file and Split it according to FileEntry
                from("file:src/test/resources/org/apache/camel/aggregate/zipfile/data?delay=1000&noop=true")
                        .setHeader("foo", constant("bar"))
                        .aggregate(new ZipAggregationStrategy())
                        .constant(true)
                        .completionFromBatchConsumer()
                        .eagerCheckCompletion()
                        .to("file:" + TEST_DIR)
                        .to("mock:aggregateToZipEntry")
                        .log("Done processing zip file: ${header.CamelFileName}");
            }
        };

    }
}
