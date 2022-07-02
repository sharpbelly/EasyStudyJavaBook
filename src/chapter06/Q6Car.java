package chapter06;

class Q6Car extends Q6Vehicle {
    static int displacement;
    static int gears;

    public Q6Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }


    static void show() {
        System.out.println("color : " + color + " speed : " + speed + " displacement : " + displacement + " gears : " + gears);
    }
}
