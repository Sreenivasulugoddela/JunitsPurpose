package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class StringHelperTest
{


         StringHelper helper=new StringHelper();

         @BeforeClass
         public static void beforeClass()
         {
            System.out.println("Iam invoking before the class");

         }

         @Before
         public void setup()
         {
             System.out.println("Iam invoked before every test case");
         }
         //AACD => CD
         @Test
         public void truncateTestcaseOne()
         {
             String actual=helper.stringTruncateA("AACD");
             String expected="CD";
             assertEquals(expected,actual);
             System.out.println("My result is "+expected);
         }
        //ACD => CD
         @Test
         public void truncateTestCaseTwo()
         {
             assertEquals("CD",helper.stringTruncateA("ACD"));
             System.out.println("Result is CD");
         }
          //CDEF => CDEF   : ABCD=> BCD
        @Test
        public void truncateTestCaseThree()
        {
            String actual=helper.stringTruncateA("CDEF");
            String expected="CDEF";
            assertEquals(expected,actual);
            System.out.println("My result is "+expected);

        }
        @Test
        public void truncateTestCaseFour()
        {
            assertEquals("BCD",helper.stringTruncateA("ABCD"));

            System.out.println("Result is BCD");
        }
        @Test
        public void testOfFirstAndLastTwoCharsAreSame()
        {
            assertEquals(true,helper.areFirstAndLastTwoCharsAreSame("ABAB"));
            System.out.println("IAM EXPECTED");
        }
         @After
         public void afterTest()
         {
             System.out.println("Iam invoked after every test case ");
             System.out.println("*****************************");
         }

         @AfterClass
         public static void afterClass()
         {
             System.out.println("iam invoking after the class");
         }
}