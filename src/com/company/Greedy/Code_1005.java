package com.company.Greedy;

import java.util.stream.IntStream;

/**
 * 给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个索引 i并将 A[i] 替换为 -A[i]，然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）
 * 以这种方式修改数组后，返回数组可能的最大和。
 */
public class Code_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
                k--;
            }
            if(k<=0) break;
        }
        while(k>0){
            nums[nums.length-1] = -nums[nums.length-1];
            k--;
        }
        int result = 0;
        for(int i:nums){
            result+=i;
        }
        return result;
    }

}
