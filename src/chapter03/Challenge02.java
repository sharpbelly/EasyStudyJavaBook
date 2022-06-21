package chapter03;

import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("팩토리얼 값을 구할 정수");
        int n = in.nextInt();

        int result = factorial(n);

        System.out.println(result);
    }

    public static int factorial(int x) {
        int r = 1;

        while (true) {
            if (x == 0) break;
            r *= x;
            x--;
        }

        return r;
    }
}
