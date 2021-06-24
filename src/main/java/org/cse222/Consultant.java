package org.cse222;

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
        int k;
		for ( k = 0; k < 45; k++) System.out.print("-");
		System.out.print("\n"+"   ");
		System.out.println("Welcome Consultant "+ name+" "+surname);
		for ( k = 0; k < 45; k++) System.out.print("-");
		System.out.print("\n");
		for ( k = 0; k < 45; k++) System.out.print("-");  System.out.println();
		System.out.println("[1] Register a patient");
		for ( k = 0; k < 45; k++) System.out.print("-");  System.out.println();
		System.out.println("[2] See structure of the Hospital");
		for ( k = 0; k < 45; k++) System.out.print("-");  System.out.println();
		System.out.print("\n");

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


    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public void setLayerNumber(int layerNumber) {
        this.layerNumber = layerNumber;
    }
}
