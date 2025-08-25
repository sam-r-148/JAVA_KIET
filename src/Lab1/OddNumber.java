//WAP to count the total number of odd numbers between 1-100, and display the sum of them.

package Lab1;

public class OddNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i+=2) {
                System.out.println(i);
                sum = sum + i;
        }
        System.out.println("Sum of odd number is " + sum);
    }
}
