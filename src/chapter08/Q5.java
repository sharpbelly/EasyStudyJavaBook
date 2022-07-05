package chapter08;

public class Q5 {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(String.valueOf(new StringBuilder("meltdown")));
        show(String.valueOf(new StringBuffer("!@#")));
    }

    static void show(String s){
        System.out.println(s);
    }


}
