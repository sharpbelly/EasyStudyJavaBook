package chapter12;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q4 {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        Map<Boolean, String> m1 = sn.collect(Collectors.partitioningBy(x->x.getType()==Nation.Type.LAND, Collectors.mapping(Nation::getName,Collectors.joining(", "))));
        System.out.println(m1);
    }
}
