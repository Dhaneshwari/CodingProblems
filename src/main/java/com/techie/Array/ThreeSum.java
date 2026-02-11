package com.techie.Array;

import java.util.*;

/*
  1.sort the array
  hold i ,j k position
  int i=0;
  j=i+1;
  k=nums.length-1
  iterate j<k
  check inside loop
  int sum = arr[j]+arr[k];
  if(sum = -num[i]){
  add in the set
  j++
  else
  if(sum>-)
  k--
  else if(sum<-nums[i]){
  j++;
  }
  }

 */

public class ThreeSum {
    public static void main(String[] args) {
       int [] nums = {-1,0,1,2,-1,-4};
       System.out.println("tHREE Sum : " + threeSum(nums));
    }
    public static List<List<Integer>>threeSum(int[]nums){
        Set<List<Integer>> res = new HashSet<>();

        if(nums.length == 0){ return new ArrayList<>(res);}

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k= nums.length-1;

            while(j<k){
                int sum = nums[j]+nums[k];
                if(sum == -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                }
                else if(sum> - nums[i]){
                    k--;
                }
                else if (sum < - nums[i]){
                    j++;
                }

            }

        }
return new ArrayList<>(res);
    }
}
