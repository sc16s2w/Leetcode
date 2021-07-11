package com.company.Array;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
//简单想法，平方存储之后直接排序。 比较好的办法，双指针,用比较的方法存树
public class Code_977 {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int num = nums.length - 1;
        int[] result = new int[nums.length];
        for (i = 0, j = nums.length - 1, num = nums.length- 1; i <= j;) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                result[num] = nums[j] * nums[j];
                j--;
            }
            else {
                result[num] = nums[i] * nums[i];
                i++;
            }
            num--;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(Integer.valueOf((int) 1.9));
    }
}
