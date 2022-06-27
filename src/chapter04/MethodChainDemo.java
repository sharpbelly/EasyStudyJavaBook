package chapter04;

public class MethodChainDemo {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("주원").setAge(30).sayHello();
    }
}
