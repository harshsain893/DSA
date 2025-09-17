package Array;
public class spiralMatrix {
    public static void main(String[]args){
        int matrix [][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            // left to right;
            for (int i =  left; i <= right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // top to bottom;
            for(int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // right to left;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom to top;
            if(left <= right){
                for(int i = bottom; i >=top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
