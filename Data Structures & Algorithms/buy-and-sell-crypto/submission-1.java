class Solution {
    public int maxProfit(int[] prices) {
        
        int maximum = 0;
        int minimum = prices[0];
        int n = prices.length;

        for(int i = 1; i < n; i++) {
            
            minimum = Math.min(minimum, prices[i]);
            maximum = Math.max(maximum, prices[i] - minimum);
        }

        return maximum;
    }
}
