package chapter07;

public class ChallangeBird extends ChallangeCountable{

    public ChallangeBird(String name, int num) {
        super(name, num);
    }

    void fly(){
        System.out.println(num+"마리 "+name+"가 날아간다.");
    }

    @Override
    public void count() {
        System.out.println(name+"가 "+num+"마리 있다.");
    }
}
