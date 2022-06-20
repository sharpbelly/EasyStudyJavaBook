package chapter02;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("0~999 사이의 숫자를 입력하세요");
        String a = in.nextLine();

        int sum=0;
        for(int i=0;i<a.length();i++){
            sum += Integer.parseInt(a.substring(i,i+1));
        }


        System.out.println(sum);

    }
}
