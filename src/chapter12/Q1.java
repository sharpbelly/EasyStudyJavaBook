package chapter12;

import java.util.List;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<String> s = List.of("갈매기", "나비", "다람쥐", "라마");

        Stream<String> ss = s.stream();
        ss.filter(x -> x.length() == 2).forEach(x -> System.out.print(x + " "));
    }
}
