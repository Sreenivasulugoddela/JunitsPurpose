package org.example;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParameterTest
{


         StringHelper helper=new StringHelper();

             private  String input;
             private  String expectedOutput;


    public StringHelperParameterTest(String input,String expectedOutput)
    {
        this.input=input;
        this.expectedOutput = expectedOutput;

    }

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

             @Parameterized.Parameters
             public static Collection<String[]> myParameterValues()
             {
                  String[][] expectedOuptuts ={{"CDEF","CDEF"},{"ABCD","BCD"},{"",""}};
                  return  Arrays.asList(expectedOuptuts);
             }


         //AACD => CD
//         @Test
//         public void truncateTestcaseOne()
//         {
//
//             assertEquals(expectedOutput,helper.stringTruncateA(input));
//             //System.out.println("My result is "+expected);
//         }
//        //ACD => CD
//         @Test
//         public void truncateTestCaseTwo()
//         {
//             assertEquals(expectedOutput,helper.stringTruncateA(input));
//             System.out.println("Result is CD");
//         }
//         // CDEF => CDEF   : ABCD=> BCD
        @Test
        public void truncateTestCaseThree()
        {
            String actual=helper.stringTruncateA(input);
            String expected=expectedOutput;
            assertEquals(expected,actual);
            //System.out.println("My result is "+expected);
        }
          @Test
        public void trumcateTestCaseFour()
        {
            assertEquals(expectedOutput,helper.stringTruncateA(input));
        }

         @AfterClass
         public static void afterClass()
         {
             System.out.println("iam invoking after the class");
         }
}