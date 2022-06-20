package chapter02;

import java.util.Scanner;

public class ChallengeAddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하세요 :");
        int a = in.nextInt();

        if(a%2==0)
            System.out.println("짝수");
        else
            System.out.println("홀수");
    }
}
