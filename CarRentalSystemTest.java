import java.util.Scanner;

public class CarRentalSystemTest {
    public static void main(String[] args) {
        // Create a rental agency
        rental agency = new rental();

        // Add cars
        car car1 = new car("C001", "Toyota Corolla");
        car car2 = new car("C002", "Honda Civic");
        car car3 = new car("C003", "Fielder");
        car car4 = new car("C004", "Subaru");
        car car5 = new car("C005", "Mazda Demio");
        car car6 = new car("C006", "Prado Tx");
        agency.addCar(car1);
        agency.addCar(car2);
        agency.addCar(car3);
        agency.addCar(car4);
        agency.addCar(car5);
        agency.addCar(car6);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        // Create a customer with the user's name
        customer customer = new customer("CU001", customerName);
        agency.addCustomer(customer);

        // Display cars and customers
        System.out.println("\nAvailable Cars:");
        agency.displayCars();
        System.out.println("\nCustomers:");
        agency.displayCustomers();

        // Rent a car
        System.out.print("\nEnter the car ID you want to rent: ");
        String carId = scanner.nextLine();

        boolean rentSuccess = agency.rentCar(carId, customer.getCustomerId());
        if (rentSuccess) {
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Failed to rent car. Please check the car ID and availability.");
        }

        // Display rentals
        System.out.println("\nActive Rentals:");
        agency.displayRentals();

        // Return a car
        System.out.print("\nEnter the car ID you want to return: ");
        carId = scanner.nextLine();

        boolean returnSuccess = agency.returnCar(carId);
        if (returnSuccess) {
            System.out.println("Car returned successfully!");
        } else {
            System.out.println("Failed to return car. Please check the car ID.");
        }

        // Display rentals after return
        System.out.println("\nActive Rentals after return:");
        agency.displayRentals();

        // Close the scanner
        scanner.close();
    }
}
    

