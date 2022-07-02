package chapter06;

public class InstanceofDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();

        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
        System.out.println(p instanceof Student);

        // s가 String 타입과 관계없으므로 오류가 발생한다.
//        System.out.println(s instanceof String);

        downcast(s);
    }

    static void downcast(Person p) {
        if(p instanceof Student){
            Student s = (Student)p;
            System.out.println("ok, 하향 타입 변환");
        }
    }
}
