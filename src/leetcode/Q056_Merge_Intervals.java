package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        for (int i=0; i<intervals.length-1; i++) {
        	for (int j=i+1; j<intervals.length; j++) {
        		if (intervals[i][0]>intervals[j][0]) {
        			swap(intervals, i, j);
        		}
        	}
        }
        
        List<int[]> list = new ArrayList<int[]>();
    }
    
    public void swap(int[][] intervals, int i, int j) {
    	int tmp;
    	tmp = intervals[i][0];
    	intervals[i][0] = intervals[j][0];
    	intervals[j][0] = tmp;
    	
    	tmp = intervals[i][1];
    	intervals[i][1] = intervals[j][1];
    	intervals[j][1] = tmp;
    }
}

public class Q056_Merge_Intervals {
	public static void main(String[] args) {
		
	}
}
