package Matrix;

public class exemple {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 4},
                {3, 3, 1}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            int max = 0;
            for (int j = 1; j < col; j++) {
                if (matrix[i][max] < matrix[i][j]) {
                    max = j;
                }
            }
            while (max < col - 1) {
                matrix[i][max] = matrix[i][max + 1];
                max++;
            }
        }
        col--;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
