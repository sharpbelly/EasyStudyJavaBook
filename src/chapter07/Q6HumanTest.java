package chapter07;

import chapter06.Student;

public class Q6HumanTest {
    public static void main(String[] args) {
        Q6Human.echo();

        Q6Student s = new Q6Student(20);
        s.print();
        s.eat();

        Q6Human p = new Q6Worker();
        p.print();
        p.eat();
    }
}
