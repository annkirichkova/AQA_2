import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        directory.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        if (directory.containsKey(surname)) {
            return directory.get(surname);
        } else {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "123-45-67");
        phoneDirectory.add("Иванов", "234-56-78");
        phoneDirectory.add("Иванов", "345-67-89");
        phoneDirectory.add("Петров", "456-78-90");
        phoneDirectory.add("Сидоров", "567-89-90");

        String surname = "Иванов";
        List<String> phones = phoneDirectory.get(surname);

        System.out.println("Телефоны по фамилии " + surname + ":");
        for (String phone : phones) {
            System.out.println(phone);
        }
    }
}