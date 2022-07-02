package chapter06;

public class Q2 {
    public static void main(String[] args) {
        Q2Person[] q2Person = {
                new Q2Person("길동이",22),
                new Q2Student("황진이",23,"100"),
                new Q2ForeignStudent("Amy",30,"200","U.S.A")
        };

        for(Q2Person q : q2Person){
            q.show();
        }
    }
}
