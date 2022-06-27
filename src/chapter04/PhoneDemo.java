package chapter04;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.model = "갤럭시 S22";
        myPhone.value = 100;
        myPhone.print();

        Phone yourPhone = new Phone();
        yourPhone.model = "IPhone 12 Pro Max";
        yourPhone.value = 150;
        yourPhone.print();
    }
}
