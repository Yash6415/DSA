package LeetCode;
import java.util.*;

public class free {
    public static void main(String[] args) {
        int arr[] = {-1, -2, -3};
        int n = arr.length;

        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0) {
                pre = 1;
            }
            if (suff == 0) {
                suff = 1;
            }
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        System.out.println(ans);
    }
}
