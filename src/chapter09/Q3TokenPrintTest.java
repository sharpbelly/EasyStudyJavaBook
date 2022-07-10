package chapter09;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Q3TokenPrintTest {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try{
            showTokens(s, ", ");
        } catch(NoSuchElementException e){
            System.out.println("끝");
        }
    }

    static void showTokens(String s, String s1) {

        StringTokenizer st = new StringTokenizer(s, s1);

        while(true){
            System.out.println(st.nextToken());
        }

    }
}
