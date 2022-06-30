package chapter06.other;

import chapter06.One;

public class Three {
    void Print(){
        One o = new One();

//        System.out.println(o.secret);
//        System.out.println(o.roommate);
//        System.out.println(o.child);

        // 다른 패키지에 있는 클래스라면 public 멤버만 접근할 수 있다.
        System.out.println(o.anybody);
    }
}
