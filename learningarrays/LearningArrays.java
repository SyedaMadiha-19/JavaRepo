// package learningarrays;

import java.util.*;
public class LearningArrays {
    public static void main(String[] args) {
        // int a[] = new int[4];
        // a[0]=2;
        // a[1]=4;
        // a[2]=3;

        // 
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        //input
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }

        }
    }
