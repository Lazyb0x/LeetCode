package leetcode;

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0,i2 = 0,i3=0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l3 = l1 + l2;
        int[] nums3 = new int[l3];
        while(i1<l1||i2<l2) {
        	if(i2<l2&&i1<l1) {
        		if(nums1[i1]>nums2[i2]) {
        			nums3[i3++] = nums2[i2++];
        		}
        		else {
        			nums3[i3++] = nums1[i1++];
        		}
        	}
        	else if(i2>=l2) {
        		nums3[i3++] = nums1[i1++];
        	}
        	else if(i1>=l1) {
        		nums3[i3++] = nums2[i2++];
        	}
        	
        }
        
//        for(int i=0;i<nums3.length;i++) {
//        	System.out.println(nums3[i]);
//        }
        
        double mid;
        
        if(l3%2==1) {
        	mid = nums3[(l3-1)/2];
        }
        else {
        	mid = ((float)((nums3[l3/2]) + nums3[l3/2-1]))/2;
        }
        
        return mid;
    }
}

public class Q004 {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] a = {4,5,7,22};
		int[] b = {1,2,3,6};
		
		double num = s.findMedianSortedArrays(a, b);
		System.out.println(num);
	}
}
