import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BugTrackingSystem bugTrackingSystem = new BugTrackingSystem();

        while (true) {
            System.out.println("\nBug Tracking System Menu:");
            System.out.println("1. Add Bug");
            System.out.println("2. Resolve Bug");
            System.out.println("3. List Bugs");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter bug description: ");
                    String description = scanner.nextLine();
                    bugTrackingSystem.addBug(description);
                    break;
                case 2:
                    System.out.print("Enter bug ID to resolve: ");
                    int bugId = scanner.nextInt();
                    bugTrackingSystem.resolveBug(bugId);
                    break;
                case 3:
                    bugTrackingSystem.listBugs();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
