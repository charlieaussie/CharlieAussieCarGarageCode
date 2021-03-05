package Cars;

public class Mercedes extends SuperCar {
    @Override
    public String[] getColors() {
        return colors;
    }

    @Override
    public void setColors(String[] colors) {
        this.colors = colors;
        this.colors = new String[]{"Red", "Blue", "Green"};
    }

    public String[] colors = new String[]{"Red", "Blue", "Green"};
private String name;
private String model;
private String fuel;
private double price;
private double  rentPricePerDay;


    public Mercedes  (String name, String model, String fuel, double price, double rentPricePerDay) {
        super("Mercedes");
        this.name = name;
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.rentPricePerDay = rentPricePerDay;
        this.sum = sum;

    }
    public void setRentPricePerDay( double rent){
        this.rentPricePerDay = rent;
        this.rentPricePerDay = 220.0;

    }
    public double getRentPricePerDay(){
       return this.rentPricePerDay;

    }


    public void setName(String newName) {
        this.name = newName;
        name = "Mercedes";
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
        this.model = "Benz";
    }

    public void setFuel(String newFuel) {
        this.fuel = newFuel;
        this.fuel = "Petron";

    }

    public String getFuel() {
        return this.fuel;
    }

    public void setPrice(double  newPrice) {
        this.price = newPrice;
        this.price = 550000;

    }

    public double getPrice() {
        return this.price;
    }




}
