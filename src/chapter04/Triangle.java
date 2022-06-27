package chapter04;

public class Triangle {
    private double d;
    private double w;

    public Triangle(double d, double w) {
        this.d = d;
        this.w = w;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double findArea() {
        double a = this.d * this.w * 0.5;
        return a;
    }

    public boolean isSameArea(Triangle t) {
        if (this.findArea() == t.findArea()) {
            return true;
        }
        return false;
    }
}
