package P1;

import java.util.Scanner;

class ObjectArr {
    Scanner sc = new Scanner(System.in);
    int nEmp;
    String sName;
    String add;
    
    void mCalculateIncomeTax(long mSal){
        System.out.println("return income tax");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ObjectArr e1 = new ObjectArr();
        e1.nEmp = 1234;
        e1.sName = "Himanshu";
        e1.add = "Delhi";
        ObjectArr e2 = new ObjectArr();
        e2.nEmp = 543;
        e2.sName = "Shubham";
        e2.add = "Pune";
        ObjectArr e3 = new ObjectArr();
        e3.add = "Delhi";
        e1.mCalculateIncomeTax(1245);
        System.out.println("e1 employee name is "+e1.sName);
        e2.mCalculateIncomeTax(44);
        System.out.println("e2 employee name is "+e2.sName);
    }
}