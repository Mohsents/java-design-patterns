package factory;

public class ShapeFactory<T extends Shape> {

    public Shape getShape(T shape) {
        if (shape == null) {
            return null;
        }

        String className = shape.getClass().getName();

        if (Circle.class.getName().equals(className)) {
            return new Circle();
        } else if (Rectangle.class.getName().equals(className)) {
            return new Rectangle();
        }

        return null;
    }
}
