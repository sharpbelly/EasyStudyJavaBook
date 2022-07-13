package chapter11;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("갈매기");
        animals.add("나비");
        animals.add("다람쥐");
        animals.add("라마");

        for(String a : animals){
            if(a.length()==2){
                System.out.println(a);
            }
        }

    }
}
