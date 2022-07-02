package chapter06;

public class Q5 {
    public static void main(String[] args) {
        Q5Phone[] phone = {
            new Q5Phone("황진이"),
            new Q5Telephone("길동이", "내일"),
            new Q5Smartphone("민국이", "갤러그")
        } ;

        for(Q5Phone phones : phone){

            if(phones instanceof Q5Smartphone){
                ((Q5Smartphone) phones).playGame();
            }

            else if(phones instanceof  Q5Telephone){
                ((Q5Telephone) phones).autoAnswering();
            }

            else if(phones instanceof  Q5Phone){
                phones.talk();
            }
        }

    }
}
