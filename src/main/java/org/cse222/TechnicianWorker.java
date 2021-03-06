package org.cse222;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnicianWorker extends Person {

    private int blockNumber;

    private int layerNumber;

    static int idNo = 601;
    private Database databaseRef;

    public TechnicianWorker(int id, Database database){
        super();
        setId(id);
        databaseRef = database;
        setJobType(JobType.TechnicianWorker);
    }

    public TechnicianWorker(Database database){
        super();
        setId(idNo);
        ++idNo;
        setJobType(JobType.TechnicianWorker);
        databaseRef = database;

    }
    
    public TechnicianWorker(String name, String surName, int age, char gender, Address address
            , int blockNumber, int layerNumber,Database database){
        super(name, surName, age, gender, address, idNo);
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
        databaseRef = database;
        ++idNo;        
        setJobType(JobType.TechnicianWorker);
    }

    public void Menu(){
        Scanner reader = new Scanner(System.in);
            String menuOpt;
            System.out.print("Welcome back ");
            char gen = getGender();
            if(gen=='g' || gen=='G') System.out.print("Mrs ");
            else if(gen=='b' || gen=='B') System.out.print("Mr ");
            else System.out.print("Their ");
            System.out.println(getName());
            do{
                System.out.println("Please select a task:(Type \"back\" to return)");
                System.out.println("1)Fill analysis results.");
                menuOpt = reader.nextLine();
                if(menuOpt.equalsIgnoreCase("back")) return;
                else if(menuOpt.equalsIgnoreCase("1")) anRes();
                else System.out.println("Unrecognized option. Try again.");
            }while(true);
        }

        void anRes(){
            Scanner reader = new Scanner(System.in);

            String patientn;
            String line;
            Patient mypat;
            do{
                //check patient
                System.out.println("Please enter patient name:");
                patientn = reader.nextLine();
                if(patientn.equalsIgnoreCase("back")) return;
                mypat = databaseRef.getPatientByNo(Integer.parseInt(patientn));
                if(mypat!=null) break;
                System.out.println("This patient doesn't exist.");
            }while (true);
            ArrayList<String>anLines = new ArrayList<String>();
            System.out.println("Fill analysis results below.");
            System.out.println("Type \"save\" to update database.");
            System.out.println("Type \"back\" to return without saving.");
            do{
                line = reader.nextLine();
                if(line.equalsIgnoreCase("save")) break;
                if(line.equalsIgnoreCase("back")) return;
                anLines.add(line);
            }while (true);
            fillAnalysisResults(mypat,anLines);
        }
    /*addAnalysisResults parametresi generate edilecek!!!! */
    public void fillAnalysisResults(Patient patient, ArrayList<String> needAnalysis){
        for(int i=0;i<needAnalysis.size();++i){
            patient.addAnalysisResults(needAnalysis.get(i));
        }
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getLayerNumber() {
        return layerNumber;
    }

    public void setLayerNumber(int layerNumber) {
        this.layerNumber = layerNumber;
    }

    @Override
    public String toString() {
        return "TechnicianWorker{" +
                "blockNumber=" + blockNumber +
                ", layerNumber=" + layerNumber +
                '}';
    }
}

