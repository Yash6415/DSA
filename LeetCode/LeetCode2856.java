package LeetCode;
import java.util.*;

public class LeetCode2856 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        list.add(2);
//        list.add(9////);
        int ans = list.size();
        Collections.sort(list);

        int max = list.size() / 2;
        for (int i=0; i<list.size(); i++) {
            if (i < max || i >= list.size() - max) {
                ans--;
            }
        }
        System.out.println(ans);
    }
}
