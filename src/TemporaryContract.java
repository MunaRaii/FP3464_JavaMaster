public class TemporaryContract extends ContractType implements Contract {
    private final double hourlyWages;

    public TemporaryContract(double hourlyWages) {
        super("Temporary");
        this.hourlyWages = hourlyWages;
    }

    @Override
    public double calculateMonthlySalary() {
        // Assume 20 working days in a month
        return hourlyWages * 8 * 20;
    }

    @Override
    public double calculateAccumulatedSalary(int hoursWorked)
    {
        return hoursWorked * hourlyWages;
    }
}