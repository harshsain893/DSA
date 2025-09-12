import java.util.*;
public class Inputfromtheuser {
    public static void main (String [] args){
        // int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the " + n + " Elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
