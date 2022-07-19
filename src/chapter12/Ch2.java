package chapter12;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch2 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);


        Stream<Integer> ss = ages.stream();
        System.out.println(ss.reduce(0,(x,y)->x+y));
        ss = ages.stream();
        System.out.println(ss.max(Integer::compareTo).get());
        ss=ages.stream();
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());

    }
}




