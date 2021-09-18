package com.Digital;
/*
Find position of an element in a sorted array of infinite numbers
 */
public class Code_4 {

    public static void main(String[] args) {

        int[] arr=new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int ans=findpos(arr,170);
        if(ans==-1){
            System.out.println("No element");
        }else{
            System.out.println("Index :"+ ans);
        }
    }

    static int findpos(int[] arr,int target){
        int start=0;
        int end=1;

        if(target==arr[start]){
            return start;
        }

        while(target>arr[start]){
            start=end;
            if(2*end>arr.length-1){
                end=arr.length-1;
            }else {

            end*=2;
            }

        }
        return binarySearch(arr,start,end,target);

    }

    static int binarySearch(int[] arr,int s,int e,int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
