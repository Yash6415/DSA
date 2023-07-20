package String;

//25-01-2023
//Check if string have equal digits and chars
public class equal_digits_chars{
    public static void main(String[] args) {
        String s = "ya2sh000";
        char[] s1 = s.toCharArray();
        int n=s.length();
        int num=0;
        int chars=0;
        int i=0;
        int j=0;
        int count=0;
        int count1=0;

        while (i<n){
            if(s1[i] >= 65 && s1[i] <= 128){
                i++;
                count++;
            } else {
              i++;
            }
        }
        while (j<n){
            if(s1[j] <= 64){
                j++;
                count1++;
            }else {
                j++;
            }
        }
        if (count==count1){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

//        for(int i=0;i<n;i++){
//            if((s.charAt(i)=='0') || (s.charAt(i)=='1') || (s.charAt(i)=='2') || (s.charAt(i)=='3') || (s.charAt(i)=='4') || (s.charAt(i)=='5')
//                    || (s.charAt(i)=='6') || (s.charAt(i)=='7') || (s.charAt(i)=='8') || (s.charAt(i)=='9')){
//                num++;
//            }else if (s.charAt(i) != ' '){
//                chars++;
//            }
//        }
//        if(num==chars){
//            System.out.println("String have Equal Digits and Chars");
//        }
//        else {
//            System.out.println("String have Not Equal Digits and Chars");
//        }
    }
}