class Solution {
    public int maxProfit(int[] prices) {

        int profit= Integer.MIN_VALUE;
        int minPrice=Integer.MAX_VALUE;

        for(int i =0;i<prices.length;i++){
         minPrice=Math.min(minPrice,prices[i]);
         int temp =prices[i]-minPrice;
         profit = Math.max(temp,profit);
         
        }

        return profit<0?0:profit;
        
    }
}
