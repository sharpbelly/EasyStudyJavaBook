package chapter07;

public class MovableDemo {
    public static void main(String[] args) {
        Movable m = new Car();

        m.move(5);

        //Mobable 타입에는 show()메서드가 없기 때문에 호출할 수 없다.
//        m.show();

        Car c = (Car) m;
        c.move(10);
        c.show();
    }
}
