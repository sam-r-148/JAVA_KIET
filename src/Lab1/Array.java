//WAP to Find largest and smallest numbers in an array giaven by user

package Lab1;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);

    }
}
