import java.util.Arrays;
import java.util.*;

public class BubbleSort{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=0;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        
        int a[] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
             a[i] = sc.nextInt();
        }

        //bubble sort
        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(a));
    }
}