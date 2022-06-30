package labsession;

import java.util.Scanner;

public class SpecialistDoctor extends Doctor {
	private String specialist;

//    public void setSpecialist(String s) {
//        this.specialist = s;
//    }
//
//    public String getSpecialist() {
//        return specialist;
//    }
	//creating constructor
    SpecialistDoctor(int i,String n,String l,String s)
    {
        super(i, n, l);
        specialist = s;
    }
   //to print attributes 
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Specialist: "+specialist);
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();
        
        //equalsIgnoreCase method ignore cases.

        if(t.equalsIgnoreCase("Specialist"))
        {
        	//creating object of SpecialistDoctor class
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else if(t.equalsIgnoreCase("Doctor"))
        {
        	//creating object of Doctor class
            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else
        {
            System.out.println("Invalid Input");
        }     
        sc.close();  
    }

}