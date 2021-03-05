package Cars;

public class CarBMW extends SuperCar {
    private double price;
    private String name;
    private String model;
    private String fuel;
    // See if I can change colors to private
    public String[] colors ={"White", "Blue", "Black", "Grey"};
    private double rentPricePerDay;


    public CarBMW(String name, String model, String fuel, double price, double rentPricePerDay) {
        super("BMW");
        this.name = name;
        this.model = model;
        this.price = price;
        this.fuel = fuel;
        this.rentPricePerDay = rentPricePerDay;

    }

    public void setRentPricePerDay(double rentPricePerDay){
        this.rentPricePerDay = rentPricePerDay;
        rentPricePerDay = 344.99;

    }
    public double getRentPricePerDay(){
       return rentPricePerDay;
    }

    public void setColor(String[] colors) {
        this.colors = colors;
        this.colors = new String[]{"White", "Blue", "Black", "Grey"};
    }

    public void setName(String newName) {
        this.name = newName;
        name = "BMW";
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
        model = "Gran Turismo";
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
        price = 220000;

    }

    public double getPrice() {
        return this.price;
    }

}
