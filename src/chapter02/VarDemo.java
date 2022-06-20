package chapter02;

public class VarDemo {
    //var a = 1;       *** var은 메서드 내부에서만 사용할 수 있다.

    public static void main(String[] args) {
        int var = 1;
        var x = 1;

//         var x = 1, y = 3, z = 4     ** var을 사용하여 다수의 변수를 하나의 실행문으로 초기화할 수 없다.

//         var str = null;             ** var 변수에 null을 대입할 수 없다.

//        var oops;                    ** var 변수를 바로 초기화하지 않으면 타입을 추론할 수 없다.
//        oops = 1;                    **              ''

    }
//    void test(var x) {}              ** 12행처럼 변ㅅ x의 타입을 추론할 수 없다.
}
