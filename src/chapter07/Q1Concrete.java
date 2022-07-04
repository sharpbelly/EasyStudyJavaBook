package chapter07;

class Q1Concrete extends Q1Abstract {
    int j;

    public Q1Concrete(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i = " + i + " j = " + j);
    }
}
