package Array;
public class Secondlargest {
    public static int Secondlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                Secondlargest = largest;
                largest = arr[i];
            }
        }
        return Secondlargest;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,8,9,10};
        System.out.print(Secondlargest(arr));
    }
}
