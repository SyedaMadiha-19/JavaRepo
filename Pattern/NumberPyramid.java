public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n ; i++){  //outer loop --> no. of rows
            for(int j=1 ; j<=i ; j++){  
                 /*inner loop --> to print numbers from 1 to i , bcoz the no. pattern in one row is from to tht row number */
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
        