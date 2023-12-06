public class RightHalfPyramid {
    public static void main(String[] args) {
        int n= 4;

        //Outer loop for counting no. of rows
        for(int i=1; i<=n ; i++){
            //inner loop1 --> SPACE print
            for(int j=1; j<=n-i ; j++){
               System.out.print(" ");
            }

            //inner loop2 --> STAR print
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println();  //to create new line after each row 
        }
    }
    
}

