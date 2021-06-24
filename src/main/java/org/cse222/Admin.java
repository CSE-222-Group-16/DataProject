import java.util.Scanner;

public class Admin extends Person {
    
    Database databaseRef;
    
    public Admin(Database database){
        super();
        databaseRef = database;
    }

    public Admin(String name, String surName, int age, char gender, 
                 Address address, int id,Database database){
        super(name, surName, age, gender, address, id);
        databaseRef = database;

    }

    public void assignNurseToFloor(Nurse newNurse, int blockNumber, int floorNumber){
        newNurse.setBlockNumber(blockNumber);
        newNurse.setLayerNumber(floorNumber);

    }

    public void assignConsultantToFloor(Consultant newConsultant, int blockNumber, int floorNumber){
        newConsultant.setBlockNumber(blockNumber);
        newConsultant.setLayerNumber(floorNumber);

    }

    public void assignDoctorToBlock(Doctor newDoctor, int blockNumber, int officeNumber, int floorNumber){
        newDoctor.setBlockNumber(blockNumber);
        newDoctor.setLayerNumber(floorNumber);
        newDoctor.setOfficeNumber(officeNumber);
    }

    public void assignTechnicalWorkerToBlock(TechnicianWorker newTechnicianWorker, int blockNumber){
        newTechnicianWorker.setBlockNumber(blockNumber);

    }

    private void menu(){
        String menuOpt = "notBack";

        while(!menuOpt.equals("back")){
            System.out.println("-------------------------");
            System.out.println("-----Admin Menu-----");
            System.out.println("-------------------------");
            System.out.println("--1) Add All Users ---");
            System.out.println("-------------------------");
            System.out.println("--2) Assign Nurse To The Floor---");
            System.out.println("-------------------------");
            System.out.println("--3) Assign Consultant To The Floor ---");
            System.out.println("-------------------------");
            System.out.println("--4) Assign Doctor To The Block ---");
            System.out.println("-------------------------");
            System.out.println("--5) Assign Technicial Worker To The Block ---");
            System.out.println("-------------------------");
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();
            
            
            if(menuOpt.equalsIgnoreCase("1")) ;
            else if(menuOpt.equalsIgnoreCase("2")) {
                System.out.println("Enter Nurse ID:");
                int id = reader.nextInt();
                System.out.println("Enter Block No:");
                int block = reader.nextInt();
                System.out.println("Enter Layer No:");
                int layer  = reader.nextInt();
                
                databaseRef.findNurse(new Nurse(id,databaseRef)).setBlockNumber(block);
                databaseRef.findNurse(new Nurse(id,databaseRef)).setLayerNumber(layer);
                
		//Print Result
                System.out.println(databaseRef.findNurse(new Nurse(id,databaseRef)).toString());

            }
            else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }
