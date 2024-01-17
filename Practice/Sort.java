// package Practice;

import java.util.*;

public class Sort {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of elements in the array: ");
       int n = sc.nextInt();
       int a[] = new int[n];
       System.out.print("Enter the elements of the array: ");
       for(int i = 0;i < n; i++){
           a[i] = sc.nextInt();
       }
       for(int i = 0;i < n; i++){
           for(int j = i+1;j < n-1-i;j++){
               if(a[i]>a[j]){
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
       }
        System.out.print("\nSorted array in ascending order:");
               for(int i = 0;i < n; i++){
                   System.out.print(a[i]+" ");
               }

}
