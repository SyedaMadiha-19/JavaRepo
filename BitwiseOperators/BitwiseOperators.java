// package BitwiseOperators;

import java.util.*;
public class BitwiseOperators {
    public static void main(String[] args) {
        int num,pos,res,choice=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Left Shift Operation,\n 2 for Right SHift Operation,\n 3 for Unsigned Right Shift Operation");
        choice = sc.nextInt();

        
        switch (choice) {
            case 1:
                 System.out.println("\n LEFT SHIFT OPERATOR\n Enter a number: ");
                 num = sc.nextInt();
                 System.out.println("Enter the number of positions for Left Shift Operation");
                 pos = sc.nextInt();
                 res = num << pos ;
                 System.out.println("\nResult of Left Shift Operation: ");
                 System.out.printf("\n %d << %d = %d \n",num,pos,res);
                break;

            case 2:
                System.out.println("\n RIGHT SHIFT OPERATOR\n Enter a number: ");
                 num = sc.nextInt();
                 System.out.println("Enter the number of positions for Right Shift Operation");
                 pos = sc.nextInt();
                 res = num >> pos ;
                 System.out.println("\nResult of Right Shift Operation: ");
                 System.out.printf("\n %d >> %d = %d \n",num,pos,res);
                break;

            case 3:
               System.out.println("\n UNSIGNED RIGHT SHIFT OPERATOR\n Enter a number: ");
                 num = sc.nextInt();
                 System.out.println("Enter the number of positions for Unsigned Right Shift Operation");
                 pos = sc.nextInt();
                 res = num >>> pos ;
                 System.out.println("\nResult of Unsigned Right Shift Operation: ");
                 System.out.printf("\n %d >>> %d = %d \n",num,pos,res);
                break;

            default:
                System.out.println("!!Invalid Choice!!");
                               
        }
       
    }
}
