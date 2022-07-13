package chapter11;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        String[] s1 = {"a","b","a","b","c"};
        String[] s2 = {"c"};

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        Collections.addAll(set1, s1);
        Collections.addAll(set2, s2);

        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);

        System.out.println("set1과 set2는 같다 : " + set1.equals(set2));
        System.out.println("set1은 set2의 모든 원소를 포함한다. : " + set1.containsAll(set2));

        Set<String> set3 = new HashSet<>(set1);
        Set<String> set4 = new HashSet<>(set1);

        set3.addAll(set2);
        set4.retainAll(set2);

        System.out.println("합집합 : "+set3);
        System.out.println("교집합 : "+set4);




    }
}
