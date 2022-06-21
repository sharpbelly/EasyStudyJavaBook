package chapter03;

public class Challenge03 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1, 5));
        System.out.println(factorial(3, 5));
        System.out.println(factorial(10, 5));
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

    public static int factorial(int x, int y) {
        int r = 1;
        for (int i = x; i <= y; i++) {
            r *= i;
        }
        return r;
    }
}
