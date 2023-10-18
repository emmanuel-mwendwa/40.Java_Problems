import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of real numbers: ");
        int count = Integer.parseInt(sc.nextLine());

        int i = 0;
        float result = 1.0f;

        while (i < count) {
            System.out.println("Enter a number");
            float x = Float.parseFloat(sc.nextLine());
            if (x > 0) {
                result *= x;
                i++;
            }
            else {
                System.out.println("Number must be greater than 0");
            }
        }
        System.out.println("The product of the numbers is:" + result);
    }
}