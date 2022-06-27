package chapter04;

public class CircleStaticDemo {
    public static void main(String[] args) {
        CircleStatic myCircle = new CircleStatic(10.0);
        CircleStatic yourCircle = new CircleStatic(5.0);

//        print();      main() 메서드는 정적 메서드이므로 인스턴스 메서드를 호출할 수 없다.

        System.out.println("원의 개수 : "+ CircleStatic.numOfCircles);
        System.out.println("원의 개수 : "+ yourCircle.numCircles);
    }

    void print(){
        System.out.println("인스턴스 메서드입니다.");
    }
}
