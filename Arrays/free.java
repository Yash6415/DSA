package Arrays;

import java.util.Arrays;

public class free {
    public static void main(String[] args) {
        int arr1[] = {2,3,5,7,9,11,12};
        int arr2[] = {1,4,5,6,8,10};

        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<n && j<m){
            if(arr1[i] > arr2[j]){
                ans[k] = arr2[j];
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else if (arr1[i] == arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        while (i < n){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ans));
    }
//        int arr[] = {3, 5, 1, 10, 8, 6};
//        int arr[] = {5,3,1,10,8,6};
//        int n = 5;
//        boolean swap = false;
//
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swap = true;
//                }
//            }
//            if(swap == false){
//                break;
//            }
//        }
//        for (int i = 0; i <= n; i++) {
//            System.out.print(arr[i] + " ");

}