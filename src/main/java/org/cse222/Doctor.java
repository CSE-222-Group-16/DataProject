package org.cse222;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Doctor extends Person{


    private boolean dayOff;
    /**
     * this is office number or name for working who doctor
     */
    private int officeNumber;

    /**
     * this value for doctor investigating who patient
     */
    private int investigatePatient;

    /**
     * this list for doctor surgery list in a day
     */
    private ArrayList<Integer> surgeryList;

    /**
     * this is doctor working this day or not
     */
    private Queue<Patient> patientList;

    private int blockNumber;

    private int layerNumber;


    public Doctor(){
        super();
        this.officeNumber=0;
        this.investigatePatient=0;
        this.surgeryList = null;
        this.dayOff=false;
        this.blockNumber=0;
        this.layerNumber=0;
        patientList = new LinkedList<>();
    }


    public Doctor(String name, String surName, int age, char gender, Address address, int id, int officeName,int blockNumber, int layerNumber){
        super(name, surName, age, gender, address, id);
        this.officeNumber=officeName;
        this.investigatePatient=0;
        this.surgeryList = null;
        this.dayOff=false;
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
    }

    public void setOfficeNumber(int officeNumber){
        this.officeNumber=officeNumber;
    }

    public void setBlockNumber(int blockNumber){
        this.blockNumber=blockNumber;
    }

    public void setLayerNumber(int layerNumber){
        this.layerNumber=layerNumber;
    }

    public void treatNextPatient(int nextPatientId){
        this.investigatePatient=nextPatientId;
    }

    public void makeRecipe(Patient patient, ArrayList<String> recipeList){

        for(int i=0;i<recipeList.size();++i){
            patient.addRecipe(recipeList.get(i));
        }
    }

    public void makeAnalysis(Patient patient, ArrayList<String> analysisList){
        for(int i=0;i<analysisList.size();++i){
            patient.addAnalysis(analysisList.get(i));
        }
    }

    public ArrayList<String> seeTestResults(Patient patient){
        return patient.getAnalysisResults();
    }

    public void addSurgery(Operation op){
        this.surgeryList.add(op.getId());
    }

    public boolean getDayOff() {
        return dayOff;
    }

    @Override
    public void setDayOff(boolean dayOff) {
        this.dayOff = dayOff;
    }

    public int getBlockNumber(){
        return this.blockNumber;
    }

    public int getLayerNumber(){
        return this.layerNumber;
    }

    public int getOfficeNumber(){
        return this.officeNumber;
    }

    public int getCurrentPatient(){
        return this.investigatePatient;
    }

    public Queue<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(Queue<Patient> patientList) {
        this.patientList = patientList;
    }

    /**
     * empty right now it will assign day of value
     */
    public void requestDayOff(){
        this.dayOff = true;
    }

    public static void main(String args[]){
        Doctor doctor = new Doctor();

        doctor.requestDayOff();
    }
}
