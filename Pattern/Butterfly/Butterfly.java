// package Butterfly;

public class Butterfly {
    
   public static void main(String[] args) {
    int n = 4; //indicates the no. of rows,when butterfly is split into half 
    
    //upper part of butterfly
    for(int i=1; i<=n; i++){  //outer loop for counting the no. of rows
        
        for(int j=1; j<=i; j++){    //inner loop1 for printing stars in 1st part of the 1st half
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){  //inner loop2 for spaces which are 2(n-i) in every row
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){    //inner loop3 for printing stars in 2nd part of the 1st half
            System.out.print("*");
        }

        System.out.println();
     }

     //lower part of butterfly
     for(int i=n; i>=1; i--){        //outer loop for counting the no. of rows

        for(int j=1; j<=i; j++){    //inner loop1 for printing stars in 1st part of the 2nd half
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){   //inner loop2 for spaces which are 2(n-i) in every row
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){    //inner loop3 for printing stars in 2nd part of the 2nd half
            System.out.print("*");
        }

        System.out.println();
     }
   } 
}


