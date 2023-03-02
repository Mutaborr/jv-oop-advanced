package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    public String figureInfo() {
        return "Figure : Square, Area :" + getArea() + " Side: " + side + " Color: " + color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}