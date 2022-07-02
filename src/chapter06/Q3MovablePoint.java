package chapter06;

public class Q3MovablePoint extends Q3Point {

    private int xSpeed, ySpeed;

    public Q3MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
    public String toString(){

        return "x : "+ getX() + " y : "+getY()+ " xSpeed : "+xSpeed+" ySpeed : "+ySpeed;
    }
}
