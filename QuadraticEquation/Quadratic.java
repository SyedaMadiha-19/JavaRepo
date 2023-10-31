
// package QuadraticEquation;
import java.lang.Math;
import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of constants a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double x = (b*b) - (4*a*c); //b^2 -4ac
        double y = Math.sqrt(x);
        double result1 = (-b+y) / (2*a);
        double result2 = (-b-y) / (2*a);

        System.out.println("Your quadratic equation " + a + "x^2 + " + b + "x + " + c);
        System.out.println("result1: " + result1);
        System.out.println("result1: " + result2);

    }
}
