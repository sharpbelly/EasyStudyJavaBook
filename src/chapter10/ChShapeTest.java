package chapter10;

import java.util.ArrayList;
import java.util.List;

public class ChShapeTest {
    public static void main(String[] args) {
        List<ChShape> RecShape = findShapesByType(ChShape.shapes, c -> c.getType());
        System.out.println("사각형 : " + RecShape);
        List<ChShape> smallRedShape = findShapesByColorNArea(ChShape.shapes, c -> c.getColor());

    }

    static List<ChShape> findShapesByType(List<ChShape> shapes, String type) {
        List<ChShape> result = new ArrayList<>();

        return result;
    }

    static List<ChShape> findShapesByColorNArea(List<ChShape> shapes, String color) {
        List<ChShape> result = new ArrayList<>();
        return shapes;
    }


}
