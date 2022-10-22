package org.example;

public class StringHelper
{

       public String stringTruncateA(String str)
       {
           if(str.length()<=2)
           {
               return str.replaceAll("A","");
           }

           String firstTwochars=str.substring(0,2);
           String minusTwoChars=str.substring(2);

           return firstTwochars.replaceAll("A","")+minusTwoChars;
       }

       public boolean areFirstAndLastTwoCharsAreSame(String str)
       {
           if(str.length()<=1)
           {
               return false;
           }
           if(str.length()<=2)
           {
               return true;
           }

           String first2chars=str.substring(0,2);
           String last2chars=str.substring(str.length()-2);
           return first2chars.equals(last2chars);
       }
}
