package chapter11;

import java.util.ArrayList;
import java.util.List;

public class Ch1 {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();

        capitals.add("서울");
        capitals.add("워싱턴");
        capitals.add("베이징");
        capitals.add("파리");
        capitals.add("마드리드");

        for(String s : capitals)
            System.out.print(s+" ");
        System.out.println();

        capitals.add("런던");
        for(String s : capitals)
            System.out.print(s+" ");
        System.out.println();

        capitals.removeIf(s->s.length()>=3);

        capitals.forEach(s-> System.out.print(s + " "));
    }
}
