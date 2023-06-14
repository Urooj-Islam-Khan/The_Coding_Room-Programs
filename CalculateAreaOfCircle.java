import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, radius;
        final double PI = 3.14;

        System.out.println("Enter radius of circle");
        radius = sc.nextDouble();
        area = PI * radius * radius;
        System.out.println("Area of circle is "+ area);
    }
}
