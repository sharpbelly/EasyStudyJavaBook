package chapter06;

public class Q2Person {
    String name;
    int age;

    public Q2Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.printf("사람[이름 : %s, 나이 : %d]\n",name,age);
    }

}
