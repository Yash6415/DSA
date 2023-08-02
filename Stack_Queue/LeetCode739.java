package Stack_Queue;

import java.util.Arrays;
//02-08-2023
//739.Daily Temperatures.
public class LeetCode739 {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = ++count;
                    found = true;
                    break;
                } else {
                    count++;
                }
            }
            if (!found) {
                ans[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
