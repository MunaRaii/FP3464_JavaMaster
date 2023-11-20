// Testing the  classes
public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("John", 1985, 5000, 10, 5);
        Tester tester1 = new Tester("Alice", 1990, 4000, 100);
        Programmer programmer1 = new Programmer("Bob", 1988, 6000, 8);

        // Displaying information about each employee
        System.out.println(manager1.getName() + " " + manager1.getTravelledDays() + " " + manager1.getClientsBrought());
        System.out.println(tester1.getName() + " " + tester1.getBugsSolved());
        System.out.println(programmer1.getName() + " " + programmer1.getProjectsCompleted());
    }
}