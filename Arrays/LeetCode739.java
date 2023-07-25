package Arrays;
//24-07-2023
//739.Daily Temperatures.
public class LeetCode739 {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            int count = 0;
            boolean flag = false;
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    ans[i] = ++count;
                    flag = true;
                    break;
                }else {
                    count++;
                }
            }
            if(!flag){
                ans[i] = 0;
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
