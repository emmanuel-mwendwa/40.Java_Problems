import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of integers: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        float sum = 0;

        for (int i=0; i<n; i++) {
            System.out.println("Enter number " + (i+1) );
            int x = Integer.parseInt(sc.nextLine());
            sum += x;
        }

        float avg = sum / n;
        System.out.println("The average is: " + avg);
    }
}