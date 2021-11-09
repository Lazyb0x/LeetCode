package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution31 {
    public void nextPermutation(int[] nums) {
        int t = nums.length - 1;
        for (; t >= 0; t--) {
            if (t == 0) {
                break;
            }
            if (nums[t] > nums[t - 1]) {
                break;
            }
        }

        int p = t - 1;
        if (p >= 0) {
            int pNum = nums[p];
            int gp = findFirstGreaterPos(pNum, nums, t);
            int gpNum = nums[gp];

            nums[p] = gpNum;
            nums[gp] = pNum;

        }
        reverse(nums, t);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int pos) {
        int left = pos, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private int findFirstGreaterPos(int x, int[] nums, int pos) {
        int rp = pos;
        int tmp = nums[pos];
        for (; pos < nums.length; pos++) {
            int num = nums[pos];
            if (num > x && num <= tmp) {
                tmp = num;
                rp = pos;
            }
        }
        return rp;
    }


}

public class Q031_Next_Permutation {

    public static void main(String[] args) {
        int[] nums = {1};

        var solution31 = new Solution31();
        solution31.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));

//        test(1, 2, 2, 3);
    }

    public static void test(int... nums) {
        List<Integer> l = new ArrayList<>();
        for (int num : nums) {
            l.add(num);
        }
        a(new ArrayList<>(), l);

    }

    public static void a(List<Integer> l, List<Integer> r) {
        if (r.size() == 0) {
            System.out.println(l);
        }
        for (int i = 0; i < r.size(); i++) {
            var newL = new ArrayList<>(l);
            var newR = new ArrayList<>(r);
            newL.add(newR.get(i));
            newR.remove(i);
            a(newL, newR);
        }
    }

    public static void swap(List<Integer> list, int a, int b) {
        int tmp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tmp);
    }

}
