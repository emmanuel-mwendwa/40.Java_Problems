import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter degree in celcius!");
        Scanner sc = new Scanner(System.in);
        float degree = Integer.parseInt(sc.nextLine());
        float fah = ((degree * (9f/5f)) + 32);
        System.out.println(fah);
    }
}