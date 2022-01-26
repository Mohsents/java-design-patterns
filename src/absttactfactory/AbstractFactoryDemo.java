package absttactfactory;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern provides
 * one of the best ways to create an object.
 *
 * In Abstract Factory pattern an interface is responsible for creating a factory of related
 * objects without explicitly specifying their classes. Each generated factory can give
 * the objects as per the Factory pattern.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Shape circle = abstractFactory.getShape(Shapes.CIRCLE);
        Shape rectangle = abstractFactory.getShape(Shapes.RECTANGLE);

        abstractFactory = FactoryProducer.getFactory(true);

        Shape roundedCircle = abstractFactory.getShape(Shapes.ROUND_CIRCLE);
        Shape roundedRectangle = abstractFactory.getShape(Shapes.ROUND_RECTANGLE);

        circle.draw();
        rectangle.draw();

        roundedCircle.draw();
        roundedRectangle.draw();
    }
}
