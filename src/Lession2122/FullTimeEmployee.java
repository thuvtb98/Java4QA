package Lession2122;

public class FullTimeEmployee extends EmployeeAbstract implements Insurance_Interface, Bonus_Interface{
    private double FTE_RATE = 1.0;

    @Override
    public double CaculateWeeklySalary() {
        return this.salary * FTE_RATE * 10;
    }

    @Override
    public double getInsurance() {
        return 1.5;
    }

    @Override
    public double getBonus() {
        return 2;
    }
}
