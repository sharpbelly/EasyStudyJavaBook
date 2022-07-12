package chapter10;

import java.util.Arrays;
import java.util.List;

public class ChShape {
    private String type;
    private String color;
    private Double area;

    public ChShape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }

    public String toString() {
        return String.format("%s(%s, %f)", type, color, area);
    }

    public static final List<ChShape> shapes = Arrays.asList(
            new ChShape("삼각형", "빨간색", 10.5), new ChShape("사각형", "파란색", 11.2),
            new ChShape("원", "파란색", 16.5), new ChShape("원", "빨간색", 5.3),
            new ChShape("원", "노란색", 8.1), new ChShape("사각형", "파란색", 20.7),
            new ChShape("삼각형", "파간색", 3.4), new ChShape("사각형", "빨간색", 12.6));
}
