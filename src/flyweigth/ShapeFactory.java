package flyweigth;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a new circle with color: " + color);
        }
        return circle;
    }
}
