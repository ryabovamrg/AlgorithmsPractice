class Solution {
    public int maxProfit(int[] prices) {

        // [50, 20, 21, 1]
        // min = 50, minPtr = 0
        // max = 50, maxPtr = 0
        // currProfit = 0

        int min    = prices[0];
        int minPtr = 0;
        int currProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
                minPtr = i;
            } else{
                if (minPtr < i)
                    currProfit = Math.max(prices[i] - prices[minPtr], currProfit);
            }
        }
         
        // [150, 0, 1, 2, 13, 21, 0, 1, 100, 69]

        // [9, 6, 8, 1, 2]

        return currProfit;
    }
}