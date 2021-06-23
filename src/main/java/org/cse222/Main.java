package org.cse222;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //database created
        Database database = new Database();
        
        Patient p1 = new Patient();
        Patient p2 = new Patient();
        p1.setId(123456);
        p1.setName("Berkan");
        p2.setId(123457);
        p2.setName("Ali");
        database.addPatient(p1);
        database.addPatient(p2);
        
        Consultant cs1 = new Consultant();
        cs1.setId(123121);
        Consultant cs2 = new Consultant();
        cs2.setId(21132121);
        
        database.addConsultants(cs1);
        database.addConsultants(cs2);
        
        
        /*
        addUsers addUser = new addUsers();
        addUser.addConsultant(database);
        addUser.addDoctors(database);*/
      /*

        System.out.println(database.getDoctors().size());
        System.out.println(database.getConsultants().size());*/
        
        PriorityQueue<Patient> pt = new PriorityQueue<Patient>();
        cs1.addPatientEmergency(pt , 123457 , database.getPatients() , 10 );
        
        
        /*
        //MENU
        try {
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream.

            System.out.println("------WELCOME TO THE HOSPITAL MANAGEMENT SYSTEM-------");
            System.out.println("1-Login");
            System.out.println("0-Exit");
            int choose= sc.nextInt();

            if (choose == 1){
                System.out.println("------LOGIN PAGE-------");
                System.out.println("Enter ID:");
                int id = sc.nextInt();
                //System.out.println("Enter Password:");
                //String password = sc.nextLine();

                Person loginPerson = new Person();
                loginPerson = database.findUser(id);

                if (loginPerson != null){
                	
                	
                    if (loginPerson.getJobType() == JobType.Doctor){
                    	System.out.println("------ Menu ------");
                    	

                    } else if(loginPerson.getJobType() == JobType.Admin){

                    } else if (loginPerson.getJobType() == JobType.ChiefPhysician){

                    }else if(loginPerson.getJobType() == JobType.Consultant){
                    	System.out.println("------ Menu ------");
                    	System.out.println("1-) Hasta Kayýt ");
                    	//System.out.println("2-) ");
                    	int op = sc.nextInt();
  
                    	switch(op) {
                    	
                    		case 1:
                    			System.out.println("1-) Acil Hasta Kayýt");
                    			System.out.println("2-) Poliklinik Hasta Kayýt");
                    			int subop = sc.nextInt();
                    			switch(subop) {
                    				case 1:
                    					System.out.println("");
                    					break;
                    			
                    			}
                    			
                    			break;
                             	
                    	}
                    	
                    	
                    	
                    } else if (loginPerson.getJobType() == JobType.Nurse) {

                    } else if (loginPerson.getJobType() == JobType.Pharmacist){

                    } else if (loginPerson.getJobType() == JobType.TechnicianWorker){

                    }

                } else if(loginPerson == null){

                }


            }else {
                return;
            }

        }catch (Exception exception){
            System.out.println(exception.toString());
        }
*/
    }
}
