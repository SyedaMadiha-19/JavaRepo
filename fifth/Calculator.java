package fifth;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1,num2; //variabes for add, sub, mul, div
        Scanner in = new Scanner(System.in); //Scanner class object creation for taking input in num1 and num2

        System.out.println("enter first number"); //for asking input 1
        num1 = in.nextInt(); //taking first input
        
        System.out.println("enter second number"); //for asking input 2
        num2 = in.nextInt(); //taking second input
        in.close();
        
        System.out.println("ADDITION- "+add(num1,num2)); //function call of addition
        System.out.println("SUBSTRACTION- "+sub(num1,num2)); //function call of substraction
        System.out.println("PRODUCT- "+mul(num1,num2)); //function call of multiplication
        System.out.println("QUOTIENT- "+div(num1,num2)); //function call of quotient
        System.out.println("REMAINDER- "+rem(num1,num2)); //function call of Remainder
    }
    // function defination of addition
    public static int add(int num1,int num2){
        return num1+num2; //returning operation
    } 

    // function defination of substraction
    public static int sub(int num1,int num2){
        return num1-num2; //returning operation
    } 

    // function defination of multiplication
    public static int mul(int num1,int num2){
        return num1*num2;//returning operation
    } 

    // function defination of division to get quotient value
    public static float div(int num1,int num2){
        return num1/num2;//returning operation
    }

    // function defination of division to get remainder value
    public static float rem(int num1,int num2){
        return num1%num2;//returning operation
    } 

    
}
