package Matrix;

//12-01-2023
//14. Delete greatest value in each row
public class Delete_greatest_value {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,6,3},
                {5,2,8},
                {49,18,15},
        };
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++){
            int max=0;
            for(int j=1; j<col; j++){
                if(matrix[i][max] < matrix[i][j]){
                    max=j;
                }
            }
            while (max < col-1){
                matrix[i][max] = matrix[i][max+1];
                max++;
            }
        }
        col--;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
