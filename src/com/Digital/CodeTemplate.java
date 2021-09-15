package com.Digital;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodeTemplate {

    public static void sort(int @NotNull [] arr) {
        //Arrays.sort() uses quicksort O(n*2)

        ArrayList<Integer> ls = new ArrayList<>();
        for (int e : arr) {
            ls.add(e);
        }
        Collections.sort(ls);//Mergesort

        for (int i = 0; i < arr.length; i++)
            arr[i] = ls.get(i);

    }

    public static int gcd(int a, int b) {

        BigInteger i1 = new BigInteger(String.valueOf(a));
        BigInteger i2 = new BigInteger(String.valueOf(b));
        return i1.gcd(i2).intValue();

        //i1.isProbablePrime(1) : Prime_Check with BigInteger

           /* static  int gcd(int a,int b)
            {
                if(b==0)
                {
                    return a;
                }
                return gcd(b,a%b);
            }*/
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
        /*
        index = Arrays.binarySearch(arr,key)
        Arrays.toString(arr) : print 1D array
        Arrays.deepToString(arr) : print 2D array
         */


}
