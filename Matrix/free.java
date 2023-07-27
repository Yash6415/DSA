package Matrix;

public class free {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,6,7,9},
                {10,14,16,19},
                {5,6,8,9},
                {20,25,30,56}
        };
        int row =  matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int value = 30;
        int bottom = col-1;

        while (top < row && bottom >= 0){
            if(matrix[top][bottom] == value){
                System.out.println("value is present");
                return;
            }else if (matrix[top][bottom] > value){
                bottom--;
            } else if (matrix[top][bottom] < value) {
                top++;
            }
        }
        System.out.println("value is not present");
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
