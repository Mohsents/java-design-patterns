package factory;

/**
 * Factory pattern is one of the most used design patterns in Java.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 *
 * In Factory pattern, we create object without exposing the creation logic
 * to the client and refer to newly created object using a common interface.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory<Rectangle> factory = new ShapeFactory<>();
        Shape circular = factory.getShape(new Rectangle());
        circular.draw();
    }
}
