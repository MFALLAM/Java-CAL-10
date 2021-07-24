import java.util.*;

public class PhoneBook {
    private static Map<String, List<String>> phoneBook = new HashMap<>();

    /**
     * Справочник который хранит в себе список фамилий и телефонных номеров
     *
     * @param name
     * @param phoneNumbers
     */
    public static void add(String name, String phoneNumbers) {
        ArrayList<String> tempPhones = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            for (String mobiles : phoneBook.get(name)) {
                tempPhones.add(mobiles);
            }
            tempPhones.add(phoneNumbers);
            phoneBook.put(name, tempPhones);
        } else {
            phoneBook.put(name, Arrays.asList(phoneNumbers));
        }
    }

    /**
     * искать номер телефона по фамилии
     *
     * @param lastName
     * @return
     */
    public static List<String> getByLastName(String lastName) {
        return phoneBook.get(lastName);
    }

}
