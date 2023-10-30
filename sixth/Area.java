package sixth;

import java.util.Scanner;

/*write 4 functions to calculate area of square, area of triangle, area of circle, area of rectange*/
public class Area {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side value of square: ");
        int a = sc.nextInt();

        // squarearea(a);
        System.out.println("Area of square is "+squarearea(a));

        System.out.println("Enter the length and breadth of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
       // rectanglearea(l,b);
        System.out.println("Area of rectangle is "+rectanglearea(l,b));

        System.out.println("Enter length and breadth of triangle");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Triangle area is "+trianglearea(l,b));

        System.out.println("Enter radius of circle");
        int r= sc.nextInt();
        sc.close();
        System.out.println("Area of circle is "+circlearea(r));
        
    }
    public static int squarearea(int a){
        return a*a;
    }
     public static int rectanglearea(int l,int b){
        return l*b;
    }
    public static double trianglearea(int l,int b){
        return 0.5*l*b;
    }
    public static double circlearea(int r){
        return 3.14*r*r;
    }
}
