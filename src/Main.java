import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {
                "Яблоко", "Дыня", "Арбуз", "Арбуз",
                "Манго", "Мандарин", "Киви", "Хурма",
                "Яблоко", "Киви", "Гранат", "Манго",
        };

        HashSet<String> fruitsUnique = new HashSet<>(Arrays.asList(fruits));

        HashMap<String, Integer> countFruits = new HashMap<>();
        for (String fruit : fruits) {
            countFruits.put(fruit, countFruits.getOrDefault(fruit, 0) + 1);
        }
        System.out.println("Уникальные слова: " + fruitsUnique);

        System.out.println("Слово встречается:");
        for (Map.Entry<String, Integer> entry : countFruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Котов", "125478");
        phoneBook.add("Яшин", "101203");
        phoneBook.add("Котов", "963852");

        System.out.println("Котов: " + phoneBook.get("Котов"));
        System.out.println("Яшин: " + phoneBook.get("Яшин"));
        System.out.println("Кравцов: " + phoneBook.get("Кравцов"));
    }
}