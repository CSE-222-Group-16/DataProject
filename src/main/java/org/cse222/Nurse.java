package org.cse222;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Nurse extends Person {

    /**
     * this list for nurse surgery list in a day
     */
    private ArrayList<Integer> surgeryList;

    private int blockNumber;

    private int layerNumber;

    private ArrayList<Integer> investigatePatientList;

    private ArrayList<Integer> needInjectionPatientsList;

    private ArrayList<Integer> needSerumPatientsList;




    public Nurse(){
        super();
        this.surgeryList = new ArrayList<Integer>();
        this.investigatePatientList = new ArrayList<Integer>();
        this.needInjectionPatientsList = new ArrayList<Integer>();
        this.needSerumPatientsList = new ArrayList<Integer>();
        this.blockNumber=0;
        this.layerNumber=0;
    }

    public Nurse(String name, String surName, int age, char gender, Address address, int id, int blockNumber, int layerNumber){
        super(name, surName, age, gender, address, id);
        this.surgeryList = new ArrayList<Integer>();
        this.investigatePatientList = new ArrayList<Integer>();
        this.needInjectionPatientsList = new ArrayList<Integer>();
        this.needSerumPatientsList = new ArrayList<Integer>();
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
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

    public void giveInjectionToPatient(Hashtable<Integer,Patient> ptList){

        for (Map.Entry mapElement : ptList.entrySet()) {

            Patient value = ((Patient)mapElement.getValue());
            if(value.getNeedInjection()){
                value.setNeedInjection(false);
            }

        }

    }

    /**
     * look needSerumPatientsList and give serum all need patient
     */
    public void giveSerumToPatient(Hashtable<Integer,Patient> ptList){

        for (Map.Entry mapElement : ptList.entrySet()) {

            Patient value = ((Patient)mapElement.getValue());
            if(value.getNeedSerum()){
                value.setNeedSerum(false);
            }

        }

    }

    /**
     * look needInjectionPatientsList and do vaccinate all need patient
     */
    public void injection(){

    }

}
