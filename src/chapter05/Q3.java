package chapter05;

public class Q3 {
    public static void main(String[] args) {
        for(Direction d : Direction.values())
            System.out.print(d+" ");
    }
}

enum Direction{
    동, 서, 남, 북
}
