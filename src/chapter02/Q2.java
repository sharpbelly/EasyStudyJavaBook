package chapter02;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int a = in.nextInt();

        System.out.println(a+"의 제곱은 "+ (a*a));
    }
}
