package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
    public static void main(String[] args) {
        String csd = null;
        try {
            System.out.println(csd.length());
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }




        // Compile time error - Checked Exception
        try {
            FileInputStream fs = new FileInputStream("file.txt");
        }catch(FileNotFoundException e){

//            e.printStackTrace();
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
        }


        System.out.println("Hello");
        System.out.println("Hiiii");
        System.out.println("Heyyyyy");
        // Runtime error - Unchecked Exception
        try {
            System.out.println(10 / 0);
        }catch(ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());

        }
        System.out.println("Hieee");
        System.out.println("Byeee");
        System.out.println("Byeee");


    }
}
