
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", "Синий", "Жёлтый", 25);
        Rect rect = new Rect("Прямоугольник", "Зелёный", "Голубой", 25, 15);
        Triangle triangle = new Triangle("Треугольник", "Оранжевый", "Чёрный", 15, 12, 14);
        circle.printInfo();
        rect.printInfo();
        triangle.printInfo();


        Dog dog = new Dog("Tolik");
        dog.run(250);
        dog.swim(12);

        Cat cat1 = new Cat("Tosik");
        cat1.run(10);
        cat1.swim(30);

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("Общее количество котов: " + Cat.getCatCount());
        System.out.println("Общее количество собак: " + Dog.getDogCount());

        Cat[] cats = {
                new Cat("Tosik"),
                new Cat("Murzik")};
        Bowl bowl = new Bowl(10);
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт: " + cat.isHungry());
        }
        bowl.addFood(50);


    }
}
