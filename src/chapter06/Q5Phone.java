package chapter06;

public class Q5Phone {
    protected String owner;

    Q5Phone(String owner) {
        this.owner = owner;
    }

    void talk() {
        System.out.printf("%s가 통화 중이다.\n", owner);
    }
}
