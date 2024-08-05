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
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println();
        int result = calculateSalary();
        System.out.println("Общая сумма зарплат: " + result);
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
}