package chapter07;

public class Q5TV extends Q5Controller{
    public Q5TV(boolean power) {
        super(power);
    }

    @Override
    void show() {
        super.show();
    }

    @Override
    String getName() {
        return "TV";
    }
}
