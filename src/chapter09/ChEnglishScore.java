package chapter09;

import java.util.Scanner;

public class ChEnglishScore implements Comparable<ChEnglishScore> {
    String name;
    int score;

    public ChEnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name +", "+ score;
    }

    @Override
    public int compareTo(ChEnglishScore e) {
        ChEnglishScore c = (ChEnglishScore) e;

        return score < c.score ? 1 : (score > c.score ? -1 : 0);
    }

    static <T extends Comparable>T findBest(T[] a) {
        T best = a[0];

        for (T c : a) {
            if (best.compareTo(c) > 0)
                best = c;
        }
        return best;
    }

    public static void main(String[] args) {
        ChEnglishScore[] ea = {new ChEnglishScore("김삿갓", 77), new ChEnglishScore("장영실", 88), new ChEnglishScore("홍길동", 99)};
        ChMathScore[] ma = {new ChMathScore("김삿갓",80),new ChMathScore("장영실",98),new ChMathScore("홍길동",70)};

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));

    }
}

class ChMathScore implements Comparable<ChMathScore>{
    String name;
    int score;

    public ChMathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name +", "+ score;
    }

    @Override
    public int compareTo(ChMathScore o) {
        ChMathScore c = (ChMathScore) o;
        return score < c.score ? 1 : (score > c.score ? -1 : 0);
    }
}
