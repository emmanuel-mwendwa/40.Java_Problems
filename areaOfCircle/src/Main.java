import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        float radius = Float.parseFloat(sc.next());

        Area(radius);
        Circumference(radius);
    }

    public static void Area(float radius) {
        final float PI = 3.14F;
        float area = PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    public static void Circumference(float radius) {
        final float PI = 3.14F;
        float circumference = PI * radius * 2;
        System.out.println("Area of circle is: " + circumference);
    }
}
