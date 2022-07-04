package chapter07;

public class Q6Student implements Q6Human{
    int age;
    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println(age+"세의 학생입니다.");
    }

    public Q6Student(int age) {
        this.age=age;
    }
}
