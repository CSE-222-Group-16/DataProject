package org.cse222;

import java.util.ArrayList;

public class Pharmacist extends Person {

    public Pharmacist(){
        super();
    }

    public Pharmacist(String name, String surName, int age, char gender, Address address, int id){
        super(name, surName, age, gender, address, id);
    }



    public boolean seePrescription(ArrayList<String> recipeList){

        return true;
    }



    public void updateStocks(){

    }
}
