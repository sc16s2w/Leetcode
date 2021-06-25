package Array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 */
//难点在于对两边求边界，我发现两种不同的方法求出的边界不一样
public class Code_34 {
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int left = 0;
        int right = nums.length-1;
        int leftindex = -1;
        int rightindex = -1;
        int[] result = new int[2];
        while (left<=right){
            int middle = (left+right)/2;
            if(nums[middle]<target)
                left = middle+1;
            else if(nums[middle]>target)
                right = middle-1;
            else{
                rightindex = middle;
                break;
            }
        }
        left = 0;
        right = nums.length;
        while (left<right){
            int middle = (left+right)/2;
            if(nums[middle]<target)
                left = middle+1;
            else if(nums[middle]>target)
                right = middle;
            else{
                leftindex = middle;
                break;
            }
        }
        System.out.println(leftindex);
        System.out.println(rightindex);
        if(leftindex>rightindex){
            result[0] = rightindex;
            result[1] = leftindex;
        }
        result[0] = leftindex;
        result[1] = rightindex;
        return result;
    }
    public static void main(String[] args){
        int[] hh = new int[]{1,2,2};
        System.out.println(searchRange(hh,2)[0]+" "+searchRange(hh,2)[1]);
    }
}
