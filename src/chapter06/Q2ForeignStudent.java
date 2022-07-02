package chapter06;

public class Q2ForeignStudent extends Q2Student{
    String nationality;

    public Q2ForeignStudent(String name, int age, String studentNumber, String nationality) {
        super(name, age, studentNumber);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public void show(){
        System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %s, 국적 : %s]\n",name,age,StudentNumber,nationality);
    }
}
