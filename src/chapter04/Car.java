package chapter04;

public class Car {
    static int numOfCar = 0;
    static int numOfRedCar = 0;
    String color;

    public Car(String color) {
        this.color = color;

        Car.numOfCar++;

        if(this.color=="red"||this.color=="RED")
            Car.numOfRedCar++;
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }

}
