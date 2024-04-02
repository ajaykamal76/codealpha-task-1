import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HotelReviewSystem {
    private Map<String, Integer> hotelRatings;

    public HotelReviewSystem() {
        hotelRatings = new HashMap<>();
    }

    public void addReview(String hotelName, int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating! Rating should be between 1 and 5.");
            return;
        }
        if (hotelRatings.containsKey(hotelName)) {
            int currentRating = hotelRatings.get(hotelName);
            hotelRatings.put(hotelName, (currentRating + rating) / 2);
        } else {
            hotelRatings.put(hotelName, rating);
        }
    }

    public void printHotelRatings() {
        System.out.println("Hotel Ratings:");
        for (Map.Entry<String, Integer> entry : hotelRatings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HotelReviewSystem reviewSystem = new HotelReviewSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Review\n2. View Ratings\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter hotel name: ");
                    String hotelName = scanner.nextLine();
                    System.out.print("Enter rating (1-5): ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); 
                    reviewSystem.addReview(hotelName, rating);
                    break;
                case 2:
                    reviewSystem.printHotelRatings();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
