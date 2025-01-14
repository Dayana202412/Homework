public interface Shape {
    String name();

    default double calculatePerimetr() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }

    String color();

    String borderColor();

    default void printInfo() {
        System.out.println(name());
        System.out.println("Периметр: " + calculatePerimetr());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + color());
        System.out.println("Цвет границы: " + borderColor());
    }
}

