// package Practice;

/* INHERITANCE */

class StaffType{
    private int Staffid;
    private String Name;
    private String Phone;
    private double Salary;

    public StaffType(int Staffid,String Name,String Phone,double Salary){
        this.Staffid = Staffid;
        this.Name = Name;
        this.Phone = Phone;
        this.Salary = Salary;
    }

        public int getStaffid(){
            return Staffid;
        }
        public String getName(){
            return Name;
        }
        public String getPhone(){
            return Phone;
        }
        public double getSalary(){
            return Salary;
        }
        public void DisplayInfo(){
            System.out.println("STAFF ID: "+this.getStaffid());
            System.out.println("NAME: "+this.getName());
            System.out.println("PHONE: "+this.getPhone());
            System.out.println("SALARY: "+this.getSalary());
        }
    }

class Teaching extends StaffType{
    private String domain;
    private int publications;

    public Teaching(int Staffid,String Name,String Phone,double Salary,String domain,int publications){
        super(Staffid,Name,Phone,Salary);
        this.domain = domain;
        this.publications = publications;
    }
    public String getDomain(){
        return domain;
    }
    public int getpublications(){
        return publications;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("DOMAIN: "+this.getDomain());
        System.out.println("PUBLICATIONS: "+this.getpublications()+"\n");
    }
}

class Technical extends StaffType{
    private String skills;

    public Technical(int Staffid,String Name,String Phone,double Salary,String skills){
        super(Staffid, Name, Phone, Salary);
        this.skills = skills;
    }
    public String getSkills(){
        return skills;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("SKILLS: "+this.getSkills()+"\n");
    }
}

class Contract extends StaffType{
    private int period;
    public Contract(int Staffid,String Name,String Phone,double Salary,int period){
        super(Staffid, Name, Phone, Salary);
        this.period = period;
    }
    public int getPeriod(){
        return period;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("TENURE: "+this.getPeriod()+"months\n");
    }
}


public class Staff {
    public static void main(String[] args) {
        Teaching t1 = new Teaching(12,"JOSEPHINE KIRAN","9980567562",75000,"ISE",12);
        Teaching t2 = new Teaching(32,"PUSHPA LATHA","80697544598",75000,"CSE",15);
        System.out.println("TEACHING STAFF\n=======================");
        t1.DisplayInfo();
        t2.DisplayInfo();
        Technical tc1 = new Technical(34,"KANEEZ E FATHIMA","8050997561",90000,"JAVA,PYTHON,SQL");
        Technical tc2 = new Technical(35,"ZAIN MALIK","9965897653",90000,"HTML,JAVASCRIPT,C++");
        System.out.println("TECHNICAL STAFF\n=======================");
        tc1.DisplayInfo();
        tc2.DisplayInfo();
        Contract c1 = new Contract(40,"SANGEETHA REDDY","7556438900",70000,7);
        Contract c2 = new Contract(42,"ARUN KUMAR","9876543210",70000,6);
        System.out.println("CONTRACT DETAILS\n========================");
        c1.DisplayInfo();
        c2.DisplayInfo();  

    }
}
