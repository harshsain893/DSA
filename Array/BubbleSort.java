package Array;
public class BubbleSort {
    public static void bubblesort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j <= arr.length-2; j++){
                if(arr[j] > arr[j+1]){      

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main (String [] args){
        int arr[] = {9, 8, 6, 2, 7, 3};
        bubblesort(arr);
        printArray(arr);
    }
}
