

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addNewEmployees(new Employee("Ivanov I.I.", 5, 80000));
        employeeBook.addNewEmployees(new Employee("Petrov P.P.", 4, 70000));
        employeeBook.addNewEmployees(new Employee("Sidorov S.S.", 3, 65000));
        employeeBook.addNewEmployees(new Employee("Valentinova V.V.", 2, 73000));
        employeeBook.addNewEmployees(new Employee("Adamova A.A.", 1, 68500));
        employeeBook.addNewEmployees(new Employee("Fedorov F.F.", 1, 69000));
        employeeBook.addNewEmployees(new Employee("Kimov K.K.", 2, 71500));
        employeeBook.addNewEmployees(new Employee("Pavlova P.P.", 3, 67200));
        employeeBook.addNewEmployees(new Employee("Andreev A.A.", 4, 72300));
        employeeBook.addNewEmployees(new Employee("Afanasiev A.A.", 5, 66000));


        System.out.println();
        System.out.println("Список всех сотрудников: ");
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Сумма затрат на зп: " + employeeBook.calculateSalary());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.minSalary());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.maxSalary());
        System.out.println();
        System.out.println("Среднее значение зарплат: " + employeeBook.calculateAverageSalary());
        System.out.println();

        System.out.println("Список ФИО сотрудников:");
        employeeBook.printEmployeeFullnames();
        System.out.println();
        System.out.println();
        System.out.println("Повышенная сложность:");
        System.out.println("Зарплаты сотрудников при индексации: ");
        employeeBook.indexSalary(10);
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Минимальная зп по отделу: " + employeeBook.minSalaryOfDepartment(3));
        System.out.println();
        System.out.println("Максимальная зп по отделу: " + employeeBook.maxSalaryOfDepartment(4));
        System.out.println();
        System.out.println("Сумма затрат на зп по отделу: " + employeeBook.calculateSalaryOfDepartment(2));
        System.out.println();
        System.out.println("Средня зп по отделу: " + employeeBook.calculateAverageSalaryOFDepartment(5));
        System.out.println();
        System.out.println("Зарплаты сотрудников при индексации по отделу: ");
        employeeBook.indexSalaryOfDepartment(1, 5);
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Данные сотрудников отдела (без указания номера отдела):");
        employeeBook.printDepartment(1);
        System.out.println();

        int number = 79117;

        System.out.println("Все сотрудники с зп меньше числа " + number);
        employeeBook.employeesWithSalaryLessThanTheNumber(number);
        System.out.println();

        System.out.println("Все сотрудники с зп больше (или равно) числа " + number);
        employeeBook.employeesWithSalaryGreaterThanTheNumber(number);
        System.out.println();
        System.out.println();
        System.out.println("Очень сложно: ");
        System.out.println();
        System.out.println("Удаление сотрудника по ID: ");
        employeeBook.removeEmployee(4);
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Добавления нового сотрудника: ");
        employeeBook.addNewEmployees(new Employee("Stepanov S.S.", 2, 71000));
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Вывод данных о сотруднике по ID: ");
        employeeBook.searchById(3);

    }


}