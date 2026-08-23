class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length,maxProfit = 0, runningMin = prices[0];
        for(int i=1;i<n;i++){
            if(runningMin < prices[i]){
                maxProfit = Math.max(prices[i]-runningMin,maxProfit);
            }else{

                runningMin = prices[i];
            }
        }
        return maxProfit;
    }
}