package com.Digital;
/*
https://leetcode.com/problems/find-in-mountain-array/
1095. Find in Mountain Array
A/C

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

/*public class Code_6 {

    public int findpos(MountainArray mountainArr){
        int s=0,e=mountainArr.length()-1;

        while(s<e){
            int mid=s+(e-s)/2;

            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return e;
    }

    public int incbinarySearch(MountainArray mountainArr,int s,int e,int target){

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public int decbinarySearch(MountainArray mountainArr,int s,int e,int target){

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int m=findpos(mountainArr);

        int ans=incbinarySearch(mountainArr,0,m,target);

        if(ans==-1){
            ans=decbinarySearch(mountainArr,m+1,mountainArr.length()-1,target);
        }

        return ans;

    }
}
*/