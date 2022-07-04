package chapter07;

public class ContrallableDemo {
    public static void main(String[] args) {
        Controllabel[] controllabel = {new TV(), new Computer()};

        for (Controllabel c : controllabel) {
            c.turnOn();
            c.trunOff();
            c.repair();
        }
        Controllabel.reset();

    }
}
