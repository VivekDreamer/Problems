
public class BestTimeToBuyAndSellStockLeetCode121 {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {2,4,1}));
	}
	public static int maxProfit(int[] prices) {
		
	    //2,4,1  max = 1;	
			int profit = 0;
	        int max = prices[prices.length - 1];
	        for(int i = prices.length - 2; i >= 0; i--) {
	            profit = Math.max(profit, max - prices[i]);
	            max = Math.max(max, prices[i]);
	        }
	        return profit;
    }
	
//	public static int maxProfit1(int[] prices) {
//		int min = prices[0];
//		int minIndex = 0;
//		for(int i = 1; i < prices.length; i++) {
//			if(min > prices[i]) {
//				min = prices[i];
//				minIndex = i;
//			}
//			
//		}
//		System.out.println(minIndex +" hii");
//		if(min == prices[prices.length-1])return 0;
//		int max = prices[minIndex];
//		for(int j = minIndex+1; j < prices.length; j++) {
//			if(prices[j] > max)
//				max = prices[j];
//		}
//		System.out.println("hello");
//		System.out.println(max + "    hii max");
//		System.out.println(min);
//	    return max - min;
//	}
	}

