package absttactfactory;

/**
 * Abstract class to get factories for Normal and Rounded Shape Objects.
 */
public abstract class AbstractFactory {
    protected abstract Shape getShape(Shapes shapeType);
}
