public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;

    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " Не может бежать более 500 метров");
        } else {
            System.out.println(name + " бежит " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не может плыть более 10 метров");
        } else {
            System.out.println(name + " плывёт " + distance + " метров");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}




















