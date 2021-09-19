package com.Digital;

import java.util.Arrays;

/*
https://leetcode.com/problems/product-of-array-except-self/
238. Product of Array Except Self

 */
public class Code_8 {

    public static void main(String[] args) {

        int[] nums=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {

        int[] leftpro=new int[nums.length];
        leftpro[0]=1;
        for(int i=1;i<leftpro.length;i++){
            leftpro[i]=leftpro[i-1]*nums[i-1];
        }
        int[] rightpro=new int[nums.length];
        rightpro[rightpro.length-1]=1;
        for(int i=rightpro.length-2;i>=0;i--){
            rightpro[i]=rightpro[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=leftpro[i]*rightpro[i];
        }

        return nums;
    }
}
