package org.cse222;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * All needed data are
 * stored here. All objects
 * have a reference to this
 * class.
 */
public class Database {
    /**
     * Doctors stored in database in
     * a ArrayList.
     */
    private Hashtable<Integer,Doctor> doctors;

    /**
     * Needed objects will be added.
     */
    public Database(){
        doctors = new Hashtable<>();
    }

    public Hashtable<Integer, Doctor> searchByNameAndSurname(String name, String surname){
        Hashtable<Integer, Doctor> foundDoctors = new Hashtable<>();

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getName().equals(name)
            && doctors.get(i).getSurName().equals(surname)){
                foundDoctors.put(i,doctors.get(i));
            }
        }

        return foundDoctors;
    }


    public Hashtable<Integer, Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Hashtable<Integer, Doctor> doctors) {
        this.doctors = doctors;
    }
}
