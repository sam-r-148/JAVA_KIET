package P1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("New main");
        Scanner sc = new Scanner(new File("src/P1/sam.txt"));
//        System.out.print("Enter here : ");
        String data = sc.nextLine();
        System.out.println(data);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
