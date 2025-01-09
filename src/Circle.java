public class Circle implements Shape, Painting, BorderColor {
    private double radius;
    private String color;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void characteristics() {
        System.out.println("Круг: ");
        System.out.println("Периметр: " + calculatePerimetr());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + color);
        System.out.println("Цвет границы:  " + borderColor);
    }
}
