class Employee {
    // Private attributes for encapsulation
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private int occupationRate;

    // Constructor for initializing Employee
    public Employee(String name, int birthYear, double monthlyIncome, int occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = Math.max(10, Math.min(occupationRate, 100));
        System.out.println("We have a new employee: " + this.name);
    }

    // Getter for calculating age
    public int getAge() {
        // Calculate age based on the birth year and current year (assuming current year is 2023)
        return 2023 - this.birthYear;
    }

    // Getters and setters for private attributes
    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public double getMonthlyIncome() {
        return this.monthlyIncome;
    }

    public int getOccupationRate() {
        return this.occupationRate;
    }


}

class Manager extends Employee {
    // Additional attributes for Manager
    private int travelledDays;
    private int clientsBrought;

    // Constructor for initializing Manager
    public Manager(String name, int birthYear, double monthlyIncome, int occupationRate, int travelledDays, int clientsBrought) {
        super(name, birthYear, monthlyIncome,occupationRate);
        this.travelledDays = travelledDays;
        this.clientsBrought = clientsBrought;
    }

    // Getters and setters for Manager-specific attributes
    public int getTravelledDays() {
        return this.travelledDays;
    }

    public void setTravelledDays(int travelledDays) {
        this.travelledDays = travelledDays;
    }

    public int getClientsBrought() {
        return this.clientsBrought;
    }

    public void setClientsBrought(int clientsBrought) {
        this.clientsBrought = clientsBrought;
    }
}

class Tester extends Employee {
    // Additional attribute for Tester
    private int bugsSolved;

    // Constructor for initializing Tester
    public Tester(String name, int birthYear, double monthlyIncome, int occupationRate, int bugsSolved) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.bugsSolved = bugsSolved;
    }

    // Getters and setters for Tester-specific attribute
    public int getBugsSolved() {
        return this.bugsSolved;
    }

    public void setBugsSolved(int bugsSolved) {
        this.bugsSolved = bugsSolved;
    }
}

class Programmer extends Employee {
    // Additional attribute for Programmer
    private int projectsCompleted;

    // Constructor for initializing Programmer
    public Programmer(String name, int birthYear, double monthlyIncome, int occupationRate, int projectsCompleted) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.projectsCompleted = projectsCompleted;
    }

    // Getters and setters for Programmer-specific attribute
    public int getProjectsCompleted() {
        return this.projectsCompleted;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        this.projectsCompleted = projectsCompleted;
    }
}


