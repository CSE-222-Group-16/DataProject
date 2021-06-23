package org.cse222;

public class Admin extends Person {


	public Admin(){
        super();
    }

    public Admin(String name, String surName, int age, char gender, Address address, int id){
        super(name, surName, age, gender, address, id);
    }

    public void assignNurseToFloor(Nurse newNurse, int blockNumber, int floorNumber){
    	newNurse.setBlockNumber(blockNumber);
    	newNurse.setLayerNumber(floorNumber);
    	
    }

    public void assignConsultantToFloor(Consultant newConsultant, int blockNumber, int floorNumber){
    	newConsultant.setBlockNumber(blockNumber);
    	newConsultant.setLayerNumber(floorNumber);

    }

    public void assignDoctorToBlock(Doctor newDoctor, int blockNumber, int officeNumber, int floorNumber){
    	newDoctor.setBlockNumber(blockNumber);
    	newDoctor.setLayerNumber(floorNumber);
    	newDoctor.setOfficeNumber(officeNumber);
    }

    public void assignTechnicalWorkerToBlock(TechnicianWorker newTechnicianWorker, int blockNumber){
    		
    	newTechnicianWorker.setblockNumber(blockNumber);
    	
    }
    
    public void addDoctor(HashTable<> ) {
    	
    }
    


}
