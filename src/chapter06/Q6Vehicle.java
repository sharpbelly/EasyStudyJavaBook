package chapter06;

class Q6Vehicle {
    static String color;
    static int speed;

    public Q6Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    static void show() {
        System.out.println("color : " + color + " speed : " + speed);
    }
}
