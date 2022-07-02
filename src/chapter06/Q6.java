package chapter06;

public class Q6 {
    public static void main(String[] args) {
        Q6Car c = new Q6Car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();
        Q6Vehicle v = c;
        v.show();
    }
}
