


public class Question3 {
    public static  int price(int price[]){
        int stockprice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<price.length; i++){
            if(stockprice<price[i]){
                int profit=price[i]-stockprice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                stockprice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int profit[]={2,3,4,5,1,9};

        System.out.println(price(profit));
    }
    
}
