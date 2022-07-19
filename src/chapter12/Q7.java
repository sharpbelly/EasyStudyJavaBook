package chapter12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q7 {
    public static void main(String[] args) {
        List<String> ls = List.of("민국","지우","하준","지우","하준","지우");
        Stream<String> s = ls.stream().map(String::toString);
        s.collect(Collectors.groupingBy(String::toString)).forEach((x,y)-> System.out.print(x+"="+y.stream().count()+", "));

    }
}
