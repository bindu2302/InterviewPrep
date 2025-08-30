//Maximum profit is: 5

//prices[i] - minPrice → profit if I buy at the cheapest price so far and sell today.
//The program keeps checking this at every day to find the maximum possible profit.
//
//👉 So for {7,1,5,3,6,4}, best is:
//
//Buy at 1 (day 1)
//
//Sell at 6 (day 4)
//
//Profit = 6 - 1 = 5. ✅

package Array_EasyProblems;

public class StockBuyAndSell {

	public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<n; i++) {
        	if(prices[i] < minPrice) {
        		minPrice = prices[i];
        	}else {
        		maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        	}
        }
        System.out.println("Maximum profit is: " + maxProfit);
	}
}
