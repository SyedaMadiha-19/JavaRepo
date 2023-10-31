package seventh;

import java.util.*;

public class interest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    

    System.out.println("Enter the Principal value");
    double P=sc.nextDouble();

    System.out.println("Enter the rate of interest");
    int R=sc.nextInt();

    System.out.println("Enter the time period in years");
    int T= sc.nextInt();

    sc.close();

    System.out.println("Simple Interest for the given values is "+simpleinterest(P, R, T));
    double si = simpleinterest(P, R, T);
    System.out.println("total amount is: "+totalamount(si, P));
  }
    public static double simpleinterest(double P,int R,int T){
        return (P*R*T)/100;
    }

    public static double totalamount(double si,double P){
        return P + si;
    }

    
}
