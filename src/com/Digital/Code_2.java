/*
Problem Description -:  Given two non-negative integers n1 and n2, where n1<n2. The task is to find the total number of integers in the range [n1, n2](both inclusive) which have no repeated digits.

Example:

Suppose n1=11 and n2=15.

There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.

 */

package com.Digital;

import java.util.HashSet;
import java.util.Set;

public class Code_2 {

    public static void main(String[] args) {
        int n1=101;
        int n2=200;

        int count=repeat(n1,n2);
        System.out.println(count);
    }

    static int repeat(int n1,int n2){
        int count=0;
        for(int i=n1;i<=n2;i++){

            if(unique(i)){
                count++;
            }
        }
        return  count;
    }

    static boolean unique(int num){
        Set<Integer> set=new HashSet<>();
        while(num>0){
            int d=num%10;
            if(set.contains(d)){
                return false;
            }else {
                set.add(d);
            }
            num=num/10;
        }
    return true;
    }

}

/*
Code Solution in python

def unique(n):

    a=set()
    while n>0:
        r=n%10
        if r in a:
            return False
        else:
            a.add(r)
        n=n/10
    return True

if __name__ == "__main__":
    n1=int(input())
    n2=int(input())
    count=0
    for i in range(n1,n2+1):
        if unique(i):
            count=count+1

    print(count)



 */
