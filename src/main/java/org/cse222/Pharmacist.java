package org.cse222;

import java.util.ArrayList;

public class Pharmacist extends Person {

    private Database databaseRef;

    private String name;

    private String surname;

    private int age;

    private char gender;

    private Address address;

    private Database database;

    private JobType jobType;

    private ArrayList<Medicine> recipeList;

    private ArrayList<Medicine> medicines;

    public Pharmacist(Database database) {
        super();
        this.name = null;
        this.surname = null;
        this.age = 0;
        this.gender = 'u';
        this.address = null;
        this.setJobType(JobType.Pharmacist);
        this.recipeList = new ArrayList<>();
        this.medicines = new ArrayList<>();
        databaseRef = database;
    }

    public Pharmacist(String name, String surname, int age, char gender, Address address, int id, Database database) {
        super(name, surname, age, gender, address, id);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.setJobType(JobType.Pharmacist);
        databaseRef = database;
    }

    public void seePrescription(ArrayList<Medicine> recipeList) {
        for (int i = 0; i < recipeList.size(); i++) {
            for (int j = 0; j < medicines.size(); j++) {
                if (medicines.get(j).equals(recipeList.get(i))) {
                    medicines.get(j).setStock(medicines.get(j).getStock() - recipeList.get(i).getTakeCount());
                }
            }
        }
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public void updateStocks(ArrayList<Medicine> newMedicines) {
        for(int i = 0; i < newMedicines.size(); i++){
            for (int j = 0; j < medicines.size(); j++) {
                if (medicines.get(j).equals(newMedicines.get(i))) {
                    medicines.get(j).setStock(newMedicines.get(j).getStock() + medicines.get(i).getStock());
                }
            }
        }
    }
}
