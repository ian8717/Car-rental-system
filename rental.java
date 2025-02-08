import java.util.HashMap;
import java.util.Map;

public class rental {
    private Map<String, car> cars; // Stores cars by carId
    private Map<String, customer> customers; // Stores customers by customerId
    private Map<String, String> rentals; // Maps carId to customerId for active rentals

    // Constructor
    public rental() {
        cars = new HashMap<>();
        customers = new HashMap<>();
        rentals = new HashMap<>();

    }

    // Add a car to the agency
    public void addCar(car car) {
        cars.put(car.getCarId(), car);
    }

    // Add a customer to the agency
    public void addCustomer(customer customer) {
        customers.put(customer.getCustomerId(), customer);}

    // Rent a car to a customer
    public boolean rentCar(String carId, String customerId) {
        if (!cars.containsKey(carId) || !customers.containsKey(customerId)) {
            return false; // Car or customer not found
        }

        car car = cars.get(carId);
        if (!car.isAvailable()) {
            return false; // Car is already rented
        }

        car.setAvailable(false); // Mark car as rented
        rentals.put(carId, customerId); // Record the rental
        return true;
    }

    // Return a car
    public boolean returnCar(String carId) {
        if (!cars.containsKey(carId) || !rentals.containsKey(carId)) {
            return false; // Car not found or not rented
        }

        car car = cars.get(carId);
        car.setAvailable(true); // Mark car as available
        rentals.remove(carId); // Remove rental record
        return true;
    }

    // Display all cars
    public void displayCars() {
        for (car car : cars.values()) {
            System.out.println(car);
        }
    }

    // Display all customers
    public void displayCustomers() {
        for (customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    // Display all rentals
    public void displayRentals() {
        for (Map.Entry<String, String> entry : rentals.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " rented by Customer ID: " + entry.getValue());
        }
    }
}
