import java.util.Scanner;

class Flight {
     String flightNumber;
     String departure;
     String destination;
     double price;

    public Flight(String flightNumber, String departure, String destination, double price) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class TravelBookingSystem {
    public static void main(String[] args) {
        
        Flight flight1 = new Flight("F123", "New York", "London", 500);

        
        System.out.println("Available Flights:");
        System.out.println("1. " + flight1.flightNumber + " - " + flight1.departure + " to " + flight1.destination + " - $" + flight1.getPrice());

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter flight number: ");
        
        double totalCost = flight1.getPrice();

        
        System.out.println("\nTotal Cost: $" + totalCost);

        scanner.close();
    }
}
