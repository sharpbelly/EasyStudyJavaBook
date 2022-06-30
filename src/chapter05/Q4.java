package chapter05;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("URL을 입력하세요 : ");
            String s = in.nextLine();

            if(s.contains("com")){
                System.out.println(s+"은 'com'으로 끝납니다.");
            }

            if(s.contains("java")){
                System.out.println(s+"은 'java'를 포함합니다.");
            }

            if(s.contains("bye"))
                break;
        }
    }
}
