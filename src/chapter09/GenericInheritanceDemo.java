package chapter09;

import java.util.ArrayList;

public class GenericInheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Beverage> list1 = new ArrayList<>();
        list1.add(new Beer());
        beverageTest(list1);

        ArrayList<Beer> list2 = new ArrayList<>();
        list2.add(new Beer());
        // ArrayList<Beer>는 ArrayList<Beverage>의 자식 타입이 아니다. 따라서 컴파일 오류가 발생한다.
//        beverageTest(list2);
    }

    static public void beverageTest(ArrayList<Beverage> list){

    }
}
