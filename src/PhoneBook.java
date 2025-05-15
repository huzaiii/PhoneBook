import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    private TreeMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public void addEntry(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public String searchEntry(String name) {
        return phoneBook.get(name);
    }

    public void displayEntries() {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }


}
