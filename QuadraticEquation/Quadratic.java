
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

        if(y>0){
         System.out.println("The equation has real & distinct roots");
         System.out.println("The roots are" +result1+ "and" +result2);
        }
        else if(y==0){
            double root=-b/(2*a);
            System.out.println("The equation has real and equal roots");
            System.out.println("The root is" +root);
        }
        else{
            System.out.println("Roots are imaginary");
            double realp = -b/(2*a);
            double imagp = -y/(2*a);
            System.out.printf("The roots are (%2f + i%4f) and (%2f - i%4f)\n", realp,imagp,realp,imagp);
        }
    }
}
