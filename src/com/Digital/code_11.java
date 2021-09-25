package com.Digital;
/*
https://leetcode.com/problems/maximum-sum-circular-subarray/
918. Maximum Sum Circular Subarray

 */
public class code_11 {

    public static void main(String[] args) {

        int[] numc = new int[]{-1,-9,-4};
        System.out.println(maxSubSum(numc));

    }

    static int maxSubSum(int[] nums) {

        if (nums.length == 0)
            return 0;

        int max = max_Kaden(nums);
        //System.out.println("max:"+max);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            //nums[i] *= -1;
        }

        int min = min_Kaden(nums);
//        System.out.println("min:"+min);
//        System.out.println("total:"+total);
        if (total == min)
            return max;
        return Math.max(max, total - min);

    }

    //kaden's Algo
    static int max_Kaden(int[] nums) {

        if (nums.length == 0)
            return 0;

        int max = nums[0];
        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {

            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }

        return max;
    }

    //kaden's Algo
    static int min_Kaden(int[] nums) {

        if (nums.length == 0)
            return 0;

        int min = nums[0];
        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {

            cur = Math.min(nums[i], cur + nums[i]);
            min = Math.min(min, cur);
        }

        return min;
    }



}
