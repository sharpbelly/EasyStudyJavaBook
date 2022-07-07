package chapter09;

public class UnChecked2Demo {
    public static void main(String[] args) {
        int array[] = {0,1,2};

        // 범위를 벗어난 인덱스를 사용해 예외를 발생시킨다.
        System.out.println(array[3]);
    }
}
