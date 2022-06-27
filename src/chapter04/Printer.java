package chapter04;

public class Printer {
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    void print(int amount) {

        String halfOrBothSides = "";

        if (getDuplex() == true)
            halfOrBothSides = "양면";
        else
            halfOrBothSides = "단면";


        if (this.numOfPapers <= 0) {
            System.out.println("용지가 없습니다.");
            return;
        } else if (this.numOfPapers < amount) {
            System.out.println(halfOrBothSides + "으로 모두 출력하려면 용지가 " + (amount - this.numOfPapers) + "매 부족합니다. " + this.numOfPapers + "장만 출력합니다.");
            this.numOfPapers -= amount;
            return;
        } else
            this.numOfPapers -= amount;

        System.out.println(halfOrBothSides + "으로 " + amount + "장 출력했습니다. 현재 " + this.numOfPapers + "장 남아 있습니다.");

    }


}
