public class Cat extends Animal {
    private static int catCount = 0;
    private boolean hungry;

    public Cat(String name) {
        super(name);
        catCount++;
        this.name = name;
        this.hungry = true;

    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " Не может бежать более 200 метров");
        } else {
            System.out.println(name + " бежит " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    static int getCatCount() {
        return catCount;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            hungry = false;
            System.out.println("Теперь кот сыт");
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }
}





























