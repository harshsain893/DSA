package Array;
public class Insertionsort {
    public static void Insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int previous = i - 1;
            // Finding out the current pos to start
            while (previous >= 0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }
        public static void print(int arr[]) {
         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
         }  
         System.out.println(); 
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,1,2,3};
        Insertionsort(arr);
        print(arr);
    }
}
