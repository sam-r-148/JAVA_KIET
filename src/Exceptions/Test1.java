package Exceptions;

import java.util.Scanner;

class Myexception extends RuntimeException{

    Myexception(){
        super("Not allowed");
    }

    Myexception(String msg){
        super(msg);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if (a < 18) {
//            throw new Myexception();
            throw new Myexception("This is not allowed");
        } else {
            System.out.println("");
        }
    }
}
