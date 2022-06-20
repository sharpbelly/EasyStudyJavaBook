package chapter02;
//
//콘솔에 '안녕' 메시지를 출력하는 자바 프로그램
//

public class Hello {
    public static void main(String[] args) {
//
//        메인 메소드 내부
//
        System.out.println("안녕!");

        System.out.println("안녕" + "!");

        String hello = "안녕!";
        System.out.println(hello);

        int fifteen = 15; // 10진수
        byte fifteeen = 0b1111; // 2진수
        short fifteeeen = 017; // 8진수
        int fifteeeeen = 0xF; // 16진수
        long ligtSpeed = 300000L; // L은 long 타입임을 명시

        double half = 0.5; // 일반 표기법
        double halff = 5E-1; // 지수 표기법으로 5x10의-1승을 의미
        //float pi = 3.14159; // 오류
        float pi = 3.14159F; // F는 float 타입임을 명시
        double pii = 3.14159;

    }
}
