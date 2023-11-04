// package EvenNumbersloop;

import java.util.*;
public class Evennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end value for your even number's list");
        int n= sc.nextInt();

        for(int i=2;i<=n;i=i+2){
            System.out.println(i);
        }
    }
    
}
