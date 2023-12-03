public class ContractType{
    private final String contractType;

    public ContractType(String contractType){
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "Contract Type: " + this.contractType;
    }
}
