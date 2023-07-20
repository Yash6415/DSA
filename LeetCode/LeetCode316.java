package LeetCode;

import java.util.HashSet;

public class LeetCode316 {
    public static void main(String[] args) {
        String s = "bcabc";
        String ans = "";

        HashSet<Character> set = new HashSet<>();
        for(int i=0; i< s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set);
    }
}
