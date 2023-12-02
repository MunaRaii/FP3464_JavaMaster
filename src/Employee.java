
class Employee {
    private final String name;
    private final int birthYear;
    private final double monthlyIncome;
    private  int occupationRate;

    protected final String employeeType;
    private final Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlyIncome, int occupationRate, String employeeType, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = occupationRate;
        this.employeeType = employeeType;
        this.vehicle = vehicle;
        System.out.println("We have a new employee: " + this.name + ", a " + this.employeeType);
    }

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

    public int getAge() {
        return 2023 - this.birthYear;
    }

    public String getName() {
        return this.name;
    }

    public double getMonthlyIncome() {
        return this.monthlyIncome;
    }

    public int getOccupationRate() {
        return this.occupationRate;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public String toString() {
        return "Name: " + this.getName() + ", a " + this.employeeType + "\n" +
                "Age: " + this.getAge() + " \n ";

    }

    public double annualIncome() {
        return 12 * this.monthlyIncome * this.occupationRate;
    }
}

class Manager extends Employee {
    private final int travelledDays;
    private final int clientsBrought;

    public Manager(String name, int birthYear, double monthlyIncome, int occupationRate, int travelledDays, int clientsBrought, Car car) {
        super(name, birthYear, monthlyIncome, occupationRate,"manager", car);
        this.travelledDays = travelledDays;
        this.clientsBrought = clientsBrought;
    }

    public int getTravelledDays() {
        return this.travelledDays;
    }

    public int getClientsBrought() {
        return this.clientsBrought;
    }

    @Override
    public String toString() {
        return super.toString() + " \n " +
                "Employee has a " + this.getVehicle().vehicleType +"\n"+ this.getVehicle() + " \n " +
                this.getName() + " has an Occupation rate: " + this.getOccupationRate()+ " %" + " HE/SHE travelled "+ this.getTravelledDays() +" and " +"has brought " + this.getClientsBrought() + " new clients." + "\n" + "His/her estimated annual income is :"
                + annualIncome() + "\n" + "------------------" + "\n" + "-----------------------";

    }

    @Override
    public double annualIncome() {
        // Add bonus for manager
        double bonus = clientsBrought * 500 + travelledDays * 100;
        return super.annualIncome() + bonus;
    }
}

class Tester extends Employee {
    private final int bugsSolved;

    public Tester(String name, int birthYear, double monthlyIncome, int occupationRate, int bugsSolved, Motorcycle motorcycle) {
        super(name, birthYear, monthlyIncome, occupationRate,"tester", motorcycle);
        this.bugsSolved = bugsSolved;
    }

    public final int getBugsSolved() {
        return this.bugsSolved;
    }

    @Override
    public String toString() {
        return super.toString() + " \n " +
                "Employee has a " + this.getVehicle().vehicleType +"\n"+ this.getVehicle() + " \n " +
                this.getName() + " has an Occupation rate: " + this.getOccupationRate()+ " %" +" and corrected " + this.getBugsSolved() + " \n " + "His/her estimated annual income is :"
                + annualIncome() + "\n" + "------------------" + "\n" + "-----------------------";

    }

    @Override
    public double annualIncome() {
        // Add bonus for tester
        double bonus = bugsSolved * 10;
        return super.annualIncome() + bonus;
    }
}

class Programmer extends Employee {
    private final int projectsCompleted;

    public Programmer(String name, int birthYear, double monthlyIncome, int occupationRate, int projectsCompleted, Car car) {
        super(name, birthYear, monthlyIncome, occupationRate,"programmer", car);
        this.projectsCompleted = projectsCompleted;
    }

    public int getProjectsCompleted() {
        return this.projectsCompleted;
    }

    @Override
    public String toString() {
        return super.toString() + " \n " +
                "Employee has a " + this.getVehicle().vehicleType +"\n"+ this.getVehicle() + " \n " +
                this.getName() + " has an Occupation rate: " + this.getOccupationRate()+ " %" +" and completed project " + this.getProjectsCompleted() + " \n " + "His/her estimated annual income is :"
                + annualIncome() + "\n" + "------------------" + "\n" + "-----------------------";
    }

    @Override
    public double annualIncome() {
        // Add bonus for programmer
        double bonus = projectsCompleted * 200;
        return super.annualIncome() + bonus;
    }
}