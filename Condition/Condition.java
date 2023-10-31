// package Condition;
import java.util.*;

public class Condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        // if (button==1) {
        //     System.out.println("Hi!");   
            
        // }
        // else if(button==2){
        //     System.out.println("Assalamalaikum");
        // }
        // else if(button==3){
        //     System.out.println("Kayfa haluka");
        // }
        // else{
        //     System.out.println("Invalid button");
        // }


        switch (button) {
            case 1:System.out.println("Assalamalaikum");
            break;
            case 2:System.out.println("Kayfa haluka");  
            break;  
            case 3:System.out.println("Maa assalama");
            break;
            default:System.out.println("Invalid button");
                
        }
    }


}


