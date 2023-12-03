public class PermanentContract extends ContractType implements Contract {
    private final int daysWorked;
    private final double fixedMonthlySalary;
    private final int numberOfChildren;
    public final boolean married;
    private final double childAllowance;

    public PermanentContract(int daysWorked, double fixedMonthlySalary, int numberOfChildren, boolean married, double childAllowance) {
        super("Permanent");
        this.daysWorked = daysWorked;
        this.fixedMonthlySalary = fixedMonthlySalary;
        this.numberOfChildren = numberOfChildren;
        this.married = married;
        this.childAllowance = childAllowance;
    }

    @Override
    public double calculateMonthlySalary() {
        double bonus = married ? numberOfChildren * childAllowance : 0;
        return this.fixedMonthlySalary + bonus;
    }

    @Override
    public double calculateAccumulatedSalary(int daysWorked) {
        return this.daysWorked * calculateMonthlySalary() / 20.0;
    }

}


