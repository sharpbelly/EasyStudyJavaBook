package chapter06;

public class Q5Telephone extends Q5Phone {
    private String when;

    Q5Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    void autoAnswering() {
        System.out.printf("%s가 없다. %s 전화 줄래.\n", owner, when);
    }
}
