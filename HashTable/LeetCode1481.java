package HashTable;

import java.util.*;

public class LeetCode1481 {
    public static void main(String[] args) {
        int[] arr = {5,5,4};
        int k = 1;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> me : map.entrySet()) {

        }
    }
}
