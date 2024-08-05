import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static Employee createEmployee(String fullname, int department, int salary) {
        return new Employee(fullname, department, salary);
    }

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = createEmployee("Ivanov I.I.", 5, 80000);
        employees[1] = createEmployee("Petrov P.P.", 4, 70000);
        employees[2] = createEmployee("Sidorov S.S.", 3, 65000);
        employees[3] = createEmployee("Valentinova V.V.", 2, 73000);
        employees[4] = createEmployee("Adamova A.A.", 1, 68500);
        employees[5] = createEmployee("Fedorov F.F.", 1, 69000);
        employees[6] = createEmployee("Kimov K.K.", 2, 71500);
        employees[7] = createEmployee("Pavlova P.P.", 3, 67200);
        employees[8] = createEmployee("Andreev A.A.", 4, 72300);
        employees[9] = createEmployee("Afanasiev A.A.", 5, 66000);


        printEmployee();
        System.out.println();
        int result = calculateSalary();
        System.out.println("Сумма затрат на зп: " + result);
        System.out.println();
        Employee min = minSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + min);
        System.out.println();
        Employee max = maxSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + max);
        System.out.println();
        double averageSalary = calculateAverageSalary();
        System.out.println("Среднее значение зарплат: " + averageSalary);
        System.out.println();

        System.out.println("Список ФИО сотрудников:");
        printEmployeeFullnames();

        System.out.println();
        System.out.println();
        System.out.println("Повышенная сложность:");
        System.out.println("Зарплаты сотрудников при индексации: ");
        indexSalary(10);
        printEmployee();
        System.out.println();
        System.out.println("Минимальная зп по отделу: " + minSalaryOfDepartment(3));
        System.out.println();
        System.out.println("Максимальная зп по отделу: " + maxSalaryOfDepartment(4));
        System.out.println();
        System.out.println("Сумма затрат на зп по отделу: " + calculateSalaryOfDepartment(2));
        System.out.println();
        System.out.println("Средня зп по отделу: " + calculateAverageSalaryOFDepartment(5));
        System.out.println();
        System.out.println("Зарплаты сотрудников при индексации по отделу: ");
        indexSalaryOfDepartment(1, 5);
        printEmployee();
        System.out.println();
        System.out.println("Данные сотрудников отдела (без указания номера отдела):");
        printDepartment(1);
        System.out.println();
        System.out.println("Все сотрудники с зп меньше числа ");
        employeesWithSalaryLessThanTheNumber(79500);
        System.out.println();
        System.out.println("Все сотрудники с зп больше (или равно) числа ");
        employeesWithSalaryGreaterThanTheNumber(79117);
    }


    public static int calculateSalary() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            result += employees[i].getSalary();
        }
        return result;
    }

    public static Employee minSalary() {
        if (employees.length == 0) return null;
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public static Employee maxSalary() {
        if (employees.length == 0) return null;
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }


    public static double calculateAverageSalary() {
        if (employees.length == 0) return 0;
        return calculateSalary() / employees.length;
    }


    public static void printEmployeeFullnames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullname());
        }

    }

public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
}

public static void printDepartment(int dep) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    System.out.println(employee.getId() + "Ф.И.О.:" + employee.getFullname() + ", Зарплата: " + employee.getSalary());
                }
            }
        }
}

public static void indexSalary(int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * ( percent / 100f + 1)));
            }
        }
    }


public static Employee minSalaryOfDepartment(int dep) {
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


    public static Employee maxSalaryOfDepartment(int dep) {
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


public static int calculateSalaryOfDepartment (int dep) {
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

public static int departmentCount (int dep) {
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


public static float calculateAverageSalaryOFDepartment (int dep) {
        return calculateSalaryOfDepartment(dep) / (float) departmentCount(dep);
}


public static void indexSalaryOfDepartment (int dep, int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    int currentSalary = employee.getSalary();
                    employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
                }
            }
        }
}

public static void employeesWithSalaryLessThanTheNumber (int number) {
    for (Employee employee : employees) {
        if (employee != null) {
            if (employee.getSalary() < number) {
                System.out.println(employee.getId() + ". Ф.И.О.:" + employee.getFullname() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
}

public static void employeesWithSalaryGreaterThanTheNumber (int number) {
    for (Employee employee : employees) {
        if (employee != null) {
            if (employee.getSalary() >= number) {
                System.out.println(employee.getId() + ". Ф.И.О.:" + employee.getFullname() + ", Зарплата: " + employee.getSalary());
                }
            }
        }
    }

}