package chapter09;

public class Q6Box<T> {

    public double max(Number first, Number second) {

        double a = first.doubleValue();
        double b = second.doubleValue();

        if(a>b)
            return a;
        return b;
    }

    public String max(String first, String second){

        if(first.length()>second.length()) return first;
        else return second;

    }


}
