//41. 缺失的第一个正数
//桶排序，并且在原数组上修改
package leetcode;

import java.util.Arrays;

class Solution41 {
    public int firstMissingPositive(int[] nums) {
        for (int i=0; i<nums.length; i++) {
        	if (nums[i]-1!=i) {
        		while (nums[i]>=1 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]) {
        			int tmp = nums[i];
        			int tmp2 = nums[i]-1;
            		nums[i] = nums[nums[i]-1];
            		nums[tmp2] = tmp;
        		}
        	}
        }
        int val = nums.length+1;
        for (int i=0; i<nums.length; i++) {
        	if (nums[i]-1!=i) {
        		val = i+1;
        		break;
        	}
        }
//        System.out.println(Arrays.toString(nums));
        return val;
    }
}

public class Q041 {
	public static void main(String[] args) {
		int[] nums = {1,1};
		int val = new Solution41().firstMissingPositive(nums);
		System.out.println(val);
	}
}
