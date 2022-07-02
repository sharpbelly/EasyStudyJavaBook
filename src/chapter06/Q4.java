package chapter06;

public class Q4 {
    public static void main(String[] args) {
        Q4Parent p = new Q4Child();
        System.out.println(p.name);
        p.print();
    }
}
