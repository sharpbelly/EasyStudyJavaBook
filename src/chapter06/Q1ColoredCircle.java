package chapter06;

class Q1ColoredCircle extends Q1Circle {
    String color;

    Q1ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
    }
}
