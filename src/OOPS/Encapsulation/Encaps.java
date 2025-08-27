package OOPS.Encapsulation;

import java.lang.reflect.Field;

class Employee{
   private double salary = 1000;

    public double getSalary(){ // getter method
        return salary;
    }
    public void setSalary(double salary) {// setter method
        if(salary>0)
            this.salary = salary;
        else
            System.out.println("Salary cannot be negative");
    }

    private String name;
}

public class Encaps {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        Employee emp = new Employee();
//        Field fSalary = Employee.class.getDeclaredField("salary");
//        fSalary.setAccessible(true);
//        System.out.println(fSalary.get(emp));
        emp.setSalary(1234);
        System.out.println(emp.getSalary());



    }
}
