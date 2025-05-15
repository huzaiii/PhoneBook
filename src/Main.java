import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Phone Book Menu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Search Entry");
            System.out.println("3. Display All Entries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    pb.addEntry(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.nextLine();
                    String result = pb.searchEntry(searchName);
                    if (result != null) {
                        System.out.println("Phone Number: " + result);
                    } else {
                        System.out.println("Entry not found.");
                    }
                    break;
                case 3:
                    pb.displayEntries();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}