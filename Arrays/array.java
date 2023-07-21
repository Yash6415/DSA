package Arrays;

public class array {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0};
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] < count){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
