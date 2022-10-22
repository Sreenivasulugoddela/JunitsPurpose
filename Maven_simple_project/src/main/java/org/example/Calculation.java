package org.example;

public class Calculation {


    public static void main(String[] args) {
        int arr[]={2,55,6,77,889};

        System.out.println(findMin(arr));
    }
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int findMin(int arr[])
    {
           int max = arr[0];
           for(int i=0;i<arr.length;i++)
           {
               if(max>arr[i])
               {
                   max=arr[i];
               }
            }
           return max;
    }


    public static int cube(int n)
    {
        return n*n*n;
    }
}
