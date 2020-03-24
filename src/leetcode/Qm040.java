package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
// 面试题40. 最小的k个数

class Solutionm40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (pq.size()<k) {
                pq.offer(arr[i]);
            }
            else {
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        
        int[] a = new int[pq.size()];
        for (int i=0; !pq.isEmpty(); i++) {
            a[i] = pq.poll();
        }
        
        return a;
    }
}

public class Qm040 {
    public static void main(String[] args) {
        int[] a = {3,2,1};
        Solutionm40 s = new Solutionm40();
        int[] res = s.getLeastNumbers(a, 2);
        System.out.println(Arrays.toString(res));
    }
}
