public class Triangle implements Shape, Painting, BorderColor {
    private double side1;
    private double side2;
    private double side3;
    private String color;
    private String borderColor;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimetr() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double halfPerimetr = calculatePerimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void characteristic() {
        System.out.println("Треугольник: ");
        System.out.println("Периметр: " + calculatePerimetr());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + color);
        System.out.println("Цвет границы:  " + borderColor);
    }
}