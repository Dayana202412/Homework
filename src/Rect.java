public class Rect implements Shape {
    private String name;
    private String color;
    private String borderColor;
    private double width;
    private double height;


    public Rect(String name, String color, String borderColor, double width, double height) {
        this.name = name;
        this.color = color;
        this.borderColor = borderColor;
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * (width + height);
    }

    @Override

    public double calculateArea() {
        return width * height;
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
