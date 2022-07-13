package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();


        while(true){
            System.out.print("점수를 입력하세요 : ");
            int num = in.nextInt();
            if(num == -1) break;
            a.add(num);
        }

        int cnt =0;
        for(Integer i : a){
            if(i>=90){
                System.out.println(cnt+"번 학생의 성적은"+i+"점이며 등급은 A이다.");
                cnt++;
            }else if(i>=80){
                System.out.println(cnt+"번 학생의 성적은"+i+"점이며 등급은 B이다.");
                cnt++;
            } else{
                System.out.println(cnt+"번 학생의 성적은"+i+"점이며 등급은 C이다.");
                cnt++;
            }
        }
    }
}
