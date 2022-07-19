package chapter12;

import java.util.List;

public class Nation {
    private final String name;
    private final Type type;
    private final double population;
    private final int gdpRank;

    private final Type2 type2;

    public Nation(String name, Type type, double population, int gdpRank, Type2 type2) {
        this.name = name;
        this.type = type;
        this.population = population;
        this.gdpRank = gdpRank;
        this.type2 = type2;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isIsland() {
        return getType() != Type.LAND;
    }

    public double getPopulation() {
        return population;
    }

    public int getGdpRank() {
        return gdpRank;
    }

    public Type2 getType2() {
        return type2;
    }

    public enum Type {LAND, ISLAND}
    public enum Type2 {선진국, 개도국}

    public String toString() {
        return name;
    }

    public static final List<Nation> nations = List.of(
            new Nation("ROK", Type.LAND, 51.4, 11, Type2.선진국),
            new Nation("New Zealand", Type.ISLAND, 4.5, 49, Type2.개도국),
            new Nation("USA", Type.LAND, 318.9, 1, Type2.선진국),
            new Nation("China", Type.LAND, 1355.7, 2, Type2.선진국),
            new Nation("Philiphine", Type.ISLAND, 107.7, 36, Type2.개도국),
            new Nation("United Kingdom", Type.ISLAND, 63.7, 5, Type2.선진국),
            new Nation("Sri Lanka", Type.ISLAND, 21.9, 63, Type2.개도국),
            new Nation("Morocco", Type.LAND, 33.0, 60, Type2.개도국)
    );
}
