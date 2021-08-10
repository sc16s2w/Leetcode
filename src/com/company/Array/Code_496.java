package com.company.Array;

public class Code_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j + 1;
                    break;
                }
                result[i] = -1;
            }
            for (int j = index; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                }
                result[i] = -1;
            }
        }
        return result;
    }

    //其实可以用hashset和单调栈来进行操作

}
