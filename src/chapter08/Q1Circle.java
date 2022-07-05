package chapter08;

public class Q1Circle {
    int number;

    public Q1Circle(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Q1Circle){
            Q1Circle c = (Q1Circle) obj;
            if(number == c.number)
                return true;
        }
        return false;
    }
}
