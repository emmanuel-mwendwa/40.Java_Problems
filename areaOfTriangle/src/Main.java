import java.util.Scanner;

//Find area of triangle if all sides are given
public class Main {
    public static void main(String[] args) {
//        s = 1/2(a+b+c)
//        s = sqrt(s*(s-a)*(s-b)*(s-c))
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of side a:");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Enter value of side b:");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("Enter value of side c:");
        int c = Integer.parseInt(sc.nextLine());


        double s = ((double) (a + b + c) /2);
        double ans = Math.sqrt((s)* (s-a) * (s-b) * (s-c));
        System.out.println(ans);

    }
}