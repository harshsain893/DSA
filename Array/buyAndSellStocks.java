package Array;
public class buyAndSellStocks {
    public static int buyAndSellStocks(int number[]){
        int profit = 0;
        int minimum = number[0];
        for (int i = 1; i < number.length; i++){
            int difference = number[i] - minimum;
            profit = Math.max(difference,profit);
            minimum = Math.min(minimum,number[i]);
        }
        return profit;
    }
    public static void main(String [] args){
        int number[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(number));
    }
}
