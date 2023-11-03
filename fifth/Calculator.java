// package fifth;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2; // variabes for add, sub, mul, div
        Scanner in = new Scanner(System.in); // Scanner class object creation for taking input in num1 and num2

        System.out.println("enter first number"); // for asking input 1
        num1 = in.nextInt(); // taking first input

        System.out.println("enter second number"); // for asking input 2
        num2 = in.nextInt(); // taking second input

        System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 to obtain quotient and 5 for remainder");

        int button = in.nextInt();
        in.close();

        switch (button) {
            case 1:
                System.out.println("sum of the numbers is " + add(num1, num2));
                break;
            case 2:
                System.out.println("the difference between the numbers is " + sub(num1, num2));
                break;
            case 3:
                System.out.println("the product of the numbers is " + mul(num1, num2));
                break;
            case 4:
                System.out.println("the quotient of the numbers is " + div(num1, num2));
                break;
            case 5:
                System.out.println("the remainder of the numbers is " + rem(num1, num2));
                break;
            default:
                System.out.println("invalid button");
        }

    }

    // function defination of addition
    public static int add(int num1, int num2) {
        return num1 + num2; // returning operation
    }

    // function defination of substraction
    public static int sub(int num1, int num2) {
        return num1 - num2; // returning operation
    }

    // function defination of multiplication
    public static int mul(int num1, int num2) {
        return num1 * num2;// returning operation
    }

    // function defination of division to get quotient value
    public static float div(int num1, int num2) {
        return num1 / num2;// returning operation
    }

    // function defination of division to get remainder value
    public static float rem(int num1, int num2) {
        return num1 % num2;// returning operation
    }

}
