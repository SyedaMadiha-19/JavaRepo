// package LinearSearch2;

import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        //input
        System.out.println("Enter the elements of array");
        //rows
       for(int i=0;i<r;i++){
        //columns
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }

      
        }
          System.out.println("Enter the number whose index value is needed");
        int x= sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;i<c;i++){
                if (arr[i][j]==x) {
                    System.out.print("x is found at "+i+"th row and "+c+"th column");
                }
            }
       }
    }
}
