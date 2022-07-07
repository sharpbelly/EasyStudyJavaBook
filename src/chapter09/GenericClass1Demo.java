package chapter09;

public class GenericClass1Demo {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Beer());
        Beer b1 = (Beer) c.getBeverage();

        c.setBeverage(new Boricha());

        // Cup에 있는 Boricha 객체를 Beer 타입으로 변환하므로 실행 오류가 발생한다.
        b1 = (Beer) c.getBeverage();
    }
}
