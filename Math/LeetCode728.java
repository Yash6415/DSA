package Math;

import java.util.ArrayList;
import java.util.List;

public class LeetCode728 {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> list = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(i % 2 == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
