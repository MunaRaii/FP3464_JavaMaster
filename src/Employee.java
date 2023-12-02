

class Employee {
    // Private common attributes for parent and child classes attributes for encapsulation
    private final String name;
    private final int birthYear;
    private final double monthlyIncome;
    private int occupationRate;
    private final Vehicle vehicle;

    // Constructor for initializing Employee
    public Employee(String name, int birthYear, double monthlyIncome, int occupationRate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = occupationRate;
        this.vehicle = vehicle;
        System.out.println("We have a new employee: " + this.name);
    }


    // New method to calculate effective occupation rate
    public void calculateEffectiveOccupationRate(int daysWorked) {
        // Calculate occupation rate based on the number of days worked
        double calculatedOccupationRate = (daysWorked / 30.0) * 100.0;

        // Apply the rules for effective occupation rate
        if (calculatedOccupationRate < 10.0) {
            this.occupationRate = 10;
        } else if (calculatedOccupationRate > 100.0) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = (int) Math.round(calculatedOccupationRate);
        }
    }

    // Getter for calculating age
    public int getAge() {
        // Calculate age based on the birth year and current year
        return 2023 - this.birthYear;
    }

    // Getters and setters for private attributes
    public String getName() {
        return this.name;
    }



    public double getMonthlyIncome() {
        return this.monthlyIncome;
    }

    public int getOccupationRate() {
        return this.occupationRate;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public String toString() {
        return "Name: " + this.getName() + " || " +
                "Age: " + this.getAge() + " || " +
                "MonthlyIncome: " + this.getMonthlyIncome() + " || " +
                "Occupation Rate: " + this.getOccupationRate();
    }

    public double annualIncome(){
        return (12 * this.monthlyIncome * this.occupationRate);
    }

}

class Manager extends Employee {
    // Additional attributes for Manager
    private final int travelledDays;
    private final int clientsBrought;

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

    public int getClientsBrought() {
        return this.clientsBrought;
    }

    @Override
    public String toString() {
        return super.toString() + " || " +
                "Travelled Days: " + this.getTravelledDays() + " || " +
                "Clients Brought: " + this.getClientsBrought();
                "Vehicle: " + this.getVehicle();
    }

    // Bonus calculation for manager
    @Override
    public double annual Income(){
        private final GAIN_FACTOR_CLIENT = 500;
        private final GAIN_FACTOR_TRAVEL = 100;
        double bonus = clientsBrought * GAIN_FACTOR_CLIENT + travelledDays * GAIN_FACTOR_TRAVEL;
        return (super.annualIncome() + bonus);
    }

}

class Tester extends Employee {
    // Additional attribute for Tester
    private final int bugsSolved;

    // Constructor for initializing Tester
    public Tester(String name, int birthYear, double monthlyIncome, int occupationRate, int bugsSolved, Motorcycle motorcycle) {
        super(name, birthYear, monthlyIncome, occupationRate, motorcycle);
        this.bugsSolved = bugsSolved;
    }

    // Getters for Tester-specific attribute
    public int getBugsSolved() {
        return this.bugsSolved;
    }

    @Override
    public final String toString() {
        return super.toString() + " || " +
                "Bugs Solved: " + this.getBugsSolved() +
                "Vehicle: " + this.getVehicle();
    }

    // Bonus Calculation for Tester
    @Override
    public double annualIncome(){
        private final GAIN_FACTOR_ERROR = 10;
        double bonus = bugsSolved * GAIN_FACTOR_ERROR;
        return (super.annualIncome() + bonus);
    }

}

class Programmer extends Employee {
    // Additional attribute for Programmer
    private final int projectsCompleted;

    // Constructor for initializing Programmer
    public Programmer(String name, int birthYear, double monthlyIncome, int occupationRate, int projectsCompleted) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.projectsCompleted = projectsCompleted;
    }

    // Getter for Programmer-specific attribute
    public int getProjectsCompleted() {
        return this.projectsCompleted;
    }

    @Override
    public String toString() {
        return super.toString() + " || " +
                "Projects Completed: " + this.getProjectsCompleted();
    }

}