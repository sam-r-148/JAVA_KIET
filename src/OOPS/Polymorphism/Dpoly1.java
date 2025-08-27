package OOPS.Polymorphism;

import java.sql.SQLOutput;

// Dynamic or Late binding
class A1 {
    void m1(){
        System.out.println("output from method m1 class A");
    }
}
class B1 extends A1{
    @Override
    void m1(){
        System.out.println("output from method m2 class B");
    }
}

public class Dpoly1 {
    public static void main(String[] args) {
        System.out.println("A");
        A1 b1 = new B1();
        b1.m1();
    }

}
