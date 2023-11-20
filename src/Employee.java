class Employee {
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private int occupationRate;

    public Employee(String name, int birthYear, double monthlyIncome, int occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = Math.max(10, Math.min(occupationRate, 100));
        System.out.println("We have a new employee: " + this.name);
    }

    public int getAge() {
        // Calculate age based on the birth year and current year (assuming current year is 2023)
        return 2023 - this.birthYear;
    }

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

    public void setOccupationRate(int occupationRate) {
        this.occupationRate = Math.max(10, Math.min(occupationRate, 100));
    }
}

class Manager extends Employee {
    private int travelledDays;
    private int clientsBrought;

    public Manager(String name, int birthYear, double monthlyIncome, int travelledDays, int clientsBrought) {
        super(name, birthYear, monthlyIncome, 100);
        this.travelledDays = travelledDays;
        this.clientsBrought = clientsBrought;
    }

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
