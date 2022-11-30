package Lession2122;

public class TestEmployeeAbstr {
    public static void main(String[] args) {
        double contractSalary;
        double fullTimeSalary;
        double fullTimeInsurance;
        double fullTimeBonus;

        ContractEmployee contractEmployee = new ContractEmployee();
        contractSalary = contractEmployee.CaculateWeeklySalary();
        System.out.printf("Salary of contract employee is: %f%n", contractSalary);

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeSalary = fullTimeEmployee.CaculateWeeklySalary();
        fullTimeInsurance = fullTimeEmployee.getInsurance();
        fullTimeBonus = fullTimeEmployee.getBonus();
        System.out.printf("Salary of contract employee is: %f - insurance is: %f - bonus is: %f%n", fullTimeSalary, fullTimeInsurance, fullTimeBonus);
    }
}
