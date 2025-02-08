public class car {
    private String carId;
    private String model;
    private boolean isAvailable;

    // Constructor
    public car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.isAvailable = true; // By default, the car is available
    }

    // Getters and Setters
    public String getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
public String toString() {
    return "Car ID: " + carId + ", Model: " + model + ", Available: " + isAvailable;
}
}