package String;

import java.util.*;

public class free {
    public static void main(String[] args) {
        String s = "naman is a naman";
        int[] arr = new int[128];

        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i);
            if(arr[ascii] == 0){
                arr[ascii] += 1;
            } else if (arr[ascii] == 1) {
                arr[ascii] += 1;
                char c = s.charAt(i);
                System.out.println(c);
            }
        }
    }
}
