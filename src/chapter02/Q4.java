package chapter02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sec=0, min=0, hour=0,time;
        System.out.println("초 단위 정수를 입력하세요 : ");
        time = in.nextInt();

        for(int i=0;i<time;i++){
            sec++;
            if(sec==60){
                min++;
                sec = 0;
            }
            if(min==60){
                hour++;
                min=0;
            }
        }

        System.out.println(hour+"시간 "+min+"분 "+sec+"초");

    }
}
