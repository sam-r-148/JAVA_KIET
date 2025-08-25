//WAP to count the number of characters in a given string, to reverse the string and check whether it is palindrome or not?

package Lab1;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Length of string is : " + str.length());

        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }

        System.out.println("Reversed string is : " + rev);
        System.out.println("String is Palindrome : " + str.equals(rev));



    }
}
