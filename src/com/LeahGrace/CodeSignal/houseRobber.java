package com.LeahGrace.CodeSignal;

import java.util.HashMap;

public class houseRobber {


    int solution(int[] nums) {
        int sumOdd = 0;
        int sumEven = 0;

        HashMap map = new HashMap<>();
        ListNode<Integer> head = null;

        if (nums.length == 0) {
            System.out.println("length is " + nums.length);
            return 0;
        }

        if (nums.length == 1) {
            System.out.println("length is " + nums.length);
            return nums[0];
        }

        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i += 2) {
                sumEven += nums[i];
            }
            for (int j = 1; j < nums.length; j += 2) {
                sumOdd += nums[j];
            }
            return (sumEven > sumOdd) ? sumEven : sumOdd;
        }

        return 0;
    }
}