package chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q3 {
    public static void main(String[] args) {
        IntStream a = IntStream.rangeClosed(1,10);

        Stream<String> a2 = a.mapToObj(i->"A"+i);
        a2.forEach(x-> System.out.print(x+" "));
    }
}
