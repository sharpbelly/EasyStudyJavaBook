package chapter06;

public class GoodGirl extends Girl{
    GoodGirl(String name) {
        super(name);
    }

    public void show(){
        System.out.println(name+"은(는) 자바를 잘 안다.");
    }
}
