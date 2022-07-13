package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class Q6 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        dic.put("호랑이","tiger");
        dic.put("표범","leopard");
        dic.put("사자","lion");

        System.out.println("변경 전 : "+dic);


        dic.replaceAll((k,v)->v.toUpperCase());
        System.out.println("변경 후 : "+dic);
    }
}
