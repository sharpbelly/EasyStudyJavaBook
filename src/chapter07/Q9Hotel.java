package chapter07;

public class Q9Hotel {

    int[] roomNum=new int[10];
    String[] name= new String[10];
    int num;
    int[] flag = new int[10];


    void add(int roomNum, String name){
        num = roomNum;
        this.roomNum[num] = roomNum;
        this.name[num]=name;
        this.flag[num] = 1;

    }

    void show(){

        for(int i=0;i< roomNum.length;i++){
            if(flag[i] ==1)
                System.out.println(roomNum[i]+"번 방을 "+name[i]+"가 예약했습니다.");
        }

    }
}
