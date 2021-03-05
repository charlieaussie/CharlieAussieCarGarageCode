package Cars;

public class CarVolvo extends SuperCar {
    public SuperCar cars;
    private String name;
    private String model;
    private String fuel;
    private double rentPricePerDay;
    private double price;
    public String[] colors = {"Red", "Blue", "White", "Silver","Black"};


    public CarVolvo (String name, String model, String fuel, double price, double rentPricePerDay) {
        super("Volvo");
        this.name = name;
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.rentPricePerDay = rentPricePerDay;
    }

    public void setColors(String[] newColors) {
        this.colors = newColors;
        this.colors = new String[]{"Red", "Blue", "White", "Silver","Black"};
    }

    public String[] getColors() {
        return colors;
    }

    public void setRentPricePerDay(double pricePerDay) {
        this.rentPricePerDay = pricePerDay;
        this.rentPricePerDay = 240.0;
    }

    public double getRentPricePerDay() {
        return this.rentPricePerDay;
    }

    public void setName(String newName) {
        this.name = newName;
        name = "Volvo";
    }

    public String getName() {
        return this.name;

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
        model = "V90";
    }

    public void setFuel(String newFuel) {
        this.fuel = fuel;
        fuel = "Diesel";

    }

    public String getFuel() {
        return this.fuel;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        this.price = 120000;

    }

    public double getPrice() {
        return this.price;
    }
}
