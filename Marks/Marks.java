// package Marks;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        /*Here we are using do-while because we want marks to be input and printed out atleast once after that we ere giving
         * a choice to either stop the result or continue the input and output of marks.
        */
        
        do{
            System.out.println("Enter your marks");
            int marks =sc.nextInt();

            if (marks>=90 && marks<=100) {
                System.out.println("This is good");
            }else if (marks>=60 && marks<=89) {
                System.out.println("This is also good");
            }else if (marks<=59 && marks>=0) {
                System.out.println("This is good as well");
            }else{
                System.out.println("Invalid marks");
            }
            
            System.out.println("Enter your choice(either 1 or 0)\n 1 to continue checking results or 0 to exit");
            choice = sc.nextInt();

        }while(choice==1);
         if (choice>1) {
            System.out.println("Invalid choice");
         }

        sc.close();
    }
    
}
