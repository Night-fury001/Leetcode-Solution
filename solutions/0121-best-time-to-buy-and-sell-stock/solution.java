class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i : prices){
            if(i < min) min = i;
            else{
                int profit = i - min;
                max = (profit < max)?max : profit;
            }
        }
        return max;
    }
}
