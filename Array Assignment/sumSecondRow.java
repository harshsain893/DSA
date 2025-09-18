import java.util.*;
public class sumSecondRow {
    public static int sumSecondRow(int matrix[][]){
        // Step 3: Calculate the sum of second row (index = 1)
        int sum = 0;
        if(matrix.length >= 2){ // Check if second row exists
            for(int j = 0; j < matrix[1].length; j++){
                sum += matrix[1][j];
            }
        }
        else{
            System.out.println("No second row exist!");
        }
        return sum;
    }
    public static void main(String[] args) {
        // Step 1: Take the input for rows and columns:
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the row: ");
        int rows = sc.nextInt();
        System.out.print("Enter the column: ");
        int cols = sc.nextInt();
        int matrix[][] = new int [rows][cols];

        // Step 2: Take the inputs for elements
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = sumSecondRow(matrix);
        System.out.println("Sum of second row: "+sum);
    }
}
