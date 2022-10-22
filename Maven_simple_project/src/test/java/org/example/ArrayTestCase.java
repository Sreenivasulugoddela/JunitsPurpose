package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class ArrayTestCase
{

        @Test
       public void customArraysTest()
       {
            int actual[] ={2,34,454,55,66545};
            int expected[]={2,34,55,454,66545};
           Arrays.sort(actual);
            assertArrayEquals(expected,actual);
       }

       @Test(expected = NullPointerException.class)
       public void customException()
       {
           int actual[] =null;
           int expected[]={2,34,55,454,66545};
           Arrays.sort(actual);
           assertArrayEquals(expected,actual);

       }

       @Test
       public void customTryException()
       {
           try {
               int actual[] =null;
               int expected[]={2,34,55,454,66545};
               Arrays.sort(actual);
               assertArrayEquals(expected,actual);
           }
           catch (NullPointerException e)
           {
           }
       }



        @Test(timeout = 100)
       public void timeoutArrayTest()
       {
           int arr[]={1,2,3,4,5};
           for(int i=0;i<1000000;i++)
           {
               arr[0]=i;
               Arrays.sort(arr);
           }
       }
}
