package chapter07;

public class Q7FlyableTest {
    public static void main(String[] args) {
        Q7Flyable f = new Q7Flyable() {
            @Override
            public void speed() {
                System.out.println("속도");
            }

            @Override
            public void height() {
                System.out.println("높이");
            }
        };

        f.speed();
        f.height();

    }
}
