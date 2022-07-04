package chapter07;

public class Ractangle extends Shape {
    int w, h;

    public Ractangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public void draw() {
        System.out.println("사각형을 그리다.");
    }

    public double findArea() {
        return w * h;
    }

}
