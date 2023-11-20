// Testing the  classes
public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Rasik Silwal", 1998,  5000, 90, 10,5);
        Tester tester1 = new Tester("Muna Rai", 1996, 4000, 98, 34);
        Programmer programmer1 = new Programmer("Alishan Gurung", 1999, 6000, 88, 12 );



        // Displaying information about each employee

        System.out.println("Name: " + manager1.getName() + " || " + "Age: " + manager1.getAge()+ " || " + "MonthlyIncome: " + manager1.getMonthlyIncome()+ " || " + "Occupation Rate: " + manager1.getOccupationRate() + " || " + "Travelled Days:" + manager1.getTravelledDays() + " || " + "Client Bought: " + manager1.getClientsBrought() );
        System.out.println("Name: " + tester1.getName() + " || " + "Age: " + tester1.getAge() + " || " + "MonthlyIncome: " + tester1.getMonthlyIncome() + " || " + "Occupation Rate: " + tester1.getOccupationRate() + " || " + "Bugs Solved: " + tester1.getBugsSolved());
        System.out.println("Name: " + programmer1.getName() + " || "+ "Age: " + programmer1.getAge() + " || " + "MonthlyIncome: " + programmer1.getMonthlyIncome() + " ||  " + "Occupation Rate: " + programmer1.getOccupationRate() + " || "+ "Project Completed: " + programmer1.getProjectsCompleted());
    }
}