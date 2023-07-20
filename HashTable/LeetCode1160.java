package HashTable;

import java.util.*;
public class LeetCode1160 {
    public static void main(String[] args) {
        String[] s1 = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        //Map<String,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(char c : chars.toCharArray()){
            set.add(c);
        }
        System.out.println(set);
        int ans = 0;
        for(int i=0; i<s1.length; i++){
            String s = s1[i];
            int count = 0;
            for(int j=0; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    count++;
                }
            }
            if(s.length() == count){
                ans += count;
            }
        }
        System.out.println(ans);


//        for(String s : s1){
//            if(map.containsKey(s)){
//                map.put(s,map.get(s) + 1);
//            }else{
//                map.put(s,1);
//            }
//        }
        //System.out.println(map);

//        for(Map.Entry<String,Integer> me : map.entrySet()){
//            String s = me.getKey();
//            for(int i=0; i<s.length(); i++){
//                if(set.contains(s.charAt(i))){
//                    count++;
//                }
//            }
//        }
    }
}
