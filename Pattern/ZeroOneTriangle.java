public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n ; i++){   //outer loop for no. of rows
            for(int j=1; j<=i ; j++){
                int sum = i+j;
                if (sum%2 == 0) {   //Even then 1 is printed
                    System.out.print("1 ");
                }else{              //odd then 0 is printed
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
