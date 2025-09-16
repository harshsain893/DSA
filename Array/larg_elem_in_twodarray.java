package Array;
import java.util.*;
public class larg_elem_in_twodarray {

    public static int largest(int matrix[][]){
        int max = matrix[0][0];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            if(matrix[i][j] > max){
                max = matrix[i][j];
            }    
        } 
    }
     return max;
 }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int matrix[][] = new int [3][3];
        System.out.print("Enter the elements:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Largest element is: "+largest(matrix));
    }
}
