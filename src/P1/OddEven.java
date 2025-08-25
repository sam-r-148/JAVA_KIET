package P1;
import java.util.Scanner;

// To find odd and even number without
public class OddEven {
    public static void main(String[] args) {
//        System.out.println(21^1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if((1^num)>num){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}
