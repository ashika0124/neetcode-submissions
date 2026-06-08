public class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] memo = new Integer[prices.length][2];
        return rec(prices, 0, false, memo);
    }

    private int rec(int[] prices, int i, boolean bought, Integer[][] memo) {
        if (i == prices.length) {
            return 0;
        }
        int b = bought ? 1 : 0;
        if (memo[i][b] != null) return memo[i][b];
        
        int res = rec(prices, i + 1, bought, memo);
        if (bought) {
            res = Math.max(res, prices[i] + rec(prices, i + 1, false, memo));
        } else {
            res = Math.max(res, -prices[i] + rec(prices, i + 1, true, memo));
        }
        return memo[i][b] = res;
    }
}