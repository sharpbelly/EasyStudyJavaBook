package chapter03;

// 다음은 foo() 메서드가 빠진 프로그램 일부와 실행 결과이다. foo()메서드를 완성하라.
//public static void main(String[] args) {
//        foo("안녕", 1);
//        foo("안녕하세요", 1, 2);
//        foo("안녕");
//        }

// 안녕 1
// 안녕하세요 1 2
// 잘 있어

public class Q9 {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("잘 있어");
    }

    static void foo(String s, int n){
        System.out.println(s+" "+n);
    }
    static void foo(String s, int n1, int n2){
        System.out.println(s+" "+n1+" "+n2);
    }
    static void foo(String s){
        System.out.println(s);
    }
}