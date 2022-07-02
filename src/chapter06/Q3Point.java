package chapter06;

public class Q3Point {
    private int x,y;

    public Q3Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){

        return "x : " + x + " y : "+ y;
    }
}
