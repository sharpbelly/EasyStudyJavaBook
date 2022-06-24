package chapter03;

// 다음 실행 결과를 출력하는 프로그램을 for 문을 사용해 작성하라.
// *
// **
// ***
// ****
// *****
public class Q4 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < x + 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
