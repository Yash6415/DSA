package Matrix;

public class free {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,5,6},
                {7,8,9},
                {1,6,8},
        };

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
