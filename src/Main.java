//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args) {
        Worker worker1 = new Worker("Петров Петр Петрович","Секретарь", "petrov@com", 14725836, 55000, 25);
        worker1.info();


        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Ivanov Ivan", "Enginner", "ivivan@mailbox.com", 892312312, 30000, 30);
        workArray[1] = new Worker("Petrov Petr", "Manager", "petrow@.com", 789654123, 20000, 42);
        workArray[2] = new Worker("Lavrov Ivan", "Engineer", "lavrov@.com", 879546213, 45000, 21);
        workArray[3] = new Worker("Savina Olga", "Manager", "olga@.com", 874965123, 120000, 28);
        workArray[4] = new Worker("Volkov Roman", "Engineer", "volk@.com", 258741369, 90000, 34);


        Park1 park = new Park1 ("Park");
        Park1.Attraction attraction1 = park.new Attraction("Аттракцион 1", "9:00 - 15-00", 5.50);
        attraction1.info();

    }
}