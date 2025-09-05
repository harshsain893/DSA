package Array;
public class FindLargest {

    // In this code we have to find the largest number and the smallest in the given array
    public static int largestValue(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++){
            if (number[i] > largest){
                largest = number[i];
            }
            if (number[i]<smallest){
                smallest = number[i];
                System.out.println("Smallest value is: "+smallest);
            }
        }
        return largest;
    }
    public static void main(String[]args){
        int number[] = {1, 2, 6, 3, 5};
        System.out.println("Largest value is: "+largestValue(number));
    }
}
