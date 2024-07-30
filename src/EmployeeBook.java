import java.util.Random;

public class EmployeeBook {

    private static final int SIZE = 10;
    private final Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[SIZE];
    }

    public void fillEmployees() {
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(
                    "Сотрудник " + random.nextInt(1, 1000),
                    random.nextInt(1, 6),
                    random.nextInt(50_000, 100_000));

        }
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee emp = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                emp = employee;
            }
        }
        return emp;
    }

    public Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee emp = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                emp = employee;
            }
        }
        return emp;
    }

    public double averageSalary() {
        int sum = sumSalary();
        return (double) sum / employees.length;
    }

    public void printName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void indexSalary(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));
        }
    }

    public Employee minSalaryInDepartment(int department) {
        Employee employee = new Employee("str", department, Integer.MAX_VALUE);
        for (Employee value : employees) {
            if (value.getDepartment() == department && value.getSalary() < employee.getSalary()) {
                employee = value;
            }
        }
        return employee;
    }

    public Employee maxSalaryInDepartment(int department) {
        Employee employee = new Employee("str", department, Integer.MIN_VALUE);
        for (Employee value : employees) {
            if (value.getDepartment() == department && value.getSalary() > employee.getSalary()) {
                employee = value;
            }
        }
        return employee;
    }

    public int sumSalaryInDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public int averageSalaryInDepartment(int department) {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;
            }
        }
        return (int) sum / count;
    }

    public void indexSalaryInDepartment(int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
            }
        }
    }

    public void printEmployeesFromDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %d \n",
                        employee.getId(),
                        employee.getFullName(),
                        employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSmallSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %d \n",
                        employee.getId(),
                        employee.getFullName(),
                        employee.getSalary());
            }
        }
    }

    public void printEmployeesWithBigSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %d \n",
                        employee.getId(),
                        employee.getFullName(),
                        employee.getSalary());
            }
        }
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee searchEmployee(int id) {
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                emp = employees[i];
            }
        }
        return emp;
    }
}
