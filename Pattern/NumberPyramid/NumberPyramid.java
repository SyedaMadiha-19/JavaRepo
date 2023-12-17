public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++){  //outer loop is for counting total number of rows
            for(int j=1; j<=n-i; j++){  //inner loop for no. of spaces,i.e n-ispaces in each row b4 1st no. in a row
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){   //this is for printing nos.,every row should no.= 'the row no.' and there should b printed i no. of tyms
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
