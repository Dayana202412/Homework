public class Circle implements Shape {
    private String name;
    private String color;
    private String borderColor;
    private double radius;

    public Circle(String name, String color, String borderColor, double radius) {
        this.name = name;
        this.color = color;
        this.borderColor = borderColor;
        this.radius = radius;

    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double calculatePerimetr() {

        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override

    public String borderColor() {
        return borderColor;
    }

    @Override
    public void printInfo() {
        Shape.super.printInfo();
    }
}
