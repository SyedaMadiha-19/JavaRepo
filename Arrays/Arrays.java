// package Arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        n = sc.nextInt();
        System.out.println("Enter the size of second array");
        m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        int sumarr[] = new int[m];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the second elements of second array");
        for (int i = 0; i < m; i++) {

            b[i] = sc.nextInt();
        }

        if (m == n) {
            for (int i = 0; i < m; i++) {
                sumarr[i] = a[i] + b[i];
            }
        } else {
            System.out.println("Math Error!!");
        }
        System.out.println("sum of arrays");
        for (int i = 0; i < m; i++) {
            System.out.print(sumarr[i]+" ");
        }

    }

}
