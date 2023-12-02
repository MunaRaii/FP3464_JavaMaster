// Testing the  classes
public class Main {
    public static void main(String[] args) {
        // Creating Vehicle instance
        Car managerCar = new Car("Toyota", "ABC123", "Black", "Sedan", "Automatic", "Sedan");
        Motorcycle testermotorcycle = new Motorcycle("Harley Davidson", "XYZ897", "Red", "Sport", true);
        Car programmerCar = new Car("Honda", "DEF456", "White", "SUV", "Manual", "SUV");

        // Creating Employee instances
        Manager manager1 = new Manager("Rasik", 1998, 5000, 100, 10, 5, managerCar);
        manager1.calculateEffectiveOccupationRate(25);
        Tester tester1 = new Tester("Muna", 1996, 4000, 100, 34, testermotorcycle);
        tester1.calculateEffectiveOccupationRate(25);
        Programmer programmer1 = new Programmer("Alishan", 1999, 6000, 100, 12, programmerCar);
        programmer1.calculateEffectiveOccupationRate(25);

        // Displaying information about each employee using toString
        System.out.println(manager1);
        System.out.println(tester1);
        System.out.println(programmer1);

        // Displaying annual income for each employee
        System.out.println("Annual Income for Manager: $" + manager1.annualIncome());
        System.out.println("Annual Income for Tester: $" + tester1.annualIncome());
        System.out.println("Annual Income for Programmer: $" + programmer1.annualIncome());
    }
}