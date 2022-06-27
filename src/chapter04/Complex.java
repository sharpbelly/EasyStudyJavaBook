package chapter04;

public class Complex {
    double com, com1;

    public Complex(double com) {
        this.com = com;
    }

    public Complex(double com, double com1) {
        this.com = com;
        this.com1 = com1;
    }

    public void print() {
        System.out.printf("%.1f + %.1fi\n", com, com1);
    }

}
