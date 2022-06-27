package chapter04;

public class CircleOver {
    double radius;
    String color;

    // 생성자 1
    public CircleOver(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // 생성자 2
    public CircleOver(double radius) {
        this(radius, "파랑");
    }

    // 생성자 3
    public CircleOver(String color) {
        this(10.0, color);
    }

    // 생성자 4
    public CircleOver() {
        this(10.0,"빨강");
    }
}
