package org.cse222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //database created
        Database database= new Database();
        addUsers addUser = new addUsers();
        addUser.addConsultant(database);
        addUser.addDoctors(database);
        addUser.addMedicinePatient(database);
        addUser.addMedicinePharmacy(database);
        addUser.addPatients(database);
        addUser.addPharmacists(database);
        addUser.addPatientRecords(database);
        addUser.addChiefPhysician(database);
        addUser.addNurse(database);
        addUser.addTech(database);
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
            sc.nextLine();

            if (choose == 1){
                System.out.println("------LOGIN PAGE-------");
                System.out.println("Enter ID:");
                int id = sc.nextInt();
                sc.nextLine();

                Person loginPerson = new Person();
                loginPerson = database.findUser(id);

                if (loginPerson != null){
                    if (loginPerson.getJobType() == JobType.Doctor){
                        new Doctor(database).DoctorMenu();
                    } else if(loginPerson.getJobType() == JobType.Admin){
                        new Admin(database).menu();
                    } else if (loginPerson.getJobType() == JobType.ChiefPhysician){
                        new ChiefPhysician(database).ChiefPhysicianMenu(new Doctor(database));
                    } else if(loginPerson.getJobType() == JobType.Consultant){
                        new Consultant().menu();
                    } else if (loginPerson.getJobType() == JobType.Nurse) {
                        new Nurse(database).menu();
                    } else if (loginPerson.getJobType() == JobType.Pharmacist){
                        new Pharmacist(database).menu();
                    } else if (loginPerson.getJobType() == JobType.TechnicianWorker){
                        new TechnicianWorker(database).Menu();
                    } else {
                        System.out.println("Undefined type!");
                    }

                } else {

                }
            } else if(choose == 0){
            	System.out.println(" Goodbye !!!");
                return;
            }
            else {
            	System.out.println(" Wrong choice goodbye !!!");
            }
        } catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
}
