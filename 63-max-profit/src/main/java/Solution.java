/**
 * <p>
 * 剑指 Offer 63. 股票的最大利润
 * https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/21
 */
class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) return 0;

        int lastBuyIn = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            /**
             * We have 2 choices here:
             *
             * 1) Sell here
             * currentProfit = nums[i] - lastBuyIn
             *
             * 2) Buy in here (start a new transaction)
             *
             */
            if (prices[i] > lastBuyIn) {
                maxProfit = Math.max(maxProfit, prices[i] - lastBuyIn);
            } else {
                lastBuyIn = prices[i];
            }
        }

        return maxProfit;
        
    }
}
