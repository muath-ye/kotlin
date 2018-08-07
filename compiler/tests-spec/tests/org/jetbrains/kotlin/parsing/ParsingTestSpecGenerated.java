/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.parsing;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/tests-spec/testData/psi")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ParsingTestSpecGenerated extends AbstractParsingTestSpec {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInPsi() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true, "_helpers");
    }

    @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class S_16_30_when_expression extends AbstractParsingTestSpec {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInS_16_30_when_expression() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class P_2 extends AbstractParsingTestSpec {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInP_2() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/neg")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Neg extends AbstractParsingTestSpec {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
                }

                @TestMetadata("3.1.kt")
                public void test3_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/neg/3.1.kt");
                }

                @TestMetadata("3.2.kt")
                public void test3_2() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/neg/3.2.kt");
                }

                public void testAllFilesPresentInNeg() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/neg"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }
            }

            @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/pos")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Pos extends AbstractParsingTestSpec {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
                }

                @TestMetadata("3.1.kt")
                public void test3_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/pos/3.1.kt");
                }

                @TestMetadata("3.2.kt")
                public void test3_2() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/pos/3.2.kt");
                }

                public void testAllFilesPresentInPos() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-2/pos"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }
            }
        }

        @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class P_3 extends AbstractParsingTestSpec {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInP_3() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3/neg")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Neg extends AbstractParsingTestSpec {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
                }

                @TestMetadata("1.1.kt")
                public void test1_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3/neg/1.1.kt");
                }

                @TestMetadata("1.2.kt")
                public void test1_2() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3/neg/1.2.kt");
                }

                @TestMetadata("2.1.kt")
                public void test2_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3/neg/2.1.kt");
                }

                @TestMetadata("2.2.kt")
                public void test2_2() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3/neg/2.2.kt");
                }

                public void testAllFilesPresentInNeg() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-3/neg"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }
            }
        }

        @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class P_6 extends AbstractParsingTestSpec {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInP_6() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6/neg")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Neg extends AbstractParsingTestSpec {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
                }

                @TestMetadata("1.1.kt")
                public void test1_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6/neg/1.1.kt");
                }

                @TestMetadata("1.2.kt")
                public void test1_2() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6/neg/1.2.kt");
                }

                @TestMetadata("1.3.kt")
                public void test1_3() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6/neg/1.3.kt");
                }

                public void testAllFilesPresentInNeg() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-6/neg"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }
            }
        }

        @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class P_7 extends AbstractParsingTestSpec {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInP_7() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7/neg")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Neg extends AbstractParsingTestSpec {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doParsingTest, TargetBackend.ANY, testDataFilePath);
                }

                @TestMetadata("1.1.kt")
                public void test1_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7/neg/1.1.kt");
                }

                @TestMetadata("1.2.kt")
                public void test1_2() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7/neg/1.2.kt");
                }

                @TestMetadata("3.1.kt")
                public void test3_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7/neg/3.1.kt");
                }

                @TestMetadata("7.1.kt")
                public void test7_1() throws Exception {
                    runTest("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7/neg/7.1.kt");
                }

                public void testAllFilesPresentInNeg() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/tests-spec/testData/psi/s-16.30_when-expression/p-7/neg"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }
            }
        }
    }
}
