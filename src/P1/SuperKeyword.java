package P1;

import java.sql.SQLOutput;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void show(){
        System.out.println("Name: " +name+", Salary: "+salary);
    }
}
class Manager extends Employee{
    String dept;
    Manager(String name, double salary, String dept){
        super(name,salary);
        this.dept = dept;
    }
    void show(){
        super.show();
        System.out.println("Department: "+dept);
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        Manager m = new Manager("John", 5000, "IT");
        m.show();
    }
}