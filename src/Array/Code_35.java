package Array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
//返回左边的标值
public class Code_35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            if(nums[middle]<target)
                left = middle+1;
            else if(nums[middle]>target)
                right = middle-1;
            else{
                return middle;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int[] hh = new int[]{5,7,7,8,8,10};
        System.out.println(searchInsert(hh,8));
    }

}
