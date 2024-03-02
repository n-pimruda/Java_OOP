public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob Jones",34500);
        Employee employee2 = new Employee("Susan baker",37809);
        System.out.println("Employee 1 : " + employee1.getName() + "; Yearly Salary : " + employee1.getSalary());
        System.out.println("Employee 2 : " + employee2.getName() + "; Yearly Salary : " + employee2.getSalary());
    
    employee1.raiseSalary(10);
    employee2.raiseSalary(10);

    System.out.println("Increasing employee salary by  10%");
    System.out.println("Employee 1 : " + employee1.getName() + "; Yearly Salary : " + employee1.getSalary());
    System.out.println("Employee 2 : " + employee2.getName() + "; Yearly Salary : " + employee2.getSalary());
    }
}
