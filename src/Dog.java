public class Dog extends Animal {
    String name;
    static int dogCount = 0;

    Dog(String name) {
        super();
        dogCount++;
        this.name = name;
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

    static int getDogCount() {
        return dogCount;
    }
}