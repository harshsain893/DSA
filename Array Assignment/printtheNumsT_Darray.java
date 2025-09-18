public class printtheNumsT_Darray{
    public static void printtheNumsT_Darray(int matrix[][], int target){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == target){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        int target = 7;
        int matrix [][] = {
            {4, 7, 8},
            {8, 8, 7},
        };
        printtheNumsT_Darray(matrix, target);
    }
}
