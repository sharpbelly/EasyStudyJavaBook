package chapter02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double r, w, pi;
        pi = 3.14;

        Scanner in = new Scanner(System.in);

        System.out.println("원기둥의 밑면 반지름은? ");
        r = in.nextDouble();
        System.out.println("원기둥의 높이는? ");
        w = in.nextDouble();
        System.out.println("원기둥의 부피는 " + ((r*r*pi) * w));
    }
}
