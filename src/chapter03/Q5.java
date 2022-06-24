package chapter03;

//각 변의 길이 합이 20 이하이며 각 변의 길이가 정수인 직각 삼각형의 모든 변을 구하라.

public class Q5 {
    public static void main(String[] args) {
        int a,b,c;

        for(a=1;a<20;a++){
            for(b=1;b<20;b++){
                for(c=1;c<20;c++){
                    if(((a*a)+(b*b)==(c*c)) && (a+b+c) <= 20){
                        System.out.println("a : "+a+", b : "+b+", c : "+c);
                    }
                }
            }
        }

    }
}
