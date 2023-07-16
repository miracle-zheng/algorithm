package com.example.demo.leetcode;

public class leetcode_88 {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] result = new int[m+n];
            int i = 0; int j = 0;
            for (int temp = 0; temp < m+n ; temp++){
                //nums1已经取完
                if (i >= m) {
                    result[temp] = nums2[j];
                    j++;
                    continue;
                }
                if (j >= n) {
                    result[temp] = nums1[i];
                    i++;
                    continue;
                }
                if (nums1[i] <= nums2[j]){
                    result[temp] = nums1[i];
                    i++;
                }else {
                    result[temp] = nums2[j];
                    j++;
                }
            }
            System.arraycopy(result, 0, nums1, 0, m+n);
        }
    }

}
