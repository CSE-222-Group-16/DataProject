
import java.util.Scanner;

/**
 * Consultant insert patients into
 * a doctors patient queue.
 */
public class Consultant extends Person {

    private int blockNumber;

    private int layerNumber;

    private Database databaseRef;

    static int idNo = 301;


    public Consultant(){
        super();
        this.blockNumber=0;
        this.layerNumber=0;
        setJobType(JobType.Consultant);
        setId(idNo);
        ++idNo;
    }

    public Consultant(Database database){
        super();
        this.blockNumber=0;
        this.layerNumber=0;
        databaseRef = database;
        setJobType(JobType.Consultant);
        setId(idNo);
        ++idNo;
    }

    public Consultant(int id,Database database){
        super();
        this.blockNumber=0;
        this.layerNumber=0;
        databaseRef = database;
        setJobType(JobType.Consultant);
        setId(id);
    }


    public Consultant(String name, String surName, int age, char gender,
                      Address address, int blockNumber, int layerNumber,
                      Database database){
        super(name, surName, age, gender, address, idNo);
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
        databaseRef = database;
        setJobType(JobType.Consultant);
        ++idNo;

    }

    /**
     * Menu
     */
    public void menu(){
        String menuOpt = "notBack";

        while(!menuOpt.equals("back")){
            System.out.println("-------------------------");
            System.out.println("-----Consultant Menu-----");
            System.out.println("-------------------------");
            System.out.println("--1) Register Patient ---");
            System.out.println("-------------------------");
            System.out.println("--2) Structure of Hospital");
            System.out.println("-------------------------");
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();


             if(menuOpt.equalsIgnoreCase("1")) {
                
                System.out.println("Enter Name:");
                String name = reader.nextLine();
                System.out.println("Enter Surname:");
                String surname = reader.nextLine();
                System.out.println("Enter Age:");
                int age  = reader.nextInt();
                
                System.out.println("Enter Doctor Id: ");
                int id = reader.nextInt();

                databaseRef.getDoctors().get(id).getPatientList().add(new Patient(name,surname,age,'g',new Address(),false,0,false,false));
                
                System.out.println("Patient added: " + databaseRef.getDoctors().get(id).getPatientList().peek().getName() 
                        +" to Doctor: " +databaseRef.getDoctors().get(id).getName() );

            } else if(menuOpt.equalsIgnoreCase("2")){
                 seeHospitalStructure();
             }
            else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }

    /**
     * Prints structure of the hospital
     */
    public void seeHospitalStructure(){
        databaseRef.printHospital();
    }

    /**
     * Adds the needed patient to needed doctor's
     * queue.
     * @param newPatient
     * @param newDoctor
     */
    public void patientRegistration(Patient newPatient, Doctor newDoctor){

        //I found needed doctor's place in database.
        databaseRef.getDoctors().get(newDoctor.getId());
        databaseRef.getDoctors().get(newPatient.getId()).getPatientList().add(newPatient);

        System.out.println("Patient: "
                + databaseRef.getDoctors().get(newPatient.getId()).getPatientList().peek().getId()
                +" "
                + databaseRef.getDoctors().get(newPatient.getId()).getPatientList().peek().getName()
                +" "
                + databaseRef.getDoctors().get(newPatient.getId()).getPatientList().peek().getSurName()
                +" Added to "
                + databaseRef.getDoctors().get(newPatient.getId()).getName()
                +" "
                + databaseRef.getDoctors().get(newPatient.getId()).getSurName()
        );
    }



    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public void setLayerNumber(int layerNumber) {
        this.layerNumber = layerNumber;
    }

    @Override
    public String toString() {
        return super.toString() +"Consultant{" +
                "blockNumber=" + blockNumber +
                ", layerNumber=" + layerNumber +
                '}';
    }
}
