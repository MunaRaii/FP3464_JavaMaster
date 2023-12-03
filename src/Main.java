public class Main {
    public static void main(String[] args) {
        // Creating Vehicle instances for each employee
        Car managerCar = new Car("Toyota", "ABC123", "Red", "Sedan", "Automatic", "Sedan");
        Motorcycle testerMotorcycle = new Motorcycle("Harley", "XYZ789", "Black", "Sport", true);
        Car programmerCar = new Car("Honda", "DEF456", "Blue", "SUV", "Manual", "SUV");
        ContractType tc = new TemporaryContract(100);
        ContractType pc = new PermanentContract(20, 5000, 3, true,400);

        Manager[] managers = new Manager[2];
        managers[0] = new Manager("Rasik", 1998, 5000, 100, 10, 5, managerCar, pc);
        managers[0].calculateEffectiveOccupationRate(25);

        managers[1] = new Manager("Muna", 1996, 4000, 100, 10, 5, managerCar, pc);
        managers[1].calculateEffectiveOccupationRate(25);

        Programmer[] programmers = new Programmer[3];
        programmers[0] = new Programmer("Alishan", 1999, 6000, 100, 12, programmerCar, tc);
        programmers[0].calculateEffectiveOccupationRate(25);

        Tester[] testers = new Tester[1];
        testers[0] = new Tester("Prajina", 1996, 4000, 100, 34, testerMotorcycle, tc);
        testers[0].calculateEffectiveOccupationRate(25);

        programmers[1] = new Programmer("Ves", 1997, 5500, 100, 8, programmerCar, tc);
        programmers[1].calculateEffectiveOccupationRate(25);

        programmers[2] = new Programmer("John", 1995, 7000, 100, 15, programmerCar, tc);
        programmers[2].calculateEffectiveOccupationRate(25);
        System.out.println();

        for(Manager manager: managers){
            System.out.println(manager);
        }
        for(Programmer programmer: programmers){
            System.out.println(programmer);
        }
        for(Tester tester: testers){
            System.out.println(tester);
        }


        // Displaying information about each employee using toString
//        System.out.println(manager1);
//        System.out.println(tester1);
//        System.out.println(programmer1);


    }
}
