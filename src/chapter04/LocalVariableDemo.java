package chapter04;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b;

//        System.out.println(b);  초기화되지 않고는 사용할 수 없다.
//        System.out.println(a + c);  c 변수는 아직 선언되지 않았기 때문에 사용할 수 없다.

        int c = 0;

        for (int e = 0; e < 10; e++) {
//            int a+=1;  5행에서 선언된 지역 변수 이름이다. 블록이 달라도 같은 이름으로는 다시 선언할 수 없다.
            System.out.print(e);
        }
    }
}
