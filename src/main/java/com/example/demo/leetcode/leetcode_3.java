package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class leetcode_3 {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int right = 0;
            int result = 0;
            //字符和位置的map
            Map<Character, Integer> CharPosMap = new HashMap<>();
            //循环体为右指针向右
            for (; right < s.length(); right++) {
                //如果右边指针已经存在了，则把左指针位置调整为第一次出现此右指针位置再向右移动移动
                if (CharPosMap.containsKey(s.charAt(right))){
                    //如果左指针已经大于此位置了，证明是遗留数据，不用理会
                    if (left <= CharPosMap.get(s.charAt(right))){
                        left = CharPosMap.get(s.charAt(right)) + 1;
                    }
                }

                if (right - left + 1 > result) {
                    result = right - left + 1;
                }

                CharPosMap.put(s.charAt(right), right);

            }

            return result;
        }
    }


}
