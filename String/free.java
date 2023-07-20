package String;

public class free {
    public static void main(String[] args) {
        String s = "154863";
        int number = 0;

        for (int i=0; i<s.length(); i++){
            int a = s.charAt(i)-'0';
            number = number * 10 + a;
        }
        System.out.println(number);
    }
}
