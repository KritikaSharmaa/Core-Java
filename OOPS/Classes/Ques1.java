
// Q1: Basic Class & Object
// Create a class Car with the following attributes:
// brand (String)
// model (String)
// year (int)

// Create a method displayDetails() that prints the car's details.
// Now, create two objects of Car in the main method and call the method for both.


public class Ques1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Tata";
        c1.model = "abc12";
        c1.year = 1998;
        c1.displayDetails();
    }
}

class Car {
    String brand;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("-------------------");
    }
}
