package org.cse222;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nurse extends Person {

    Database databaseRef;
    
    public static int idNo = 401;

    /**
     * this list for nurse surgery list in a day
     */
    private ArrayList<Integer> surgeryList;

    private int blockNumber;

    private int layerNumber;

    private ArrayList<Integer> investigatePatientList;

    private ArrayList<Integer> needInjectionPatientsList;

    private ArrayList<Integer> needSerumPatientsList;

    public ArrayList<Integer> getSurgeryList() {
        return surgeryList;
    }

    public void setSurgeryList(ArrayList<Integer> surgeryList) {
        this.surgeryList = surgeryList;
    }

    public void setInvestigatePatientList(ArrayList<Integer> investigatePatientList) {
        this.investigatePatientList = investigatePatientList;
    }

    public void setNeedInjectionPatientsList(ArrayList<Integer> needInjectionPatientsList) {
        this.needInjectionPatientsList = needInjectionPatientsList;
    }

    public void setNeedSerumPatientsList(ArrayList<Integer> needSerumPatientsList) {
        this.needSerumPatientsList = needSerumPatientsList;
    }

//    public static int idNo = 401;
    public Nurse(Database database){
        super();
        this.surgeryList = new ArrayList<Integer>();
        this.investigatePatientList = new ArrayList<Integer>();
        this.needInjectionPatientsList = new ArrayList<Integer>();
        this.needSerumPatientsList = new ArrayList<Integer>();
        this.blockNumber=0;
        this.layerNumber=0;
        databaseRef = database;
        setId(idNo);
        ++idNo;
        setJobType(JobType.Nurse);

    }

    public Nurse(int id,Database database){
        super();
        this.surgeryList = new ArrayList<Integer>();
        this.investigatePatientList = new ArrayList<Integer>();
        this.needInjectionPatientsList = new ArrayList<Integer>();
        this.needSerumPatientsList = new ArrayList<Integer>();
        this.blockNumber=0;
        this.layerNumber=0;
        databaseRef = database;
        setId(id);
        setJobType(JobType.Nurse);

    }

    public Nurse(String name, String surName, int age, char gender, Address address
            , int blockNumber, int layerNumber,Database database){
        super(name, surName, age, gender, address, idNo);
        this.surgeryList = new ArrayList<Integer>();
        this.investigatePatientList = new ArrayList<Integer>();
        this.needInjectionPatientsList = new ArrayList<Integer>();
        this.needSerumPatientsList = new ArrayList<Integer>();
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
        databaseRef = database;
        ++idNo;        
        setJobType(JobType.Nurse);

    }

    public void addSurgery(Operation op){
        this.surgeryList.add(op.getId());
    }

    public void setBlockNumber(int blockNumber){
        this.blockNumber=blockNumber;
    }

    public void setLayerNumber(int layerNumber){
        this.layerNumber=layerNumber;
    }


    public int getBlockNumber(){
        return this.blockNumber;
    }

    public int getLayerNumber(){
        return this.layerNumber;
    }

    public ArrayList<Integer> getInvestigatePatientList(){
        return this.investigatePatientList;
    }

    public ArrayList<Integer> getNeedInjectionPatientsList(){
        return this.needInjectionPatientsList;
    }

    public ArrayList<Integer> getNeedSerumPatientsList(){
        return this.needSerumPatientsList;
    }

    /**
     * look getInvestigatePatientList and detect need serum and need vaccinate and fiil arrays
     */
    public void controlPatient(){

    }

    /*
    public List<Patient> giveReportToDoctor(){


    }
    */


    public void giveInjectionToPatient(){


    }

    /**
     * look needInjectionPatientsList and do vaccinate all need patient
     */
    public void injection(){

    }

    /**
     * look needSerumPatientsList and give serum all need patient
     */
    public void giveSerumToPatient(){

    }

    public void menu(){
        String menuOpt = "notBack";

        while(!menuOpt.equals("back")){
            System.out.println("-------------------------");
            System.out.println("-----Nurse Menu-----");
            System.out.println("-------------------------");
            System.out.println("--1) Add Surgery ---");
            System.out.println("-------------------------");
            System.out.println("--2) Add Patient to the Serum List ---");
            System.out.println("-------------------------");
            System.out.println("--3) Add Patient to the Injection List ---");
            System.out.println("-------------------------");
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();


            if(menuOpt.equalsIgnoreCase("1")) {

                System.out.println("Add Surgery ID::");
                int id  = reader.nextInt();

                surgeryList.add(id);
                System.out.println("Added!");

            } else if(menuOpt.equalsIgnoreCase("2")){

                System.out.println("Add Patient ID::");
                int id  = reader.nextInt();

                needSerumPatientsList.add(id);
                System.out.println("Added!");

            } else if(menuOpt.equalsIgnoreCase("3")){
    
                System.out.println("Add Patient ID:");
                int id  = reader.nextInt();
    
                investigatePatientList.add(id);
                System.out.println("Added!");

            } else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +"Nurse{" +
                ", surgeryList=" + surgeryList +
                ", blockNumber=" + blockNumber +
                ", layerNumber=" + layerNumber +
                ", investigatePatientList=" + investigatePatientList +
                ", needInjectionPatientsList=" + needInjectionPatientsList +
                ", needSerumPatientsList=" + needSerumPatientsList +
                '}';
    }

}
