package com.example.demo.leetcode;

import java.lang.reflect.Array;

public class leetcode_322 {

    class Solution {
        public int coinChange(int[] coins, int amount) {
            //定义dp数组，dp[i]的值就是最少需要多少枚硬币组成
            int[] dp = new int[amount+1];
            //初始化dp0 =0
            dp[0] = 0;

            for (int i = 1 ;i <= amount; i++){
                dp[i] = Integer.MAX_VALUE;
                for (int j = 0 ; j < coins.length ;j++){

                    if (i-coins[j] >= 0 && dp[i-coins[j]] != Integer.MAX_VALUE) {
                        int temp = dp[i-coins[j]]+1;
                        if (temp < dp[i]) {
                            dp[i] = temp;
                        }
                    }
                }
            }
            return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
        }
    }

}
