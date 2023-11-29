// package LinearSearch;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];

        System.out.println("enter the elements of array");
        for(int i= 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number whose position is needed");
        int x= sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if (arr[i]==x) {
                System.out.println("x is found at "+(i+1)+"th position");
            }
           else if(arr[i] != x) {
                System.out.println("this number is not in the array");
                break;
            }
            
            
        }
        
    }
}
