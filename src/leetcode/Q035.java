package leetcode;

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        boolean isInsert = false;
    	for(int i=0;i<nums.length;i++) {
        	if (target<=nums[i]) {
        		pos = i;
        		isInsert = true;
        		break;
        	}
        }
    	return isInsert ? pos : nums.length;
    }
}

public class Q035 {
	
	public static void main(String[] args) {
		Solution35 s = new Solution35();
		int[] a = {1,2,3,6,7,9};
		System.out.println(s.searchInsert(a, 0));
	}
}
