package org.example;

import java.util.StringTokenizer;

public class ReverseString
{
    public static void main(String[] args) {

        reverseString("my eman is");
    }
        public static String reverseString(String str)
        {
            StringBuilder sb=new StringBuilder();

            StringTokenizer tokenizer=new StringTokenizer(str,"");

            while (tokenizer.hasMoreTokens())
            {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append(tokenizer.nextToken());

                stringBuilder.reverse();
                sb.append(stringBuilder);
                sb.append("");

            }
            return sb.toString();
        }
}
