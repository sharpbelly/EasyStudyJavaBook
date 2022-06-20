package chapter02;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println(x%4==0);
        System.out.println(x%4==0||x%5==0);
        System.out.println(((x%4!=0)&&(x%5==0))||((x%4==0)&&(x%5!=0)));

    }
}
