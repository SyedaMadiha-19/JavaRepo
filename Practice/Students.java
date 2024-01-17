// package Practice;

import java.util.*;

class StudentType {
    String USN;
    String NAME;
    String BRANCH;
    String PHONE;
    double PERCENTAGE;

    public StudentType(String USN,String NAME,String BRANCH,String PHONE,double PERCENTAGE){
        this.USN = USN;
        this.NAME = NAME;
        this.BRANCH = BRANCH;
        this.PHONE = PHONE;
        this.PERCENTAGE = PERCENTAGE;
    }

    public String getUSN(){
       return USN;
    }

    public String getNAME(){
        return NAME;
    }

    public String getBRANCH(){
        return BRANCH;
    }

    public String getPHONE(){
        return PHONE;
    }

    public double getPERCENTAGE(){
        return PERCENTAGE;
    }
    
  }

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<StudentType> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        for(int i = 1;i <= n; i++){
        System.out.println("Enter the details of student"+i+":");
        System.out.print("USN: ");
        String USN = sc.next();
        System.out.print("NAME: ");
        String NAME = sc.next();
        System.out.print("BRANCH: ");
        String BRANCH = sc.next();
        System.out.print("PHONE: ");
        String PHONE = sc.next();
        System.out.print("PERCENTAGE: ");
        double PERCENTAGE = sc.nextDouble();

        students.add(new StudentType(USN, NAME, BRANCH, PHONE, PERCENTAGE));

        }

        System.out.println("\nSTUDENT DETAILS\n======================================");
        System.out.println("USN\tNAME\tBRANCH\tPHONE\t\tPERCENTAGE\n");
        for(StudentType student : students){
            System.out.println(student.getUSN()+"\t"+student.getNAME()+"\t"+student.getBRANCH()+"\t"+student.getPHONE()+"\t"+student.getPERCENTAGE());
            
        }
    }

   
}
//List<> MyListName = new ArrayList<>();
// MyListName.add(new Type(item1,item2,.........,item n));
//for-each loop
// for(Type var_name : arraylist(or array over which iteration is to b done)){}