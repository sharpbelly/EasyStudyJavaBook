package chapter04;

public class GolfClub {
    int iron;
    String putter;

    public GolfClub(){
        this.iron = 7;
    }

    public GolfClub(int iron){
        this.iron=iron;
    }

    public GolfClub(String putter){
        this.putter = putter;
    }

    public void print(){
        if(this.putter == null)
            System.out.println(this.iron+"번 아이언 입니다.");
        else
            System.out.println(this.putter+"입니다.");
    }
}
