public class Worker {
     String name;
     String position;
     String email;
     long phone;
     int salary;
     int age;

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
}
