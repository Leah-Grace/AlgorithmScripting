package com.LeahGrace.CodeSignal;

import java.util.HashMap;

public class houseRobber {

        int solution(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            if (nums.length == 1) {
                return nums[0];
            }

            if (nums.length == 2) {
                return ((nums[0] >= nums[1]) ? nums[0] : nums[1]);
            }

            int[] cache = new int[nums.length];

            cache[0] = nums[0];
            cache[1] = Math.max(nums[1], cache[0]);

            for (int i = 2; i < nums.length; i++) {
                cache[i] = Math.max(nums[i] + cache[i - 2], cache[i - 1]);

            }

            int max = cache[0];
            for (int i : cache) {
                if (i >= max) {
                    max = i;
                }
            }

            return max;

        }
    }