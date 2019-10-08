//二分查找
package lintcode.offer;

class Solution159 {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length-1);
    }
    
    public int findMin(int[] nums, int left, int right) {
    	if (left==right || nums[left]<nums[right])
    		return nums[left];
    	int mid = (left+right)/2;
    	if (nums[mid]>=nums[left]) {// 能走到==的一定是长度为2
    		left = mid+1;
    	}
    	else {
    		right = mid;
    	}
    	
    	return findMin(nums, left, right);
    }
}

public class Q159_Find_Minimum_in_Rotated_Sorted_Array {
	public static void main(String[] args) {
		Solution159 s = new Solution159();
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		int[] nums2 = {2,3,1};
		System.out.println(s.findMin(nums2));
	}
}
