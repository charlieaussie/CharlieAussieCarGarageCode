package Cars;

public class Tesla extends SuperCar {

    public String[] colors = {"White", "Silver", "Red", "Black"};
    private double price;
    private double rentPricePerDay;
    private String name;
    private String model;
    public  boolean electricDriven;
    private String fuel;

    @Override
    public String getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(String fuel) {
        this.fuel = fuel;
        this.fuel = "no fuel";
    }

    public Tesla(String name, String model, boolean electricDriven, double price, double rentPricePerDay,String fuel) {
        super("Tesla");
        this.name = name;
        this.model = model;
        this.price = price;
        this.rentPricePerDay = rentPricePerDay;
        this.electricDriven = true;
        this.fuel = fuel;
    }

    public void setRentPricePerDay(double rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
        this.rentPricePerDay = 819.99;
    }

    public double getRentPricePerDay() {
        return this.rentPricePerDay;
    }

    public void setName(String newName) {
        this.name = newName;
        name = "Tesla";
    }

    public String getName() {
        return this.name;

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
        this.model = "X Series";
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        price = 1200000;

    }

    public double getPrice() {
        return this.price;
    }

}
