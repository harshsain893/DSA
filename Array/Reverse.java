package Array;
public class Reverse {
    public static void Reverse(int number[]){
        int first = 0, last = number.length-1;

        while (first < last){
             // Swap
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[]args){
        int number[] = {2, 4, 6, 8, 10, 12};
        Reverse(number);
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]+" ");
        }
    }
}
