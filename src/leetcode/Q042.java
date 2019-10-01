package leetcode;

import java.util.Arrays;

class Solution42 {
    public int trap(int[] height) {
    	int hp = 0;		//最大值的位置
    	int hh = 0;		//最大值的值
    	int maxh = 0;	//积水的最高水位
    	boolean isIncrease = false;
    	int[] volume = new int[height.length];
    	
    	for (int i=0; i<height.length; i++) {
    		int h = height[i];
    		int nexth = i==height.length-1 ? 0 : height[i+1];
    		if (h<nexth) {
    			isIncrease = true;
    			maxh = nexth>hh ? hh : nexth;
    		}
    		else if(h>nexth) {
    			if (isIncrease) {	//水位经过峰值，不会变了，保存
    				for (int j=hp; j<i; j++) {
        				int vh = maxh>height[j] ? maxh-height[j] : 0;	//选取积水和当前值中最小的
        				volume[j] = volume[j]>vh ? volume[j] : vh;		//选取已有数据和vh中最大的
        			}
    				maxh = 0;
    			}
    			isIncrease = false;
    		}
    		if (h>hh) {
    			//最大值要更新了，保存水位
    			for (int j=hp; j<i; j++) {
    				int vh = maxh>height[j] ? maxh-height[j] : 0;
    				volume[j] = volume[j]>vh ? volume[j] : vh;
    			}
    			hh = h;
    			hp = i;
    		}
    	}
    	
    	int v = 0;
    	for (int t : volume) v += t;
		System.out.println(Arrays.toString(volume));
		return v;
    }
}

public class Q042 {
	public static void main(String[] args) {
		Solution42 s = new Solution42();
		int[][] h = {
				{0,1,0,2,1,0,1,3,2,1,2,1},		//6
				{1,0,4,2,3,4,0,3},				//7
				{4,9,4,5,3,2},					//1
				{8,2,8,9,0,1,7,7,9},			//27
				{5,5,4,7,8,2,6,9,4,5}			//10
		};
		
		for (int[] a : h) {
			int v = s.trap(a);
			System.out.println(v);
		}
		
//		int v = s.trap(h[4]);
//		System.out.println(v);
	}
}
