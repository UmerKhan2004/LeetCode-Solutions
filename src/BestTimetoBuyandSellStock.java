package Arrays;

public class BestTimetoBuyandSellStock {
    public  static void Solve(){
        int[] prices={7,8,5,7,14};
        int Left =0;
        int Right =1;
        int maxProfit=0;

        while (Right < prices.length){
            if (prices[Right] > prices[Left]){
                int profit = prices[Right] - prices[Left];
                maxProfit = max(maxProfit,profit);
            }else{
                Left = Right;
            }
            Right++;
        }
        System.out.println(maxProfit);

    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
