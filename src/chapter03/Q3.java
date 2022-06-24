package chapter03;

// 키보드로 입력된 양의 정수 중에서 짝수만 덧셈해서 출력하는 코드를 do~while 문을 사용해 작성하라.
// 단, 입력된 정수가 양수가 아니라면 입력을 종료한다.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int a = 0;

        do {
            System.out.print("양의 정수를 입력하세요 : ");
            a = in.nextInt();
            if (a % 2 == 0) sum += a;

        } while (a >= 0);
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    }
}
