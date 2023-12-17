// package Palindromes;

public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=n;i++){  //counts rows
            //spaces
            int spaces = n-i;
            for(int j=1; j<=spaces ; j++){
                System.out.print(" ");
            }
            //1st part of numbers from i to "1"
            //backward loop
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd set of numbers from "2" to i
            //forward loop
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

            //numbers are printed from i to 1 then from 2 to i(i to 1 to i)
        }
    }
}
