package Lession21;

public class ContractEmployee extends EmployeeAbstract{
    private final double CE_RATE = 0.5;

    @Override
    public double CaculateWeeklySalary() {
        return this.salary * CE_RATE * 10;
    }
}

