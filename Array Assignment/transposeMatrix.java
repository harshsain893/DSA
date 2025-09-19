public class transposeMatrix {
    public static void transposeMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = matrix[j][i];
            }
        }
        transposeMatrix(matrix);
    }
    public static void main(String args[]){
        int matrix [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
