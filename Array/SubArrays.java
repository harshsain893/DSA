package Array;
public class SubArrays {
    public static void SubArrays(int number[]){
        for(int i = 0; i < number.length; i++){
            int start = i;
            int curr = number[i];
            for(int j = i; j < number.length; j++){
                int end = number[j];
                for (int k = start; k <= end; k++){
                    System.out.print(number[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int number[] = {2, 4, 6, 8, 10, 12};
        SubArrays(number);
    }
}
