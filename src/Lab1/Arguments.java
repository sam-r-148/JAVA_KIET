//WAP to find out the sum of command line arguments.

package Lab1;

public class Arguments {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum of command line arguments is " + sum);
    }
}
