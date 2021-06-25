
import java.util.Scanner;

/**
 * Admin is a owner of the system.
 * He/She is a most powerful user.
 */
public class Admin extends Person {

    Database databaseRef;

    public Admin(Database database){
        super();
        databaseRef = database;
        setId(100);
        setJobType(JobType.Admin);
    }

    public Admin(String name, String surName, int age, char gender,
                 Address address,Database database){
        super(name, surName, age, gender, address, 100);
        databaseRef = database;
        setJobType(JobType.Admin);
    }

    /**
     * Assigns new floor to the nurse
     * and block.
     * @param newNurse
     * @param blockNumber
     * @param floorNumber
     */
    public void assignNurseToFloor(Nurse newNurse, int blockNumber, int floorNumber){
        newNurse.setBlockNumber(blockNumber);
        newNurse.setLayerNumber(floorNumber);

    }

    /**
     * Assign new floor to the nurse, and block.
     * @param newConsultant
     * @param blockNumber
     * @param floorNumber
     */
    public void assignConsultantToFloor(Consultant newConsultant, int blockNumber, int floorNumber){
        newConsultant.setBlockNumber(blockNumber);
        newConsultant.setLayerNumber(floorNumber);

    }

    /**
     * Assign new block and floor number to the doctor.
     * @param newDoctor
     * @param blockNumber
     * @param officeNumber
     * @param floorNumber
     */
    public void assignDoctorToBlock(Doctor newDoctor, int blockNumber, int officeNumber, int floorNumber){
        newDoctor.setBlockNumber(blockNumber);
        newDoctor.setLayerNumber(floorNumber);
        newDoctor.setOfficeNumber(officeNumber);
    }

    /**
     * Assign new block number to the
     * tech worker.
     * @param newTechnicianWorker
     * @param blockNumber
     */
    public void assignTechnicalWorkerToBlock(TechnicianWorker newTechnicianWorker, int blockNumber){
        newTechnicianWorker.setBlockNumber(blockNumber);

    }

    /**
     * Menu of a class.
     */
    public void menu(){
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

                System.out.println(databaseRef.findNurse(new Nurse(id,databaseRef)).toString());

            } else if (menuOpt.equalsIgnoreCase("3")){
                System.out.println("Enter Consultant ID:");
                int id = reader.nextInt();
                System.out.println("Enter Block No:");
                int block = reader.nextInt();
                System.out.println("Enter Floor No:");
                int floor  = reader.nextInt();

                databaseRef.getConsultants().get(databaseRef.getConsultants().indexOf(new Consultant(id,databaseRef))).setBlockNumber(block);
                databaseRef.getConsultants().get(databaseRef.getConsultants().indexOf(new Consultant(id,databaseRef))).setBlockNumber(floor);

                System.out.println(databaseRef.getConsultants().get(databaseRef.getConsultants().indexOf(new Consultant(id,databaseRef))).toString());
            } else if (menuOpt.equalsIgnoreCase("4")){
                System.out.println("Enter Doctor ID:");
                int id = reader.nextInt();
                System.out.println("Enter Block No:");
                int block = reader.nextInt();
                System.out.println("Enter Layer No:");
                int layer  = reader.nextInt();

                databaseRef.getDoctors().get(id).setBlockNumber(block);
                databaseRef.getDoctors().get(id).setLayerNumber(layer);
                
                System.out.println( databaseRef.getDoctors().get(id).toString());
            } else if(menuOpt.equalsIgnoreCase("5")){
                System.out.println("Enter Tech Worker ID:");
                int id = reader.nextInt();
                System.out.println("Enter Block No:");
                int block = reader.nextInt();
                System.out.println("Enter Layer No:");
                int layer  = reader.nextInt();

                databaseRef.getTechnicianWorkers()
                        .get(databaseRef.getTechnicianWorkers().
                                indexOf(new TechnicianWorker(id,databaseRef))).setBlockNumber(block);

                databaseRef.getTechnicianWorkers()
                        .get(databaseRef.getTechnicianWorkers().
                                indexOf(new TechnicianWorker(id,databaseRef))).setLayerNumber(layer);

                System.out.println(
                        databaseRef.getTechnicianWorkers()
                                .get(databaseRef.getTechnicianWorkers().
                                        indexOf(new TechnicianWorker(id,databaseRef))).toString()
                );
            }
            else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }









}
