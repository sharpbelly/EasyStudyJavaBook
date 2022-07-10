package chapter09;

public class Q4PairTest {
    public static void main(String[] args) {
        Q4Pair<Integer> p1 = new Q4Pair<>(10,20);
        Q4Pair<Double> p2 = new Q4Pair<>(10.0,20.0);

        System.out.println((Integer) p1.first());
        System.out.println((Double)p2.second());

    }
}
