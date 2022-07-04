package chapter07;

public class ChallangeTree extends ChallangeCountable{


    public ChallangeTree(String name, int num) {
        super(name, num);
    }

    void ripen(){
        System.out.println(num+"그루 "+name+"에 열매가 잘 익었다.");
    }

    @Override
    public void count() {
        System.out.println(name+"가 "+num+"그루 있다.");
    }
}
