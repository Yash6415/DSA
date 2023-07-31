package String;
import java.util.*;
public class free {
    public static void main(String[] args) {
        String s = "msm sasg";
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;
        for(int i=0; i<s.length(); i++){
            if(arr[i] == ' '){
                right = i - 1;
                helper(arr,left,right);
                left = i + 1;
            }
        }
        right = arr.length - 1;
        helper(arr,left,right);
    }
    private static void helper(char[] arr,int left, int rigth){
        while (left < rigth){
            if(arr[left] != arr[rigth]){
                System.out.print(false);
                return;
            }else {
                left++;
                rigth--;
            }
        }
        System.out.println(true);
    }
}
