package chapter07;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Q3Book[] book ={new Q3Book(15000), new Q3Book(50000), new Q3Book(20000)};

        System.out.println("정렬 전");

        for(Q3Book b : book){
            b.show();
        }
        Arrays.sort(book);

        System.out.println("정렬 후");

        for(Q3Book b : book){
            b.show();
        }
    }
}
