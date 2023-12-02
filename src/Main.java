// Testing the  classes
public class Main {
    public static void main(String[] args) {


        Manager manager1 = new Manager("Rasik Silwal", 1998, 5000, 100, 10, 5);
        manager1.calculateEffectiveOccupationRate(25);
        Tester tester1 = new Tester("Muna Rai", 1996, 4000, 100, 34);
        tester1.calculateEffectiveOccupationRate(25);
        Programmer programmer1 = new Programmer("Alishan Gurung", 1999, 6000, 100, 12);
        programmer1.calculateEffectiveOccupationRate(25);

        // Displaying information about each employee using toString
        System.out.println(manager1);
        System.out.println(tester1);
        System.out.println(programmer1);
    }
}