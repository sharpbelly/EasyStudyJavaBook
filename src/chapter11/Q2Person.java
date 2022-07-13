package chapter11;

public class Q2Person {
    String name;
    int age;

    public Q2Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return String.format("Person[%s %d] ",name, age);
    }
}
