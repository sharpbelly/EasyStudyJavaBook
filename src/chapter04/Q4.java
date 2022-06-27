package chapter04;

// 생산된 모든 자동차와 빨간색 자동차의 개수를 출력하는 Car 클래스를 작성하라. 그리고 다음 코드를 사용해 테스트하라.
public class Q4 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(),Car.getNumOfRedCar());
    }
}
