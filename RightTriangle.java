package core.basesyntax;

public class RightTriangle extends Figure {

    private double firstCatet;
    private double secondCatet;

    public RightTriangle(int firstCatet, int secondCatet, Color color) {
        this.firstCatet = firstCatet;
        this.secondCatet = secondCatet;
        this.color = color;
    }

    public String figureInfo() {
        return "Figure : Right Triangle, Area :" + getArea()
                + " Catet1: " + firstCatet + " Catet2: " + secondCatet
                + " Color: " + color;
    }

    @Override
    public double getArea() {
        return (firstCatet * secondCatet) / 2;
    }
}
