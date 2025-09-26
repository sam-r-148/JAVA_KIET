package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test{
    void read() throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("file.txt");
    }

        }

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.read();
        }catch(FileNotFoundException e){
//            e.printStackTrace();
            System.out.println(e.toString());//e.toString();
        }

    }
}
