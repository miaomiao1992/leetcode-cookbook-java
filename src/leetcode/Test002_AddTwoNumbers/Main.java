package leetcode.Test002_AddTwoNumbers;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
//        reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked
//        list.
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//        Example:
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println(addTwoNumbers(
                Arrays.asList(new Integer[]{2, 4, 3}),
                Arrays.asList(new Integer[]{5, 6, 4})
        ).toString());

        System.out.println(addTwoNumbers(
                Arrays.asList(new Integer[]{9, 9, 9,9,9}),
                Arrays.asList(new Integer[]{1})
        ).toString());
    }

    public static LinkedList<Integer> addTwoNumbers(List<Integer> input1, List<Integer> input2) {
        LinkedList<Integer> temp1 = new LinkedList<>();
        for (int i = input1.size() - 1; i >= 0; i--) {
            temp1.add(input1.get(i));
        }

        Double rs = 0.0;
        for (int i = 0; i < temp1.size(); i++) {
            rs =rs+ Math.pow(10.0, i) * temp1.get(i);
        }

        LinkedList<Integer> temp2 = new LinkedList<>();
        for (int i = input2.size() - 1; i >= 0; i--) {
            temp2.add(input2.get(i));
        }

        for (int i = 0; i < temp2.size(); i++) {
            rs =rs+ Math.pow(10.0, i) * temp2.get(i);
        }

        LinkedList<Integer> output=new LinkedList<>();
        String sum=String.valueOf(rs.intValue());
        for(int i=sum.length()-1;i>=0;i--)
        {
            output.add(Integer.valueOf(sum.substring(i,i+1)));//左闭右开
        }
        return output;
    }
}
