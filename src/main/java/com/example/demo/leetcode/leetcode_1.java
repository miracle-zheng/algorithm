package com.example.demo.leetcode;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode_1 {

    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            //定义tempMap，缓存数组所有元素，key为值，value为下标
            Map<Integer, Integer> tempMap = new HashMap<>();
            for (int i = 0 ; i < nums.length; i++){
                int mapKey = target - nums[i];

                if (tempMap.containsKey(mapKey)) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = tempMap.get(mapKey);
                    return result;
                }
                tempMap.put(nums[i], i);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        

        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;

        System.out.println(Arrays.toString(Solution.twoSum(nums, 6)));
    }

}
