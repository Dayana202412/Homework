
public class Main {
 public static void main(String[] args) {
  Circle circle = new Circle(20);
  circle.setColor("Красный");
  circle.setBorderColor("Чёрный");
  circle.characteristics();

  Rect rect = new Rect(2, 4);
  rect.setColor("Зелёный");
  rect.setBorderColor("Оранжевый");
  rect.characteristic();

  Triangle triangle = new Triangle(2, 4, 6);
  triangle.setColor("Голубой");
  triangle.setBorderColor("Жёлтый");
  triangle.characteristic();


  Dog dog = new Dog("Tolik");
  dog.run(250);
  dog.swim(12);

  Cat cat = new Cat("Tosik");
  cat.run(10);
  cat.swim(30);

  System.out.println("Общее количество животных: " + Animal.getAnimalCount());
  System.out.println("Общее количество котов: " + Cat.getCatCount());
  System.out.println("Общее количество собак: " + Dog.getDogCount());

  Cat[] cats = {
          new Cat("Tosik"),
          new Cat("Murzik")};
  Bowl bowl = new Bowl(40);
  for (Cat cat1 : cats) {
   cat.eat(bowl, 20);
  }
  for (Cat cat1 : cats) {
   System.out.println("Кот сыт: " + !cat.isHungry());
  }
  bowl.addFood(50);


 }
}
