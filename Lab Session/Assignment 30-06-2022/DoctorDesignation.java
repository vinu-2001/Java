package labsession;

import java.util.Scanner;

public class DoctorDesignation {
    public static void main(String[] args) 
    {
    	//Creating Scannar class
        Scanner sc = new Scanner(System.in);
        //Taking input from user
        String t = sc.nextLine();
        //if statement
        if(t.equalsIgnoreCase("Specialist"))
        {
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        //else-if statement
        else if(t.equalsIgnoreCase("Doctor"))
        {
            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        //else statement
        else
        {
            System.out.println("Invalid Input");
        }     
        sc.close();  
    }
}