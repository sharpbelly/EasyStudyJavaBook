package chapter09;

public class Q1 {
    public static void main(String[] args) {
        Q1MyDate d = null;

        try {
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
        }catch(NullPointerException e){
            d = new Q1MyDate(2035, 12, 25);
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
        }
    }
}
