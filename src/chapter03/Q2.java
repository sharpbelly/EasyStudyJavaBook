package chapter03;

// 키보드로 등수를 입력받아 1등이면 '아주 잘했습니다', 2~3등이면 '잘했습니다.', 4~6등이면 '보통입니다.'
// 그 이외 등수이면 '노력해야겠습니다'라고 출력하는 프로그램을 switch문을 사용해 작성하라.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();

        String teaching = switch (a){
            case 1 -> "아주 잘했습니다.";
            case 2,3 -> "잘했습니다.";
            case 4,5,6 -> "보통입니다.";
            default -> "노력해야겠습니다";
        };
        System.out.println(teaching);
    }
}
