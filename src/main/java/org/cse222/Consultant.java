package org.cse222;

import java.util.ArrayList;

public class Consultant extends Person {

    private int blockNumber;

    private int layerNumber;


    public Consultant(){
        super();
        this.blockNumber=0;
        this.layerNumber=0;
    }

    public Consultant(String name, String surName, int age, char gender, Address address, int id, int blockNumber, int layerNumber){
        super(name, surName, age, gender, address, id);
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
    }
    public void patientRegistration(ArrayList<Doctor> newDoctor){
        
        //coming patient informations will add into the database 
    }

    public void patientRegistration(Patient newPatient,ArrayList<Doctor> newDoctor){
        
        //coming patient informations will add into the database
    }


}
