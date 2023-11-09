// package ArrayProb1;

import java.util.Scanner;

//input and output of single dimension array
public class ArrayProb1 {
    public static void main(String[] args) {

        // int n,m;
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter size of array");
        // n=in.nextInt();
        // System.out.println("enter size of next array");
        // m=in.nextInt();
        // int arr[] = new int[n];
        // int arr1[] = new int[m];
        // //input of array
        // System.out.println("Enter the array");
        // for(int i=0;i<n;i++){
        // arr[i]=in.nextInt();
        // }
        // //output of array
        // System.out.println("output:");
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i]+",");
        // }

        // //input of second array
        // System.out.println("\nEnter array");
        // for(int i=0;i<m;i++){
        // arr1[i]=in.nextInt();
        // }
        // //output of second array
        // System.out.println("OUTPUT:");
        // for(int i=0;i<m;i++){
        // System.out.print(arr1[i]+",");
        // }
        int row, col;
        Scanner in = new Scanner(System.in);
        
         //rows input
        System.out.println("Enter the number of rows");
        row = in.nextInt();
       
        // columns input
        System.out.println("Enter the number of columns");
        col = in.nextInt();

        //array declaration with size, number of rows and columns in array
        int arr[][]= new int[row][col];

        //input values in array
        System.out.println("Enter the values in array");
        for(int i=0;i<row;i++){ //iterating for getting the number of rows in an array
            for(int j=0;j<col;j++){ //iterating for getting number of columns in an array
                arr[i][j] = in.nextInt();
            }
        }
        //input is complete

        //output of array
        System.out.println("this is your first multi dimensional array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //output complete
    }
}
