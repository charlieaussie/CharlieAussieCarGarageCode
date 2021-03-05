package Package1;

import Cars.CarBMW;
import Cars.CarVolvo;
import Cars.Mercedes;
import Cars.Tesla;

import java.util.*;

public class CarMenu {
    private String color;
    private int days = 0;
    private double sum = 0;
    private int passCheck = 4;
    Person person = new Person();
    CarVolvo volvo = new CarVolvo("Volvo", "V90", "Diesel", 120000, 240.0);
    Tesla tesla = new Tesla("Tesla", "X Series", true, 1200000, 819.99, "no fuel");
    CarBMW bmw = new CarBMW("BMW", "Gran Turismo", "Diesel", 220000, 344.99);
    Mercedes mercedes = new Mercedes("Mercedes", "Benz", "Petron", 550000, 220.0);
    public Scanner scan = new Scanner(System.in);



    private void addPeople() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the number of Passengers:");
        int passengers = Integer.parseInt(reader.nextLine());

        String[] passengerAge = new String[passengers];
        for (int i = 0; i < passengers; i++) {
            System.out.print("Player " + (i) + " please enter passengers age:\n");
            passengerAge[i] = reader.nextLine();

        }
        System.out.println(Arrays.toString(passengerAge));
       selectionSortOfTheAgeOfPassengers(passengerAge, 0, passengerAge.length);

    }

    @SuppressWarnings({"rawtypes", "uncheked"})
    private void selectionSortOfTheAgeOfPassengers(Object[] array, int fromIndex, int toIndex) {
        Object d;
        for (int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) {
            int indexToMove = currentIndex;
            for (int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < toIndex; tempIndexInLoop++) {
                if (((Comparable) array[indexToMove]).compareTo(array[tempIndexInLoop]) > 0) {
                    //Swapping
                    indexToMove = tempIndexInLoop;
                }
            }
            d = array[currentIndex];
            array[currentIndex] = array[indexToMove];
            array[indexToMove] = d;
        }
        System.out.println("In Order from lowest to oldest");
        System.out.println(Arrays.toString(array));
    }


    private void menu() {
        // Menu for the car project
        System.out.println("=============================================");
        System.out.println("Welcome to the car sales Project");
        System.out.println("=============================================");
        System.out.println("What do you want do do?\nPress(1) to see car info\nPress(2) for car Price Order\nPress(3)" +
                " Rent a car" + "\nPress(4)to buy a car\nPress(5)to add passengers");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                // see information about the cars
                carInfoMenu();
                break;
            case 2:
                // see price information about the cars
                carPriceInOrder();
                break;
            case 3:
                // rent a car method
                rentCar();
                break;
            case 4:
                buyCar();
                break;
            case 5:
                addPeople();
                break;
            default:
                System.out.println("Wrong input\nTry again");
                menu();
                break;
        }

    }

    private void buyCar() {
        System.out.println("You want to buy a car. what car do you want to buy?");
        System.out.println("Press(1)Volvo\nPress(2)Mercedes\nPress(3)BMW\nPress(4)Tesla\nPress(5)to go back");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                person.superCar = new CarVolvo("Volvo", "V90", "Diesel", 120000, 240.0);
                buyACar();
                break;
            case 2:
                person.superCar = new Mercedes("Mercedes", "Benz", "Petron", 550000, 220.0);
                buyACar();
                break;
            case 3:
                person.superCar = new CarBMW("BMW", "Gran Turismo", "Diesel", 220000, 344.99);
                buyACar();
                break;
            case 4:
                person.superCar = new Tesla("Tesla", "X Series", true, 1200000, 819.99, "electric driven");
                buyACar();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Invalid command try again");
                buyCar();
                break;
        }
    }

    private void buyACar() {
        System.out.println("You choose to buy a " + person.superCar.getName() + " Model is " + person.superCar.getModel());
        System.out.println("The price is " + person.superCar.getPrice() + "kr");
        System.out.println("Pick a Color from 1-5 " + Arrays.toString(person.superCar.getColors()) + "\n");
        int pickColor;
        pickColor = scan.nextInt();
        switch (pickColor) {
            case 1:
                color = person.superCar.getColors()[0];
                System.out.println("You picked " + person.superCar.getColors()[0]);
                carTransaction();
                break;
            case 2:
                color = person.superCar.getColors()[1];
                System.out.println("You picked " + person.superCar.getColors()[1]);
                carTransaction();
                break;
            case 3:
                color = person.superCar.getColors()[2];
                System.out.println("You picked " + person.superCar.getColors()[2]);

                carTransaction();
                break;
            case 4:
                color = person.superCar.getColors()[3];
                System.out.println("You picked " + person.superCar.getColors()[3]);
                carTransaction();
                break;
            case 5:
                color = person.superCar.getColors()[4];
                System.out.println("You picked " + person.superCar.getColors()[4]);
                carTransaction();
                break;
            default:
                System.out.println("Invalid Command try again");
                buyACar();
                break;
        }
    }

    private void carTransaction() {
        System.out.println("The price is " + person.superCar.getPrice() + "kr");
        System.out.println("Your money is " + person.money + "kr");
        System.out.println("You choose to buy a " + person.superCar.name + " with " + color + " color ");
        double pay = (person.money - person.superCar.getPrice());
        System.out.println("Your have " + pay + "kr left");
        menu();
    }


    private void rentCar() {
        // Choose a car you want to rent
        System.out.println("You want to rent a car what car do you want to rent?");
        System.out.println("You can chose " + volvo.getName() + "\n" + tesla.getName() + "\n" + bmw.getName() + "\n" + mercedes.getName());
        System.out.println("Press(1) for Volvo\nPress(2) for Tesla\nPress(3) for BMW\nPress(4) for Mercedes\nPress(5) to go back ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                person.superCar = new CarVolvo("Volvo", "V90", "Diesel", 120000, 240.0);
              rentSpecifiedCar();
                break;
            case 2:
                person.superCar = new Tesla("Tesla", "X Series", true, 1200000, 819.99, "electric driven");
               rentSpecifiedCar();
                break;
            case 3:
                person.superCar = new CarBMW("BMW", "Gran Turismo", "Diesel", 220000, 344.99);
               rentSpecifiedCar();
                break;
            case 4:
                person.superCar = new Mercedes("Mercedes", "Benz", "Petron", 550000, 220.0);
              rentSpecifiedCar();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Invalid information\nTry again");
                rentCar();
                break;
        }
    }


    /*fix shop order so car name is not null
    I fixed it bu using make a constructor in superclass then
    add a superconstructor in the different car classes
     */
    private void shopOrder() {
        person.superCar.name = person.superCar.getName();
        System.out.println("You want a " + person.superCar.name);
        System.out.println("Your money is " + person.money);
        System.out.println("Enter your pin code to rent a " + person.superCar.name + " " + days + " days");
        int pin = scan.nextInt();
        if (pin == 1998) {
            System.out.println("You rented a  " + person.superCar.name + "\nIt will cost " + sum);
            person.money = person.money - sum;
            System.out.println("Your money is " + person.money);
            menu();
        } else {
            System.out.println("Invalid pin code try again");
            shopOrder();
        }

    }

    private void rentSpecifiedCar() {
        person.superCar.name = person.superCar.getName();
        person.superCar.model = person.superCar.getModel();
        System.out.println("You want a " + person.superCar.name);
        System.out.println("You choose to rent a " + person.superCar.getName() + " " + person.superCar.getModel() + " The fuel is " + person.superCar.getFuel());
        System.out.println("The rental price per day is " + person.superCar.getRentPricePerDay() + " kr");
        System.out.println("How many days do you want to rent this car?");
        days = scan.nextInt();
        if (days > 0) {
            System.out.println("You have rented " + person.superCar.getName() + " for " + days + " days");
            sum = person.superCar.getRentPricePerDay() * days;
            sum += person.superCar.rentPricePerDay * days;
            System.out.println("It will cost " + sum + "kr");
            shopOrder();
        } else {
            System.out.println("Invalid command try again");
           rentSpecifiedCar();
        }
    }

    private void carInfoMenu() {
        System.out.println("\nWhich car do you want to se information of\n\nPress1(Volvo)" +
                "\nPress2(BMW)\npress3(Mercedes)\nPress4(Tesla)\nPress(5)Go back");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                person.superCar = new CarVolvo("Volvo", "V90", "Diesel", 120000, 240.0);
                infoOfCars();

                break;
            case 2:
                person.superCar = new CarBMW("BMW", "Gran Turismo", "Diesel", 220000, 344.99);
                infoOfCars();

                break;
            case 3:
                person.superCar = new Mercedes("Mercedes", "Benz", "Petron", 550000, 220.0);
                infoOfCars();

                break;
            case 4:
                person.superCar = new Tesla("Tesla", "X Series", true, 1200000, 819.99, "electric driven");
                infoOfCars();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Invalid data\nPlease try again");
                carInfoMenu();
                break;
        }

    }

    private void carPriceInOrder() {
        HashMap<Double, String> carPriceList = new HashMap<>();
        // values car names and car Price
        carPriceList.put(120000.00, "Volvo");
        carPriceList.put(220000.00, "BMW");
        carPriceList.put(550000.00, "Mercedes");
        carPriceList.put(1500000.00, "Tesla");
        // Get the Price in order

        Set set = carPriceList.entrySet();
        for (Object o : set) {
            Map.Entry me = (Map.Entry) o;
            System.out.print(me.getKey() + "Kr ");
            System.out.println(me.getValue());
        }
        Map<Double,String> map = new TreeMap<>(carPriceList);
        System.out.println("\n\nAfter sorting:");
        Set set2 = map.entrySet();
        for (Object o : set2) {
            Map.Entry me2 = (Map.Entry) o;
            System.out.print(me2.getKey() + "Kr ");
            System.out.println(me2.getValue());
            menu();
        }

    }

    private void infoOfCars() {
        System.out.println("You are looking at a " + person.superCar.getName() + " catalogue");
        System.out.println("The color is " + Arrays.toString(person.superCar.getColors()));
        System.out.println("The model is a " + person.superCar.getModel() + " Electric driven " +
                person.superCar.electricDriven + " the price is " + person.superCar.getPrice() + " kr");
        System.out.println("For rental price is " + person.superCar.getRentPricePerDay() + " kr per day ");
        carInfoMenu();

    }

    private void usernameChecker() {
        System.out.println("Please enter your Username:");
        String userName = scan.next();
        // if username is correct go then to password method
        if (userName.equals("samuel")) {
            passwordChecker();

        } else {
            passCheck--;
            System.out.println("Log in failed\nYou have " + passCheck + " tries left");
            verifyPerson();
        }


    }
    private void passwordChecker() {
        // user have to enter correct username or password else your account is blocked
        System.out.println("Please Enter your password:");
        String password = scan.next();
        if (password.equals("aussie")) {
            System.out.println("Login successfully");
            menu();
        } else {
            passCheck--;
            System.out.println("Login failed\nYou have " + passCheck + " tries left");
            verifyPerson();
        }

    }
    public void verifyPerson() {

        int maxTry = 0;
        while (passCheck > maxTry) {
            System.out.println("Hello customer\nIn order to buy or rent a car I need you ID confirmation");
            usernameChecker();
        }
        blocked();

    }


    private void blocked() {
        // When user enter wrong password to many times
        System.out.println("You have been blocked please restart the program");
        System.exit(1);

    }
}




