public class Triangle implements Shape {
    private String name;
    private String color;
    private String borderColor;
    private double side1;
    private double side2;
    private double side3;


    public Triangle(String name, String color, String borderColor, double side1, double side2, double side3) {
        this.name = name;
        this.color = color;
        this.borderColor = borderColor;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String name() {
        return name;
    }

    @Override

    public double calculatePerimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        double halfPerimetr = calculatePerimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String borderColor() {
        return borderColor;
    }

    public void printInfo() {
        Shape.super.printInfo();

    }
}