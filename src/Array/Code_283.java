package Array;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
//快慢指针一起用
public class Code_283 {
    public static void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        for(fast = 0; fast<nums.length;fast++){
            if(nums[fast]!=0) nums[slow++] = nums[fast];
        }
        for(;slow<nums.length;slow++)
            nums[slow] = 0;
    }
    public static void main(String[] args){
        int[] hh = new int[]{0,1,0,3,12};
        moveZeroes(hh);


    }
}
