package chapter06;

public class Girl {
    protected String name;

    void show(){
        System.out.println(name+"은(는) 자바 초보자이다.");
    }

    Girl(String name){
        this.name=name;
    }
}
