import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> vehicles = new ArrayList<>(Arrays.asList(
                "Toyota", "BMW", "Mercedes-Benz", "Hyundai", "Ford", "Infiniti",
                "Kia", "Tesla", "Lexus", "Maserati", "Kia",
                "BMW", "Mercedes-Benz", "Kia", "Lexus", "Nissan",
                "Volvo", "Fiat", "Nissan", "BMW", "Hyundai", "Toyota",
                "Kia", "BMW", "Volvo", "Jeep", "Bentley", "Cadillac", "Fiat",
                "Genesis", "Infiniti", "Jeep", "Audi", "Mercedes-Benz"
        ));

        Set<String> set = new HashSet<>(vehicles);
        System.out.println("уникальные значения: " + set);

        System.out.println("\t");

        Map<String, Integer> holder = new HashMap<>();

        for (String vehicle : vehicles) {
            int value = holder.getOrDefault(vehicle, 0) + 1;
            holder.put(vehicle, value);
        }

        System.out.println("Повторяющиеся слова: " + holder);

        System.out.println("\t");
        // Домашнее задание 2

        PhoneBook.add("Mohammed", "+7(919) 123-456-7");
        PhoneBook.add("Mohammed", "+7(919) 426-700-5");
        PhoneBook.add("Mohammed", "+7(928) 777-555-1");

        PhoneBook.add("Allam", "+7(928) 172-432-0");

        System.out.println("Mohammed " + PhoneBook.getByLastName("Mohammed"));
        System.out.println("Allam " + PhoneBook.getByLastName("Allam"));

    }

}
