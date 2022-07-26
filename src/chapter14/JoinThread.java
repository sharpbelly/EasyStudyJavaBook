package chapter14;

public class JoinThread extends Thread{
    int total;

    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            total +=1;
        }
    }
}

