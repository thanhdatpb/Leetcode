package Top_Interview_150.BestTime_toBuy_andSellStock_121;


public class Solution {
    public int maxProfit(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;

        for (final int price : prices) {
            sellOne = Math.max(sellOne, holdOne + price);
            holdOne = Math.max(holdOne, -price);
        }
        return sellOne;
    }
}