package chapter02;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("화씨온도를 입력하세요 : ");
        double f = in.nextDouble();

        double c = (5*(f-32))/9;

        System.out.println("정답은 : "+ c);
    }
}
