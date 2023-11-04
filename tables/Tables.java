// package tables;

import java.util.*;

public class Tables {
    public static void main(String[] args) {
          /*Q. print table of no. input by user */

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number whose table is required");
      int n = sc.nextInt();
      sc.close();

      for(int i=1;i<=10; i++){
        int mul = n*i;
        System.out.println(mul);
      }
    }
}
    

