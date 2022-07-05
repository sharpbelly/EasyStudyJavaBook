package chapter08;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저","홍길동");
        Car yourCar = new Car("그랜저","홍길동");

        if(myCar.equals(yourCar)){
            System.out.printf("자동차 모델이 둘 다 [%s]로 동일하다.\n",myCar.Carname);
        }else{
            System.out.printf("내 자동차는 [%s], 너 자동차는 [%s]로 모델이 다르다.\n",myCar.Carname,yourCar.Carname);
        }

        Date d = new Date();
        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");
        String s = date.format(d);

        Object[] data = {myCar.Carname,myCar.userName};
        MessageFormat massage = new MessageFormat("자동차 모델=[{0}], 운전자({1})");

        System.out.println("날짜: "+s+", "+ massage.format(data));

        StringTokenizer st1 = new StringTokenizer(s, " ,=[]()");
        StringTokenizer st2 = new StringTokenizer(massage.format(data), " ,=[]()");

        System.out.println("날짜: ");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
