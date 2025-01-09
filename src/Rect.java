public class Rect implements Shape, Painting, BorderColor {
    private double width;
    private double height;
    private String color;
    private String borderColor;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculatePerimetr() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void characteristic() {
        System.out.println("Прямоугольник: ");
        System.out.println("Периметр: " + calculatePerimetr());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + color);
        System.out.println("Цвет границы:  " + borderColor);

    }
}
