package com.company.meituan;

public class Code_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int size = m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[size] = nums1[i];
                i--;
            }
            else{
                nums1[size] = nums2[j];
                j--;
            }
            size--;
        }
        if(j>=0){
            for(int temp = j;temp>=0;temp--){
                nums1[size] = nums2[temp];
                size--;
            }
        }
        if(i>=0){
            for(int temp = i;temp>=i;temp--){
                nums1[size] = nums1[i];
                size--;
            }
        }

    }
}
