import java.util.*;

public class ArraysMultipication {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements in first array: ");
       int n = sc.nextInt();
       int a[] = new int[n];
       System.out.println("Enter the elements of first array: ");
       for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
       } 

       System.out.println("Enter the number of elements in second array: ");
       int m = sc.nextInt();
       int b[] = new int[m];
       System.out.println("Enter the elements of second array: ");
       for(int i=0;i<m;i++){
        b[i] = sc.nextInt();
       }

       if (m != n) {
        System.out.println("MATH ERROR!!!\nArrays have different length,hence can't be multiplied");
       }
       int r[] = new int[m];
       
        for(int i=0;i<n;i++){
            r[i] = a[i]*b[i];
        }
        System.out.println("Product of Arrays is "+Arrays.toString(r));
       }
    }
