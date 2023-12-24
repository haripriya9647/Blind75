class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit =0;
        if(prices.length<=1)
          return 0;
        for(int i=1;i<prices.length;i++){
            int currprice = prices[i];
             maxProfit = Math.max(maxProfit,currprice-minPrice);
             minPrice = Math.min(minPrice,currprice);
        }
        return maxProfit;
    }
}