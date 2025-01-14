abstract class Animal {
    protected String name;
    protected static int animalCount = 0;


    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name + "проплыл " + distance + " метров");
    }
}































