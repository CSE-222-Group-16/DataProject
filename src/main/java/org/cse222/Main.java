package org.cse222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //database created
        Database database = new Database();

        addUsers addUser = new addUsers();
        addUser.addConsultant(database);
        addUser.addDoctors(database);
        addUser.addMedicinePatient(database);
        addUser.addMedicinePharmacy(database);
        addUser.addPatients(database);
        addUser.addPatientRecords(database);
        
        database.allUsersP();


        System.out.println(database.getDoctors().size());
        System.out.println(database.getConsultants().size());

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

                Person loginPerson = new Person();
                loginPerson = database.findUser(id);

                if (loginPerson != null){
                    if (loginPerson.getJobType() == JobType.Doctor){

                    } else if(loginPerson.getJobType() == JobType.Admin){

                    } else if (loginPerson.getJobType() == JobType.ChiefPhysician){

                    } else if(loginPerson.getJobType() == JobType.Consultant){

                    } else if (loginPerson.getJobType() == JobType.Nurse) {

                    } else if (loginPerson.getJobType() == JobType.Pharmacist){

                    } else if (loginPerson.getJobType() == JobType.TechnicianWorker){

                    } else {
                        System.out.println("Undefined type!");
                    }

                } else {

                }
            } else {
                return;
            }
        } catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
}
