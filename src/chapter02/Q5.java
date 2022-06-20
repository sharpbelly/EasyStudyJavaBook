package chapter02;

public class Q5 {
    public static void main(String[] args) {
        char c = 'c';

        int change = (int)'A'-(int)'a';

        System.out.println("대문자 변환 : "+ (char)(c+change));
    }
}
