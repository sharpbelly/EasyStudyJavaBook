package chapter06;

public class BestGirl extends GoodGirl{
    BestGirl(String name) {
        super(name);
    }

    public void show(){
        System.out.println(name+"은(는) 자바를 무지하게 잘 안다.");
    }
}
