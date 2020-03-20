package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 面试题57 - II. 和为s的连续正数序列
// https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/

class Solutionm57 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();

        for (int i=1,j=1,sum=0; j<target; j++) {
            sum+=j;
            while(sum>target) {
                sum-=i;
                i++;
            }
            if (sum==target) {
                int[] tmp = new int[j-i+1];
                for (int k=0; k<tmp.length; k++) {
                    tmp[k] = k+i;
                }
                list.add(tmp);
            }
        }
        return list.toArray(new int[0][]);

    }
}

public class Qm057 {
    public static void main(String[] args) {
        Solutionm57 s = new Solutionm57();
        int[][] seq = s.findContinuousSequence(9);
        for(int[] nums : seq) {
            System.out.println(Arrays.toString(nums));
        }
    }
}
