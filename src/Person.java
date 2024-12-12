public class Person {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
public static void main(String[] args){
    Person[] persArray = new Person[5];
    persArray[0] = new Person("Ivanov Ivan", "Enginner", "ivivan@mailbox.com", 892312312, 30000, 30);
    persArray[1] = new Person("Petrov Petr", "Manager", "petrow@.com", 789654123, 20000, 42);
    persArray[2] = new Person("Lavrov Ivan", "Engineer", "lavrov@.com", 879546213, 45000, 21);
    persArray[3] = new Person("Savina Olga", "Manager", "olga@.com", 874965123, 120000, 28);
    persArray[4] = new Person("Volkov Roman", "Engineer", "volk@.com", 258741369, 90000, 34);
    }
}
