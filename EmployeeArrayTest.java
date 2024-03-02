package week8;

public class EmployeeArrayTest {
    public static void main(String[] args) {
    Employee[] employees = new Employee[10];
        
    employees[0] = new Employee("Jasmine", "Doe", 72000);
    employees[1] = new Employee("Alex", "Smith", 100000);
    employees[2] = new Employee("Sofia", "Johnson", 50000);
    employees[3] = new Employee("Smith", "Williams", 80000);
    employees[4] = new Employee("Ava", "Brown", 95000);
    employees[5] = new Employee("Lucas", "Jones", 60000);
    employees[6] = new Employee("Mia", "Miller", 110000);
    employees[7] = new Employee("Jone", "Davis", 55000);
    employees[8] = new Employee("John", "Garcia", 75000);
    employees[9] = new Employee("Will", "Martinez", 60000);
        
    for (Employee employee : employees) {
        double nowsalary = employee.getSalary();
        double newsalary = nowsalary * 1.05;
        employee.setSalary(newsalary);
    }
    for(int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employees[i].getFirstname() + " " + employees[i].getLastname() + ", Salary: " + employees[i].getSalary());
        }
    }
}
