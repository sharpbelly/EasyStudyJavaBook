package chapter12;

import java.util.List;
import java.util.stream.Stream;

public class Q6 {
    public static void main(String[] args) {
        Stream<Q6Population> sp= Q6Population.lp.stream();
        Stream<Q6Population> m1 = sp.filter(i->i.population>300.0);
        m1.forEach(x-> System.out.println(x));

    }
}



class Q6Population{
    String capital;
    Double population;

    public Q6Population(String capital, Double population) {
        this.capital = capital;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public Double getPopulation() {
        return population;
    }

    public String toString(){
        return String.format("%s(%.1f)",capital,population);
    }

    public static final List<Q6Population> lp = List.of(
            new Q6Population("서울",973.7),
            new Q6Population("워싱턴",63.2),
            new Q6Population("베이징",2115.0),
            new Q6Population("파리",224.4),
            new Q6Population("마드리드",326.5),
            new Q6Population("런던",853.9)
    );
}
