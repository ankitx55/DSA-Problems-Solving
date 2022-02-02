public class bestTimeToBuySellStock {
    public static void main(String[] args) {

        int[] prices = {1,2,3,4,5,6,7,8,9};

        int profit = 0;
        int maxProfit = 0;

        for(int i=0; i<prices.length-1; i++)
        {
            for(int j=i+1; j<prices.length  ; j++)
            {
                if(prices[i]<prices[j]){
                    profit = prices[j]-prices[i];

                    if(maxProfit<profit)
                    {
                        maxProfit = profit;
                    }
                }
            }
        }

        System.out.println(maxProfit);

    }
}
