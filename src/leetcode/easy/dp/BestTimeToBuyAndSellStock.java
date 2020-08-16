package leetcode.easy.dp;

/**
 * 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxPro){
                maxPro = prices[i] - minPrice;
            }
        }
        return maxPro;
    }
    public static int process(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int[] dp = new int[prices.length];
        int minPrices = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrices) {
                minPrices = prices[i];
            }
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrices);
        }
        return dp[prices.length - 1];
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(process(nums));
    }
}
