package Array;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *  不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
//解题思路快慢指针 只要不相同，就让快的等于
public class Code_27 {
    public static int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        for(fast = 0;fast<nums.length;fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args){
        System.out.println(removeElement(new int[]{1,3,4,5},3));

    }


}
