package chapter07;

public class Q5Radio extends Q5Controller{
    public Q5Radio(boolean power) {
        super(power);
    }

    @Override
    void show() {
        super.show();
    }

    @Override
    String getName() {
        return "라디오";
    }
}
