package chapter07;

public class Car implements Movable {
    private int pos = 0;

    @Override
    public void move(int x) {
        pos += x;
    }

    public void show() {
        System.out.println(pos + "m 이동했습니다.");
    }
}
