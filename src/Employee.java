import java.util.Objects;

public class Employee {
    private static int counterId = 1;
    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName,
                    int department,
                    int salary) {
        this.id = counterId++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, ФИО: %s, Зарплата: %d, Номер отдела: %s",
                id,
                fullName,
                salary,
                department);
    }
}
