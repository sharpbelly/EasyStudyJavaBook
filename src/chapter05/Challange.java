package chapter05;

import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println("3명의 학생 성적을 입력하세요");
        int a=0;
        for (int i : scores) {
            scores[a++] = in.nextInt();
        }
        System.out.println("3명의 학생 성적은 다음과 같습니다.");
        for (int i : scores) {
            System.out.println(i + " ");
        }

        for (int i = 0; i < numOfStudents; i++) {
            if (scores[i] >= 90)
                System.out.println((i + 1) + "번 학생의 등급은 " +Scoress.A+"입니다.");
            else if (scores[i] >= 80)
                System.out.println((i + 1) + "번 학생의 등급은 " +Scoress.B+"입니다.");
            else if (scores[i] >= 70)
                System.out.println((i + 1) + "번 학생의 등급은 " +Scoress.C+"입니다.");
            else if (scores[i] >= 60)
                System.out.println((i + 1) + "번 학생의 등급은 " +Scoress.D+"입니다.");
            else if(scores[i] >= 50)
                System.out.println((i + 1) + "번 학생의 등급은 " +Scoress.E+"입니다.");
        }
    }
}
enum Scoress{
    A("최우수"),B("우수"),C("보통"),D("미흡"),E("탈락");

    String s;

    Scoress(String s){
        this.s=s;
    }

    public String toString(){
        return s;
    }
}
