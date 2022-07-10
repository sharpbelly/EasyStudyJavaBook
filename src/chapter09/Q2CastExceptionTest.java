package chapter09;

import java.awt.*;

class Shape extends Rectangle {}

class Ractangle extends Shape{}

class Circle extends Shape{}

public class Q2CastExceptionTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        try {
            casting((Shape) r);
        }catch (ClassCastException e){
            System.out.println("실행");
        }
    }

    static void casting(Shape s) throws ClassCastException {
        Circle c = (Circle) s;
    }
}
