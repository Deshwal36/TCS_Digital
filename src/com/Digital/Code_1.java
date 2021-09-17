package com.Digital;
/*
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered.
Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K

Output :
40 50 10 20 30

 */

import java.util.Scanner;
import java.util.Arrays;
public class Code_1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a	= new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        a = rotate(a,k);
       /* for(int i : a){
            System.out.println(i);
        }*/
        System.out.println(Arrays.toString(a));

    }

    static int[] rotate(int[] a, int k){
        int n = a.length;
        int[] b = new int[n];

        for(int i=0;i<n;i++)
        {
            b[(i+k)%n]=a[i];
        }
        return b;
        //a[]=[10,20,30,40,50]
        //     0	1  2  3  4
        //    a[2]=a[0]

    }
}