package Lession21;

public class FullTimeEmployee extends EmployeeAbstract{
    private double FTE_RATE = 1.0;

    @Override
    public double CaculateWeeklySalary() {
        return this.salary * FTE_RATE * 10;
    }
}
