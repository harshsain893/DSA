package Array;
public class PairsofArray {
    public static void PrintPairs(int number[]){
        int n = number.length;
        int total_pairs = (n*(n-1))/2;
        for(int i = 0; i < number.length; i++){
            int curr = number[i];
            for (int j = i+1; j < number.length; j++){
                System.out.print("(" + curr + "," + number[j] + ")");
            }
            System.out.println();
        }
        // Total pairs formulae = (n*(n-1))/2;
        System.out.println("Total pairs is : "+total_pairs);
     }
    public static void main(String []args){
        int number[] = {2, 4, 6, 8, 10};
        PrintPairs(number);
    }
}
