package Stack_Queue;
import java.util.*;

public class free {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = ++count;
                    break;
                } else{
                    count++;
                }
                ans[i] = count;
            }
        }
        System.out.println(Arrays.toString(ans));

//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
//        int[] ans = new int[arr.length];
//
//        for(int i=arr.length-1; i>=0; i--){
//            stack1.push(arr[i]);
//        }
//        for(int i=0; i<stack1.size(); i++){
//            int k = stack1.pop();
//            int count = 0;
//            while (k < stack1.peek()){
//                if(k < stack1.peek()){
//                    stack2.push(stack1.pop());
//                }
//            }
//        }
    }
}
