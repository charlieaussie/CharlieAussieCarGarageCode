package Cars;

import java.util.ArrayList;

public class SuperCar {
    public ArrayList<Integer> carsPrice = new ArrayList<Integer>();
    public double price;

    public ArrayList<Integer> getCarsPrice() {
        return carsPrice;
    }

    public void setCarsPrice(ArrayList<Integer> carsPrice) {
        this.carsPrice = carsPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isElectricDriven() {
        return electricDriven;
    }

    public void setElectricDriven(boolean electricDriven) {
        this.electricDriven = electricDriven;
    }

    public double getRentPricePerDay() {
        return rentPricePerDay;
    }

    public void setRentPricePerDay(double rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
        this.sum = rentPricePerDay;
    }

    public String model;
    public String[] colors;
    public String name;
    public String fuel;
    public boolean electricDriven = false;
    public double rentPricePerDay;
    public double sum;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperCar(String name) {
        this.name = name;

    }
}
