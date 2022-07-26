package chapter14;

public class Thread1Demo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        for(int i=0;i<5;i++){
            System.out.print("안녕. ");
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for(int i=0;i<4;i++){
                System.out.print("잘가. ");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
