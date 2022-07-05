package chapter08;

public class Q1CircleTest {
    public static void main(String[] args) {
        Q1Circle c1 = new Q1Circle(3);
        Q1Circle c2 = new Q1Circle(3);

        if (c1.equals(c2))
            System.out.println("c1과 c2는 같다.");
        else
            System.out.println("c1과 c2는 다르다.");
    }
}
