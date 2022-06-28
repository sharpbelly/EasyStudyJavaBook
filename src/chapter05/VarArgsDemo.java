package chapter05;

public class VarArgsDemo {
    public static void main(String[] args) {
        printsum(1, 2, 3, 4, 5);
        printsum(10, 20, 30);
        System.out.println(String.format("My score is %.1f",99.8));
        System.out.println(String.join(", ", "one","two","three"));
    }

    public static void printsum(int... v) {
        int sum = 0;
        for(int i:v){
            sum += i;
        }
        System.out.println(sum);
    }
}
