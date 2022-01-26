package bridge;

public class Circle extends Shape{
    private final int radius, x, y;

    public Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
