package Array;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
//当sum大于等于target的时候就可以开始收缩窗口了
public class Code_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        //定义一个初使的最大值
        int result = Integer.MAX_VALUE;
        for(;right<nums.length;right++){
            sum +=nums[right];
            while(sum>=target){
                result = Math.min(right-left+1,result);
                sum-=nums[left++];
            }
        }
        if(result==Integer.MAX_VALUE) result = 0;
        return result;

    }
}
