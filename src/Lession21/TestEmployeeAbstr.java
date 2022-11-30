package Lession21;

public class TestEmployeeAbstr {
    public static void main(String[] args) {
        double contractSalary;
        double fullTimeSalary;

        ContractEmployee contractEmployee = new ContractEmployee();
        contractSalary = contractEmployee.CaculateWeeklySalary();
        System.out.printf("Salary of contract employee is: %f%n", contractSalary);

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeSalary = fullTimeEmployee.CaculateWeeklySalary();
        System.out.printf("Salary of contract employee is: %f%n", fullTimeSalary);
    }
}
