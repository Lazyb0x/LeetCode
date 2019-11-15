package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
    	if (intervals.length==0) return intervals;
        for (int i=0; i<intervals.length-1; i++) {
        	for (int j=i+1; j<intervals.length; j++) {
        		if (intervals[i][0]>intervals[j][0]) {
        			swap(intervals, i, j);
        		}
        	}
        }
        
//        for (int[] x : intervals) {
//        	System.out.println(Arrays.toString(x));
//        }
        
        List<int[]> list = new ArrayList<int[]>();
        int[] tmp = Arrays.copyOf(intervals[0], intervals[0].length);
        for (int i=0; i<intervals.length; i++) {
        	if (tmp[1]>=intervals[i][0]) {
        		if (tmp[1]<intervals[i][1]) {
        			tmp[1] = intervals[i][1];
        		}
        	}
        	else {
        		list.add(tmp);
        		tmp = Arrays.copyOf(intervals[i], intervals[i].length);
        	}
        }
        list.add(tmp);
        
        int[][] newint = new int[list.size()][];
        for (int i=0; i<list.size(); i++) {
        	newint[i] = list.get(i);
        }
        return newint;
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
		Solution56 s = new Solution56();
		int[][] intervals = {{1,4},{2,3}};
		int[][] newint = s.merge(intervals);
		for (int[] x : newint) {
        	System.out.println(Arrays.toString(x));
        }
	}
}
