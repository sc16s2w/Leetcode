package Array;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *  不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
 */
//快慢指针
public class Code_26 {
    public int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 1;
        for(fast =1; fast<nums.length;fast++){
            if(nums[fast]> nums[fast-1]){
                nums[slow++] = nums[fast];
            }
        }
        return slow;

    }
}
