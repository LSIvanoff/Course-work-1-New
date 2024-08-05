import java.util.Objects;
public class Employee {
    private final String fullname;
    private int department;
    private int salary;
    private static int count = 0;
    private final int id;

    public Employee(String fullname, int department, int salary) {
        this.id = ++count;
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }


    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }



    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return id + ". ФИО: " + fullname + ", Отдел: " + department + ", Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee newEmployee = (Employee) o;
        return department == newEmployee.department && salary == newEmployee.salary && id == newEmployee.id && Objects.equals(fullname, newEmployee.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, department, salary, id);
    }
}
