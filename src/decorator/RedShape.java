package decorator;

public class RedShape extends ShapeDecorator {
    private final Shape shape;

    public RedShape(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        super.draw();
        makeCircleRed(shape);
    }

    private void makeCircleRed(Shape shape) {
        System.out.println(shape.getClass().getSimpleName() + " color changed to red.");
    }
}