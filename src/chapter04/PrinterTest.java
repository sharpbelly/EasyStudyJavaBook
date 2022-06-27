package chapter04;

public class PrinterTest {
    public static void main(String[] args) {
        Printer myPrint = new Printer(20,true);
        myPrint.print(13);
        myPrint.setDuplex(false);
        myPrint.print(10);
    }
}
