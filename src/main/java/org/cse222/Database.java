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

    private ArrayList<Consultant> consultants;

    private ArrayList<Medicine> medicinePharmacy;

    private ArrayList<Medicine> medicinePatient;
    
    private GraphADT<Block> blockStructureGraph;
    
    private ArrayList<Integer> floors;

    /**
     *     All Users List
     */
    private ArrayList<Person> allUsers;

    /**
     * Needed objects will be added.
     */
    public Database(){
        doctors = new Hashtable<>();
        consultants = new ArrayList<>();
        medicinePatient = new ArrayList<>();
        medicinePharmacy = new ArrayList<>();
        allUsers = new ArrayList<>();
        
        floors = new ArrayList<>();
        floors.add(1); floors.add(2); floors.add(3);floors.add(4);floors.add(4);
        Block[] blocks = new Block[]{new Block (1,floors),new Block (2,floors),new Block (3,floors)};
        blockStructureGraph = new AdjacencyListMatrix<> (3,false,blocks);
    }

    /**
     * Adds all user in a one Person List
     */
    public void allUsersP(){
        allUsers.addAll(doctors.values());
        allUsers.addAll(consultants);
        System.out.println(allUsers.get(allUsers.size()-1).getJobType());

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
    
    public Patient getPatientByName(String name){
        for(Integer d: doctors.keySet())
            for(Patient ret:doctors.get(d).getPatientList())
                if(ret.getName().equals(name))
                    return ret;
        return null;
    }
    
    public Person findUser(int id){
        return allUsers.find(new Person(id));
    }

    public ArrayList<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(ArrayList<Consultant> consultants) {
        this.consultants = consultants;
    }

    public ArrayList<Medicine> getMedicinePharmacy(){
        return medicinePharmacy;
    }

    public void setMedicinePharmacy(ArrayList<Medicine> medicines){
        this.medicinePharmacy = medicines;
    }

    public ArrayList<Medicine> getMedicinePatient(){
        return medicinePatient;
    }

    public void setMedicinePatient(ArrayList<Medicine> medicines){
        this.medicinePatient = medicines;
    }
    
    public void createGraph(int blockNo,ArrayList<Integer> floor){
        blockStructureGraph.setVertex (new Block (blockNo),new Block (blockNo,floor));
    }

    public void printHospital(){
        Object[] blocks = blockStructureGraph.dfs ();
        for (Object block : blocks) {
            System.out.println (block);
        }
    }

}
