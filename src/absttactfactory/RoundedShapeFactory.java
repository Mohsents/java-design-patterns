package absttactfactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    protected Shape getShape(Shapes shapeType) {
        if (shapeType.equals(Shapes.ROUND_CIRCLE)) {
            return new RoundCircle();
        } else if (shapeType.equals(Shapes.ROUND_RECTANGLE)) {
            return new RoundRectangle();
        }

        return null;
    }
}