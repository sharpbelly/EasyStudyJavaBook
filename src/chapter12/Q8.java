package chapter12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q8 {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();

        Map<Nation.Type, Map<Nation.Type2, List<Nation>>> m = sn.collect(Collectors.groupingBy(Nation::getType, Collectors.groupingBy(Nation::getType2)));
        System.out.println(m);

    }
}
