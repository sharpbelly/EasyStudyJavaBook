package chapter12;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q5 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);

        Double i1 = stream.collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println(i1);

        stream = Stream.of(1,2,3,4,5);
        Double i2 =stream.map(n-> n*n).collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println(i2);

        stream = Stream.of(1,2,3,4,5);
        String i3 = stream.collect(Collectors.mapping(String::valueOf,Collectors.joining("-")));
        System.out.println(i3);

    }
}
