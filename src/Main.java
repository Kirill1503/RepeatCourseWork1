
public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.fillEmployees();
        System.out.println("Task 1");
        employeeBook.printEmployees();
        System.out.println("Task 2");
        System.out.println(employeeBook.sumSalary());
        System.out.println("Task 3");
        System.out.println(employeeBook.minSalary());
        System.out.println("Task 4");
        System.out.println(employeeBook.maxSalary());
        System.out.println("Task 5");
        System.out.println(employeeBook.averageSalary());
        System.out.println("Task 6");
        employeeBook.printName();
        System.out.println("Task 7");
        employeeBook.indexSalary(13);
        System.out.println("Task 8");
        employeeBook.printEmployees();
        System.out.println("Task 9");
        System.out.println(employeeBook.minSalaryInDepartment(1));
        System.out.println("Task 10");
        System.out.println(employeeBook.maxSalaryInDepartment(1));
        System.out.println("Task 11");
        System.out.println(employeeBook.sumSalaryInDepartment(1));
        System.out.println("Task 12");
        System.out.println(employeeBook.averageSalaryInDepartment(1));
        System.out.println("Task 13");
        employeeBook.indexSalaryInDepartment(1, 10);
        System.out.println("Task 14");
        employeeBook.printEmployeesFromDepartment(1);
        System.out.println("Task 15");
        employeeBook.printEmployeesWithSmallSalary(75_000);
        System.out.println("Task 16");
        employeeBook.printEmployeesWithBigSalary(75_000);
        System.out.println("Task 17");
        System.out.println(employeeBook.addEmployee(new Employee("AAA", 70_000, 2)));
        System.out.println("Task 18");
        employeeBook.deleteEmployee(1);
        System.out.println("Task 19");
        System.out.println(employeeBook.searchEmployee(2));
    }
}
