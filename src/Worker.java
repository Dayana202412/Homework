public class Worker {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Worker(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age );
    }
    public static void main(String [] args) {
        Worker worker1 = new Worker("Петров Петр Петрович","Секретарь", "petrov@com", 14725836, 55000, 25);
        worker1.info();

    }
}
