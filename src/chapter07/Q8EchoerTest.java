package chapter07;

import java.util.Scanner;

public class Q8EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q8Echoer e = new Q8Echoer() {
            @Override
            void echo() {
                while(true){
                    String say = in.nextLine();
                    System.out.println(say);
                    if(say.equals("끝")) break;

                }
            }
        };

        e.start();
        e.echo();
        e.stop();
    }
}
