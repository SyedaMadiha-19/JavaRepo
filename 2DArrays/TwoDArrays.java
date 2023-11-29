// package 2DArrays;

import java.util.*;
public class TwoDArrays {
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
        
       //output
         for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();//moves to nxt line after one row is filled
       }
        
        
        }
    }

