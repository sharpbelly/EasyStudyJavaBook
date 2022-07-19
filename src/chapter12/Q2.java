package chapter12;

import java.util.List;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        List<String> capital = List.of("서울","워싱턴","베이징","파리","마드리드","런던");

        Stream<String> cap = capital.stream();
        cap = cap.sorted();
        System.out.println(cap.findFirst().get());

    }
}
