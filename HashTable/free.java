package HashTable;

import java.util.*;

public class free {
    public static void main(String[] args){
        String s = "leetcode";
        String t = "coats";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c:s.toCharArray()){map1.put(c,map1.getOrDefault(c,0)+1);}
        for(char c:t.toCharArray()){map2.put(c,map2.getOrDefault(c,0)+1);}

        int count = 0;
        for(char c:map1.keySet()){
            if(map2.containsKey(c)) {
                count+=Math.abs(map2.get(c) - map1.get(c));
            }
            else{
                count+=map1.get(c);
            }
        }
        for(char c:map2.keySet()){
            if(!map1.containsKey(c)){
                count+=map2.get(c);
            }
        }
        System.out.println(count);
    }
}