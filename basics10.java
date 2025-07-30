package irene;

public class basics10 {
    public static void main(String[] args) {
    
        Employee emp1 = new Employee("Irene", 101, 55000);
        Employee emp2 = new Employee("Laura", 102, 62000);

     
        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}


class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);

    }
}
