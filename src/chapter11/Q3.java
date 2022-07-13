package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("김열공",80);
        map.put("최고봉",90);
        map.put("우등생",95);
        map.put("나자바",88);

        Scanner in = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String na = in.nextLine();

        if(map.containsKey(na))
            System.out.println(map.get(na));
    }
}
