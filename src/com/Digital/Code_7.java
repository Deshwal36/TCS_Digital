package com.Digital;
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
33. Search in Rotated Sorted Array

 */
public class Code_7 {

    public static void main(String[] args) {

        int[] nums=new int[]{4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }

    static int findpivot(int[] nums){
        int s=0,e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[s]>nums[mid]){
                //left
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return s;
    }

    static int binarySearch(int[] nums,int s,int e,int target){

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return -1;
    }
    static int search(int[] nums, int target) {

        int m=findpivot(nums);
        int ans=-1;
        if(target<=nums[m]){
            ans=binarySearch(nums,0,m,target);
        }else{
            ans=binarySearch(nums,m+1,nums.length-1,target);
        }


        return ans;

    }

}
