public class Bubbledescen {
    public static void Bubbledescen(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            // int min = arr[i];
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
    public static void main (String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3};
        Bubbledescen(arr);
        printArray(arr);
    }
}
