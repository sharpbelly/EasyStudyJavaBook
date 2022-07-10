package chapter09;

public class Q6 {
    public static void main(String[] args) {
        Q6Box<Number> n  = new Q6Box<>();
        System.out.println(n.max(10.0,8.0));
        System.out.println(n.max(5,8.0));

        Q6Box<String> s  = new Q6Box<>();
        System.out.println(n.max("Hello","Hi"));
        System.out.println(n.max("Good", "morning"));
    }
}
