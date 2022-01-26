package decorator;

/**
 * Decorator pattern allows a user to add new functionality to an
 * existing object without altering its structure.
 * This type of design pattern comes under structural pattern as
 * this pattern acts as a wrapper to existing class.
 * This pattern creates a decorator class which wraps the original class and provides
 * additional functionality keeping class methods signature intact.
 * We are demonstrating the use of decorator pattern via following
 * example in which we will decorate a shape with some color without alter shape class.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        RedShape redCircle = new RedShape(new Circle());
        RedShape redRectangle = new RedShape(new Rectangle());

        redCircle.draw();
        redRectangle.draw();
    }
}