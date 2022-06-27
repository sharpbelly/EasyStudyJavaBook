package chapter04;

// 골프채를 모델링한 GolfClub 클래스를 작성하고, 다음 프로그램으로 테스트하라.
public class Q7 {
    public static void main(String[] args) {

        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
