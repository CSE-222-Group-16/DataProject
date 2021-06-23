package org.cse222;

public class ChiefPhysician extends Person {

    private Database databaseRef;

    public ChiefPhysician(){
        super();
    }

    public ChiefPhysician(String name, String surName, int age, char gender, Address address, int id, Database database){
        super(name, surName, age, gender, address, id);
        databaseRef = database;
    }

    public ChiefPhysician(Database database){
        databaseRef = database;
    }

    public boolean confirmOperation(Operation newOp){

        return true;
    }
    public boolean rejectOperation(Operation newOp){

        return false;
    }
    public boolean confirmDayOffFor(Person newPreson){

        return true;
    }
    public boolean rejectDayOffForDoctor(Person newPreson){

        return false;
    }

}
