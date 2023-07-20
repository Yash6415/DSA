package Matrix;

//11-01-2023
//9. Find element from sorted matrix : Binary search
public class sorted_matrix_binary {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,6},
                {4,9,4},
                {7,8,3}
        };
        int r=matrix.length;
        int c = matrix[0].length;
        int top=0;
        int bottom=c-1;
        int value = 9;
        while (top<=bottom){
            int mid = (top+bottom)/2;
            if(value == mid){
                System.out.println("value present");
                return;
            }else if (value < mid){

            }
        }
    }
}
