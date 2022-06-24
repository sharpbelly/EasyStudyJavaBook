package chapter03;

import java.util.Scanner;

// 키보드로 입력한 정수가 19 이상이면 '성년', 아니면 '미성년'을 출력하는 프로그램을
// if~else문을 사용해 작성하라.
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a >= 19) {
            System.out.println("성년");
        } else {
            System.out.println("미성년");
        }
    }
}
