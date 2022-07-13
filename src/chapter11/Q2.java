package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        Set<Q2Person> set = new HashSet<>();
        set.add(new Q2Person("김열공",20));
        set.add(new Q2Person("최고봉",56));
        set.add(new Q2Person("우등생",16));
        set.add(new Q2Person("나자바",35));

        set.forEach(s-> System.out.println(s.name+" : "+s.age));

        Iterator<Q2Person> iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }
    }
}
