package chapter07;

public class Anonymous1Demo {
    Bird e = new Bird() {
        public void move() {
            System.out.println("독수리가 난다~~~.");
        }

        void sound() {
            System.out.println("휘익~~~.");
        }
    };

    public static void main(String[] args) {
        Anonymous1Demo a = new Anonymous1Demo();
        a.e.move();

        // a.e 객체가 bird 타입이므로 sound() 메서드를 호출할 수 없다.
//        a.e.sound();
    }
}
