// package PrimeNumbers;

import java.util.*;
public class Primenumber {
    public static void main(String[] args) {
        //a prime no. has only two  factors i.e 1 and itself.
        //factors list begins with 1 and ends woth the number.

      Scanner sc= new Scanner(System.in);
      int num,i,f=0;   //num-number, i-for loop, f-no. of factors
      System.out.println("Enter the number");
      num = sc.nextInt();

      for(i=1; i<=num; i++){
        if(num%i==0){
         f++;
        //if entered number is completely divisible by i then f will increase by 1. 
        }if(f>2){
            break;
        }  
        //if no. of factors becomes more than 2 the if stt breaks so it stops to check the stt num%i saving execution time.

      }
       if(f==2){
            System.out.println(num+" is a Prime number");
        }else{
            System.out.println(num+" is Not a Prime number");
        }
      
    }
    
}
