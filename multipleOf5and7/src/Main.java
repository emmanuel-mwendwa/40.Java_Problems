import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check: ");
        int num = Integer.parseInt(sc.next());

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println(num + " is a multiple of 5 and 7");
        }
        else {
            System.out.println(num + " is not a multiple of 5 and 7");
        }
    }
}