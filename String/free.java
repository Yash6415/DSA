package String;
import java.util.*;
public class free {
    public static void main(String[] args) {
        String s = "yaslfmvsmo15648949sh124";
        char[] c = s.toCharArray();
        int count = 0;

        for(int i=0; i<c.length; i++){
            if(c[i] >= '0' && c[i] <= '9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
