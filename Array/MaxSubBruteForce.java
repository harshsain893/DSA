public class MaxSubBruteForce {
    public static void Maxsubarr(int number[]){
        for (int i = 0; i < number.length; i++){
            for(int j = i; j < number.length; j++){
                int sum = 0;
                System.out.print("(");
                for (int k = i; k <= j; k++){
                    System.out.print(number[k] + " ");
                    sum = sum + number[k];
                }
                System.out.print(")" + "-> " + sum + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        Maxsubarr(number);
    }
}
