// package SolidRhombus;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;  //indicates no. of rows

        for(int i=1; i<=n; i++){   //outer loop for counting the no. of rows
            for(int j=1; j<=n-i; j++){  //inner loop for space print
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){    //second inner loop for star prin                                                                                                                                                                                                                                                                                                                                     
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
