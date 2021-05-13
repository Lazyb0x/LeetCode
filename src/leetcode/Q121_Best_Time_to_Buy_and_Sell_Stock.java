package leetcode;

/**
 * 121. 买卖股票的最佳时机
 * <p>
 * <a>https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/</a>
 * </p>
 */
class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int cur = prices[i];
            int profit = cur - min;
            if (maxProfit < profit) {
                maxProfit = profit;
            }

            if (cur < min) {
                min = cur;
            }
        }
        return maxProfit;
    }
}

public class Q121_Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int[] nums2 = { 7, 6, 4, 3, 1 };
        Solution121 s = new Solution121();
        System.out.println(s.maxProfit(nums2));
    }

}
