

abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println(name + " Salary: 50000");
    }
}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println(name + " Salary: 20000");
    }
}

class Intern extends Employee {

    Intern(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println(name + " Stipend: 10000");
    }
}

public class project03 {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Tanmay");
        f.calculateSalary();

        PartTimeEmployee p = new PartTimeEmployee("Rahul");
        p.calculateSalary();

        Intern i = new Intern("Aman");
        i.calculateSalary();
    }
}