package com.company.Hashset;

import java.util.HashMap;

/**
 * 给定四个包含整数的数组A , B , C , D ,计算有多少个元组 (i, j, k, l)使得A[i] + B[j] + C[k] + D[l] = 0。
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过2^31 - 1
 */
public class Code_454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            for (int j = 0; j<nums2.length;j++){
                int sum = nums1[i]+nums2[j];
                if(store.containsKey(sum)) store.put(sum,store.get(sum)+1);
                else store.put(sum,1);
            }
        }
        int count = 0;
        for(int i = 0;i<nums3.length;i++) {
            for (int j = 0; j < nums4.length; j++) {
                int result = -(nums3[i] + nums4[j]);
                if (store.containsKey(result)) count+=store.get(result);
            }

        }
        return count;

    }
}
