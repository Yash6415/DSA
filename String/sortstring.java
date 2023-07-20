package String;

public class sortstring {
    public static void main(String[] args){
        String s = "yash";
        char[] c = s.toCharArray();

        for(int i=0; i<c.length-1; i++){
            for(int j=i+1; j<c.length; j++){
                if(c[i] > c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        String s1 = new String(c);
        System.out.println(s1);
    }
}
