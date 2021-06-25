package org.cse222;

import java.util.ArrayList;

public class Patient extends Person {

    /*recete list*/
    private ArrayList<Medicine> recipeList;

    /*olmasi gereken tahliller*/
    private ArrayList<String> needAnalysis;

    /*olunan tahliller*/
    private ArrayList<String> analysisResults;

    private boolean stayHospitalOrNot;

    private int roomNumber;

    private boolean NeedInjection;

    private boolean needSerum;

    public static int idNo = 801;

   public Patient(){
        super();
        this.recipeList=new ArrayList<String>();
        this.needAnalysis=new ArrayList<String>();
        this.analysisResults=new ArrayList<String>();
        this.stayHospitalOrNot=false;
        this.NeedInjection=false;
        this.needSerum=false;
        this.roomNumber=0;
        setJobType(JobType.Patient);
        setId(idNo);
        idNo++;
    }

    public Patient(int id,Database database){
        super();
        setId(id);
    }

    public Patient(String name, String surName, int age, char gender, Address address, boolean stayHospitalOrNot, int roomNumber, boolean needSerum, boolean NeedInjection){
        super(name, surName, age, gender, address, idNo);
        this.recipeList=new ArrayList<String>();
        this.needAnalysis=new ArrayList<String>();
        this.analysisResults=new ArrayList<String>();
        this.NeedInjection=NeedInjection;
        this.needSerum=needSerum;
        this.stayHospitalOrNot=stayHospitalOrNot;
        this.roomNumber=roomNumber;
        setJobType(JobType.Patient);
        ++idNo;
    }

    public void setNeedSerum(boolean needSerum) {
        this.needSerum = needSerum;
    }

    public void setNeedInjection(boolean NeedInjection) {
        this.NeedInjection = NeedInjection;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setStayHospitalOrNot(boolean stayHospitalOrNot) {
        this.stayHospitalOrNot = stayHospitalOrNot;
    }

    public void addRecipe(Medicine newRecipe) {
        recipeList.add(newRecipe);
    }

    public void addAnalysis(String newAnalysis) {
        needAnalysis.add(newAnalysis);
    }

    public void addAnalysisResults(String newAnalysisResult) {
        analysisResults.add(newAnalysisResult);
    }

    public ArrayList<Medicine> getRecipeList() {
        return this.recipeList;
    }

    public ArrayList<String> getNeedAnalysis() {
        return this.needAnalysis;
    }

    public ArrayList<String> getAnalysisResults() {
        return this.analysisResults;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public boolean getStayHospitalOrNot() {
        return this.stayHospitalOrNot;
    }

    public boolean getNeedSerum() {
        return this.needSerum;
    }

    public boolean getNeedInjection() {
        return this.NeedInjection;
    }
}
