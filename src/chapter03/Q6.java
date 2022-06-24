package chapter03;

// 철수가 영희가 가위(s), 바위(r), 보(p) 게임을 한다.
// 다음 실행 결과와 같이 r, p, s중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램을 작성하라.
// 철수 : r
// 영희 : s
// 철수, 승!
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("철수 : ");
        String chul = in.nextLine();

        System.out.print("영희 : ");
        String young = in.nextLine();

        if(chul.equals("r")){
            if(young.equals("r")) System.out.println("무승부");
            else if(young.equals("s")) System.out.println("철수, 승!");
            else System.out.println("영희, 승!");
        } else if(chul.equals("s")){
            if(young.equals("r")) System.out.println("영희, 승!");
            else if(young.equals("s")) System.out.println("무승부");
            else System.out.println("철수, 승!");
        }else{
            if(young.equals("r")) System.out.println("철수, 승!");
            else if(young.equals("s")) System.out.println("영희, 승!");
            else System.out.println("무승부");
        }
    }
}
