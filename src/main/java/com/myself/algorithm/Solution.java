package com.myself.algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        char[] s1CharArr = s1.toCharArray();

        // 遍历所有的交换组合
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                int[] tempArr = new int[s1.length()];
                for (int k = 0; k < s1.length(); k++) {
                    tempArr[k] = k;
                }
                int temp = tempArr[i];
                tempArr[i] = tempArr[j];
                tempArr[j] = temp;

                StringBuilder builder = new StringBuilder();
                for (int k : tempArr) {
                    builder.append(s1CharArr[k]);
                }

                if (builder.toString().equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        Arrays.sort(nums1);
        Integer[] ids = IntStream.range(0, n).boxed().toArray(Integer[]::new);
        Arrays.sort(ids, (i, j) -> nums2[i] - nums2[j]);
        int left = 0, right = n - 1;
        for (Integer x : nums1)
            ans[x > nums2[ids[left]] ? ids[left++] : ids[right--]] = x;
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.areAlmostEqual("bank", "kanb");

    }
}
