package chapter08;

public class Car {
    String Carname;
    String userName;

    public Car(String name, String userName) {
        this.Carname = name;
        this.userName = userName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car){
            Car c = (Car) obj;
            if(Carname.equals(c.Carname))
                return true;
        }
        return false;
    }
}
