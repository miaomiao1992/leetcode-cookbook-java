package leetcode.Test001_TwoSum;

import java.util.Arrays;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element
//twice.
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1]
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4},5)));
    }

    public static int[] twoSum(int nums[], int target) {
        int output[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
}
