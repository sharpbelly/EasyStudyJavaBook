package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+"-");
        System.out.println();

        // 이미 사용한 반복자에 의한 순회이므로 아무런 내용도 출력하지 않는다.
        while(iterator.hasNext())
            System.out.print(iterator.next()+"+");
        System.out.println();

        iterator = list.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+"=");
    }
}
