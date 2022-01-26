package absttactfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    protected Shape getShape(Shapes shapeType) {
        if (shapeType.equals(Shapes.CIRCLE)) {
            return new Circle();
        } else if (shapeType.equals(Shapes.RECTANGLE)) {
            return new Rectangle();
        }

        return null;
    }
}