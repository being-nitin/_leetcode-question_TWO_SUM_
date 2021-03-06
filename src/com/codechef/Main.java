package com.codechef;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    // https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] nums = {3,2,4,8,7};
        System.out.println(Arrays.toString(sum(nums,15)));
    }
    public static int[] sum(int[] nums, int target){
        for(int i=0;i<nums.length-1;i++){
            for (int j =i+1;j<nums.length;j++) {
                if ((nums[i]+nums[j])==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
}
/*
   In this outer loop will be taken from i=0 till n-2 and the inner loop will
   be taken from j=i+1 to til n-1, because in the end every element will be compared
   till n-2th element.
 */