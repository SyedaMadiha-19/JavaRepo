// package for;

import java.util.*;
public class Loops {
    public static void main(String args[]){
      /*Q. print sum of n natural numbers */
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      int i=1;

      while(i<= n){
       sum = sum+i;
        i= i+1;
      }

      System.out.println(sum);

       }
     }
    
    

