package leetcode.Test0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given a string, find the length of the longest substring without repeating characters.
//
//        Example 1:
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//
//
//        Example 2:
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//
//
//        Example 3:
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not
//        a substring.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(longestSubstringWithoutRepeatingCharacters(sc.nextLine()));
        }
    }

    //滑动窗口算法 todo
    public static int longestSubstringWithoutRepeatingCharacters02(String string) {
        int longest = 0;
        return longest;
    }

    //暴力解法
    public static int longestSubstringWithoutRepeatingCharacters(String string) {
        int longest = 0;
        for (int i = 0; i < string.length(); i++) {
            int j = longest(string.substring(i));
            if (j > longest) {
                longest = j;
            }
        }
        return longest;
    }

    public static int longest(String string) {
        Set<String> set = new HashSet<>();
        int length = 0;
        for (int i = 0; i < string.length(); i++) {
            String s = string.substring(i, i + 1);
            if (!set.contains(s)) {
                set.add(s);
                length++;
            } else {
                return length;
            }
        }
        return length;
    }

}
