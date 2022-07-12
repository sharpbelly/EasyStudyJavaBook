package chapter10;

import java.util.Comparator;

interface UseThis{void use();}

public class UseThisDemo {
    public void lambda(){
        String hi="Hi!";

        UseThis u1 = new UseThis(){
            public void use(){
                System.out.println(this);

                // 지역 객체에서 사용되는 외부 지역변수는 실질적으로 final이다. 따라서 변경될 수 없다.
//                hi= "Lambda.";
            }
        };
        u1.use();

        UseThis u2 = ()->{
            System.out.println(this);
            //람다식에서 사용되는 외부 지역변수도 실질적으로 final이다. 따라서 변경될 수 없다.
//            hi="Lambda.";
        };

        u2.use();
    }
    public String toString(){return "UseThisDemo";}

    public static void main(String[] args) {
        int one=1;
        new UseThisDemo().lambda();


        //람다식의 선언부에 외부에서 선언된 동일한 이름의 변수를 선언할 수 없다.
//        Comparator<String> c = (one, two) -> one.length()-two.length();
    }
}
