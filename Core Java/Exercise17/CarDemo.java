package Exercise17;

class Car {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Suzuki";
        car1.model = "Baleno";
        car1.year = 2017;

        car1.displayDetails();
    }
}
