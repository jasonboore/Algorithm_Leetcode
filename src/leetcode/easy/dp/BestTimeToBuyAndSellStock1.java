package leetcode.easy.dp;

/**
 * 买卖股票的最佳时机(多笔交易)
 */
public class BestTimeToBuyAndSellStock1 {
    public static int maxProfit(int[] prices) {
        return process(prices, 0);
    }
    public static int process(int[] prices, int start) {
        if(prices.length - start <= 1) {
            return 0;
        }
        int low = prices[start];
        int maxPro = 0;
        int i = start + 1 ;
        for (; i < prices.length; i++) {
            if(prices[i] >= low) {
                maxPro += prices[i] - low;
                low = prices[i];
            }else {
                break;
            }
        }
        return maxPro + process(prices, i);
    }

    public static void main(String[] args) {
        int[] nums = {2,7,6,1,4,3,5,6};
        System.out.println(maxProfit(nums));
    }
}
