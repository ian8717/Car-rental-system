public class customer {
    private String customerId;
    private String name;

    // Constructor
    public customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
