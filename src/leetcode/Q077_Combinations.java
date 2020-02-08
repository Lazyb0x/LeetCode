package leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution77 {
    List<List<Integer>> combs;
    
    public List<List<Integer>> combine(int n, int k) {
        combs = new LinkedList<List<Integer>>();
        if (k==0) return combs;
        LinkedList<Integer> comb = new LinkedList<Integer>();
        comb(comb, n, k, 1, 1);
        return combs;
    }
    
    private void comb(LinkedList<Integer> comb, int n, int k, int p, int depth) {
        if (depth>k) {
            List<Integer> tmp = new LinkedList<Integer>(comb);
            combs.add(tmp);
            return;
        }
        
        for (int i=p; i<=n; i++) {
            comb.addLast(i);
            comb(comb, n, k, i+1, depth+1);
            comb.removeLast();
        }
    }
}

public class Q077_Combinations {
    public static void main(String[] args) {
        Solution77 s = new Solution77();
        System.out.println(s.combine(5, 3));
        System.out.println(s.combine(4, 3));
    }
}
