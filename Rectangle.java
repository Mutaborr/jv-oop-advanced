package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String figureInfo() {
        return "Figure : Rectangle, Area :" + getArea() + " Width: "
                + width + " Height: " + height + " Color: " + color;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}