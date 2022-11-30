package Lession21;

public abstract class EmployeeAbstract {
    protected int id;
    protected String name;
    protected double salary = 1.0;

    public EmployeeAbstract() {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract double CaculateWeeklySalary();
}
