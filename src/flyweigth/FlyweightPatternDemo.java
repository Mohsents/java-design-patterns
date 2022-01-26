package flyweigth;

import java.util.Random;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created
 * and to decrease memory footprint and increase performance.
 * This type of design pattern comes under structural pattern as this pattern provides
 * ways to decrease object count thus improving the object structure of application.
 * Flyweight pattern tries to reuse already existing similar kind objects by storing them and
 * creates new object when no matching object is found. We will demonstrate
 * this pattern by drawing 20 circles of different locations but we will create only 5 objects.
 * Only 5 colors are available so color property is used to check already existing Circle objects.
 */
public class FlyweightPatternDemo {
    private static final String[] colors = new String[]{"Red", "Blue", "Green", "White", "Black"};

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
