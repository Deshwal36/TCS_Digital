package com.Digital;
/*
https://leetcode.com/problems/maximum-product-subarray/
152. Maximum Product Subarray

*/

public class Code_9 {

    public static void main(String[] args) {

        int[] nums=new int[]{-3,0,1,-2};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sol=nums[0];

        int maxProduct=nums[0];
        int minProduct=nums[0];

        for(int i=1;i<nums.length;i++){

            int temp1=Math.max(maxProduct*nums[i],minProduct*nums[i]);

            int temp2=Math.min(maxProduct*nums[i],minProduct*nums[i]);

            maxProduct=Math.max(temp1,nums[i]);
            minProduct=Math.min(temp2,nums[i]);

            sol=Math.max(sol,maxProduct);
        }

        return sol;

    }
}
