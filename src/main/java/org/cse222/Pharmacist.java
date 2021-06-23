package org.cse222;

import java.util.ArrayList;

public class Pharmacist extends Person {

    private Database databaseRef;

    public Pharmacist(){
        super();
    }

    public Pharmacist(String name, String surName, int age, char gender, Address address, int id, Database database){
        super(name, surName, age, gender, address, id);
        databaseRef = database;
    }

    public Pharmacist(Database database){
        databaseRef = database;
    }

    public boolean seePrescription(ArrayList<String> recipeList){

        return true;
    }



    public void updateStocks(){

    }
}
