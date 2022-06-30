package chapter05;

public class Q1 {
    public static void main(String[] args) {

        String s = "qqrdaasdfgghhjuipmnvbvc";
        char c = 'a';
        int a = countChar(s,c);
        System.out.println(a);

    }

    static int countChar(String s, char c){
        int cnt =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
                cnt++;
        }
        return cnt;
    }
}
