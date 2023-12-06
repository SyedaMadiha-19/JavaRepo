// package Pattern;

public class HalfPyramid {
    public static void main(String[] args) {
        // print pattern of half pyramid 
         int n = 4;
         // n denotes row number
         for(int i=1;i<=n;i++){
            //counter works from 1 to n
            for(int j=1;j<=i;j++){
                /*this is for columns,the code inside will be executed only when column no. = row no.
                No. of stars in a row = tht row no. */ 
                System.out.print("*");
            }
            System.out.println();  //to give line after one row completes
         }
    }
}
