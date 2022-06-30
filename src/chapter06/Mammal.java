package chapter06;

class Mammal extends Animal{
    public Mammal(){
        // super(); 부모 클래스의 디폴트 생성자가 없으므로 오류가 발생한다.
        super("원숭이");
        System.out.println("포유류 : 원숭이");
    }
    public Mammal(String s){
        super(s);
        System.out.println("포유류 : "+s);
    }
}
