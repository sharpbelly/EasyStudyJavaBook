package chapter02;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("전공 이수 학점 : ");
        int major = in.nextInt();
        System.out.println("교양 이수 학점 : ");
        int minor = in.nextInt();
        System.out.println("일반 이수 학점 : ");
        int basic = in.nextInt();

        if ((major + minor + basic) >= 140) {
            if (major >= 70) {
                if (((minor + basic) >= 80) || (minor >= 30 && basic >= 30)) {
                    System.out.println("졸업 가능");
                } else
                    System.out.println("졸업 불가능");
            } else
                System.out.println("졸업 불가능");
        } else
            System.out.println("졸업 불가능");
    }
}
