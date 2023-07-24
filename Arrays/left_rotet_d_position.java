package Arrays;

public class left_rotet_d_position {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int temp = 0;
        int d = 1;
        d = d%n;

        for (int i =n; i>d; i--){
            temp = arr[n-1];
            int j=n-1;
            while (j>0){
                arr[j] = arr[j-1];
                j--;
            }
            arr[0]=temp;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
