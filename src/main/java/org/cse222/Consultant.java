package org.cse222;
import java.util.ArrayList;

public class Consultant extends Person {

    private int blockNumber;

    private int layerNumber;

    private Database databaseRef;


    public Consultant(){
        super();
        this.blockNumber=0;
        this.layerNumber=0;
        setJobType(JobType.Consultant);
    }

    public Consultant(Database database){
        super();
        this.blockNumber=0;
        this.layerNumber=0;
        databaseRef = database;
        setJobType(JobType.Consultant);

    }

    public Consultant(String name, String surName, int age, char gender,
                      Address address, int id, int blockNumber, int layerNumber,
                      Database database){
        super(name, surName, age, gender, address, id);
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
        databaseRef = database;
        setJobType(JobType.Consultant);

    }

    public void ConsultantMenu(){
        System.out.println("-------------------------");
        System.out.println("-----Consultant Menu-----");
        System.out.println("-------------------------");
        System.out.println("--Patient Registration---");
        System.out.println("-------------------------");

    }
    
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

    public static void main(String[] args) {
        Database database = new Database();
        database.getDoctors().put(0,new Doctor(database));
        database.getDoctors().get(0).setName("Ali");

        Consultant consultant = new Consultant(database);
        consultant.ConsultantMenu();
        consultant.patientRegistration(new Patient(),database.getDoctors().get(0));
        consultant.patientRegistration(new Patient(),database.getDoctors().get(0));
        consultant.patientRegistration(new Patient(),database.getDoctors().get(0));
        consultant.patientRegistration(new Patient(),database.getDoctors().get(0));

        System.out.println(database.getDoctors().get(0).getPatientList().size());


    }


}
