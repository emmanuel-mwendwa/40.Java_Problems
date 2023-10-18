import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double sum = 0d;
        while (i <= 5) {
            System.out.print("Enter " + i + " number: ");
            int n = Integer.parseInt(sc.next());
            sum += n;
            i++;
        }
        double avg = sum / 5;
        System.out.println("The average is: " + avg);
    }
}