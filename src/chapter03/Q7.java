package chapter03;

// Q6에서 프롬프트와 r,p,s를 입력하는 부분, 입력된 데이터에 따라 승자를 출력하는 부분을
// 각각 메서드로 작성하라, main() 메서드는 다음과 같다.

//public static void main(String[] args) {
//        String c = input("철수");
//        String y = input("영희");
//        whosWin(c, y)
//        }

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }

    public static String input(String n) {
        Scanner in = new Scanner(System.in);
        System.out.print(n+": ");
        String a = in.nextLine();
        return a;
    }

    public static void whosWin(String c, String y){
        if(c.equals("r")){
            if(y.equals("r")) System.out.println("무승부");
            else if(y.equals("s")) System.out.println("철수, 승!");
            else System.out.println("영희, 승!");
        } else if(c.equals("s")){
            if(y.equals("r")) System.out.println("영희, 승!");
            else if(y.equals("s")) System.out.println("무승부");
            else System.out.println("철수, 승!");
        }else{
            if(y.equals("r")) System.out.println("철수, 승!");
            else if(y.equals("s")) System.out.println("영희, 승!");
            else System.out.println("무승부");
        }

    }
}
