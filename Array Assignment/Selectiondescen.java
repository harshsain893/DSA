public class Selectiondescen {
    public static void Selectiondescen(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Print(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3};
        Selectiondescen(arr);
        Print(arr);
    }
}
