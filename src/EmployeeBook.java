import java.util.Arrays;

public class EmployeeBook {
    public final Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }


    public int calculateSalary() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            result += employees[i].getSalary();
        }
        return result;
    }

    public Employee minSalary() {
        if (employees.length == 0) return null;
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public Employee maxSalary() {
        if (employees.length == 0) return null;
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }


    public double calculateAverageSalary() {
        if (employees.length == 0) return 0;
        return calculateSalary() / employees.length;
    }


    public void printEmployeeFullnames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullname());
        }

    }


    // Повышенный уровень
    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void printDepartment(int dep) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    System.out.println(employee.getId() + "Ф.И.О.:" + employee.getFullname() + ", Зарплата: " + employee.getSalary());
                }
            }
        }
    }

    public void indexSalary(int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }


    public Employee minSalaryOfDepartment(int dep) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != dep) {
                    continue;
                }
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }


    public Employee maxSalaryOfDepartment(int dep) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != dep) {
                    continue;
                }
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }


    public int calculateSalaryOfDepartment(int dep) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    }

    public int departmentCount(int dep) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    count++;
                }
            }
        }
        return count;
    }


    public float calculateAverageSalaryOFDepartment(int dep) {
        return calculateSalaryOfDepartment(dep) / (float) departmentCount(dep);
    }


    public void indexSalaryOfDepartment(int dep, int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    int currentSalary = employee.getSalary();
                    employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
                }
            }
        }
    }

    public void employeesWithSalaryLessThanTheNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.getId() + ". Ф.И.О.:" + employee.getFullname() + ", Зарплата: " + employee.getSalary());
                }
            }
        }
    }

    public void employeesWithSalaryGreaterThanTheNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println(employee.getId() + ". Ф.И.О.:" + employee.getFullname() + ", Зарплата: " + employee.getSalary());
                }
            }
        }
    }


    // Очень сложно
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public boolean addNewEmployees(Employee newEmployees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployees;
                return true;
            }
        }
        return false;
    }

    public void searchById(int id) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getId() == id) {
                    System.out.println("Ф.И.О.: " + employee.getFullname() + " . Отдел: " + employee.getDepartment() + " . Зарплата: " + employee.getSalary());
                }
            }
        }

    }
}
