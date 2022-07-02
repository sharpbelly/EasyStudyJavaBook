package chapter06;

public class Q2Student extends Q2Person{
    String StudentNumber;

    public Q2Student(String name, int age, String studentNumber) {
        super(name, age);
        StudentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    @Override
    public void show() {
        System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %s]\n",name,age,StudentNumber);
    }
}
