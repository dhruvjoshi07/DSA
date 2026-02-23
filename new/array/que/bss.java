package que;
/*BUY AND SELL STOCKS
u r givrn an arr prices where prices[i] is the price of a given stock on the ith day.
u want to maximize your profit by choosing a single day to buy one stock and
choosing a diff day in the future to sell that stock.Return the maximum profit u can 
achieve from this transaction.if u cannot achieve any profit,return 0 */
public class bss {
    //profit=sell-buy
    //prices=[7,1,5,3,6,4]
    //descending price alwys loss so we will return 0
    public static int buyandsellstocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){ //profit
                int profit=prices[i]-buyprice;//today's profit 
                maxprofit=Math.max(maxprofit,profit);               
            }else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        buyandsellstocks(prices);
    } 
}
