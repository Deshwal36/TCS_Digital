package com.Digital;
/*
Octal to binary conversion

 */
import java.util.Scanner;

public class Code_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=Integer.parseInt(String.valueOf(n),8);
        //System.out.println(d);
        System.out.println(Integer.toString(d,2));

    }

}
