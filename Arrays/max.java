package Arrays;

public class max {
    public static void main(String[] arg) {
        int arr[] = {2,5,3,9,20,10,1};
        int mx1 = arr[1];
        int mx2 = arr[0];
        int n = arr.length;

        if(arr[1] > arr[0]){
            mx1 = arr[1];
            mx2 = arr[0];
        }else{
            mx1 = arr[0];
            mx2 = arr[1];
        }
        for(int i=2; i<=n-1; i++){
            if(mx1 < arr[i]){
                int temp = mx1;
                mx1 = arr[i];
                mx2 = temp;
            } else if (mx2 < arr[i]) {
                mx2 = arr[i];
            }
        }
        System.out.println(mx2);
    }
       /* int arr[] = {1, 3, 5, 6, 8, 9, 10, 11, 17};
        int max = arr[0];
        int n = 9;

        for (int i = 1; i <= n - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }*/
}
