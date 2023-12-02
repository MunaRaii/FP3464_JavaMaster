public class Main {
    public static void main(String[] args) {
        // Creating Vehicle instances for each employee
        Car managerCar = new Car("Toyota", "ABC123", "Red", "Sedan", "Automatic", "Sedan");
        Motorcycle testerMotorcycle = new Motorcycle("Harley", "XYZ789", "Black", "Sport", true);
        Car programmerCar = new Car("Honda", "DEF456", "Blue", "SUV", "Manual", "SUV");

        Manager manager1 = new Manager("Rasik", 1998, 5000, 100, 10, 5, managerCar);
        manager1.calculateEffectiveOccupationRate(25);

        Manager manager2 = new Manager("Muna", 1996, 4000, 100, 10, 5, managerCar);
        manager2.calculateEffectiveOccupationRate(25);

        Programmer programmer1 = new Programmer("Alishan", 1999, 6000, 100, 12, programmerCar);
        programmer1.calculateEffectiveOccupationRate(25);

        Tester tester1 = new Tester("Prajina", 1996, 4000, 100, 34, testerMotorcycle);
        tester1.calculateEffectiveOccupationRate(25);

        Programmer programmer2 = new Programmer("Ves", 1997, 5500, 100, 8, programmerCar);
        programmer2.calculateEffectiveOccupationRate(25);

        Programmer programmer3 = new Programmer("John", 1995, 7000, 100, 15, programmerCar);
        programmer3.calculateEffectiveOccupationRate(25);



        // Displaying information about each employee using toString
        System.out.println(manager1);
        System.out.println(tester1);
        System.out.println(programmer1);


    }
}
