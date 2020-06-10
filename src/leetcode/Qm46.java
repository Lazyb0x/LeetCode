package leetcode;

import java.util.Arrays;

class Solutionm46 {

    int count = 0;

    public int translateNum(int num) {
        // 转换成 int 数组
        int[] a = new int[10];
        int pos = 0;
        while (num != 0) {
            a[pos++] = num % 10;
            num = num / 10;
        }

        count = 0;
        count(a, pos - 1);
        return count;
    }

    public void count(int[] a, int pos) {
        if (pos < 0) {

            count++;
            return;
        }

        count(a, pos - 1);
        // a[pos] != 0 才不会把 "06" 这种当成数字
        if (pos > 0 && a[pos]!=0) {
            int val = a[pos] * 10 + a[pos - 1];
            if (val < 26) {
                count(a, pos - 2);
            }
        }
    }
}

public class Qm46 {

    public static void main(String[] args) {
        Solutionm46 s = new Solutionm46();
        int n = s.translateNum(303030);
        System.out.println(n);
    }
}
