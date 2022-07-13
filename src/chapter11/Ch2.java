package chapter11;

import java.util.*;

public class Ch2 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        dic.put("head", "대가빠리");
        dic.put("teacher", "쌤");
        dic.put("cat", "꼬네이");
        dic.put("aunt", "아지매");
        dic.put("noodle", "국시");
        dic.put("child", "얼라");

        Iterator<String> keys = dic.values().iterator();
        for(String s : dic.keySet())
            System.out.printf("%s=%s ",s,dic.get(s));
        System.out.println();


        Collection<String> collection1 = dic.values();
        List<String> list = new ArrayList<>(collection1);
        Collections.shuffle(list);
        list.forEach(x-> System.out.print(x+" "));

    }
}
