

import java.util.*;

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
    
    private SkipList<PatientRecord> patientRecords;
    
    private AVLTree<Person> allPatients ;
    
    private PriorityQueue<Patient> emergencyPatients;
    
    private AVLTree<Person> allUsers;
    
    private ArrayList<Nurse> nurses;
    
    private ChiefPhysician chiefPhysician;
    
    private ArrayList<TechnicianWorker> technicianWorkers;

    private Admin admin;

    private Pharmacist pharmacist;

    
    /**
     * Needed objects will be added.
     */
    public Database(){
        doctors = new Hashtable<>();
        consultants = new ArrayList<>();
        medicinePatient = new ArrayList<>();
        medicinePharmacy = new ArrayList<>();
        patientRecords = new SkipList<>();
        allPatients = new AVLTree<>();     
        emergencyPatients = new PriorityQueue<>();
        floors = new ArrayList<>();
        allUsers = new AVLTree<>();
        nurses = new ArrayList<>();
        chiefPhysician = new ChiefPhysician();
        technicianWorkers = new ArrayList<>();

        floors.add(1); floors.add(2); floors.add(3);floors.add(4);floors.add(4);
        Block[] blocks = new Block[]{new Block (1,floors),new Block (2,floors),new Block (3,floors)};
        blockStructureGraph = new AdjacencyListMatrix<> (3,false,blocks);
    }

    public void setChiefPhysician(ChiefPhysician chiefPhysician){
        this.chiefPhysician = chiefPhysician;
    }

    public ChiefPhysician getChiefPhysician(){
        return this.chiefPhysician;
    }

    public Hashtable<Integer, Doctor> getDoctors() {
        return doctors;
    }
    
    public void setDoctors(Hashtable<Integer, Doctor> doctors) {
        this.doctors = doctors;
    }
    
    /**
     * Prints all users.
     */
    public void printAll() {

        System.out.println("Doctors:");
        for (Map.Entry mapElement : doctors.entrySet()) {
            Doctor doc = ((Doctor)mapElement.getValue());
            System.out.println(doc.getFullname());
        }
        System.out.println();

        System.out.println("Consultants: ");
        for (int i = 0; i < this.consultants.size(); i++) {
            System.out.println(this.consultants.get(i).getFullname());
        }
        System.out.println();


    }

    /**
     * Adds all user in a one Person List
     */
    public void allUsersP(){
         //Doctor Added
        ArrayList<Person> doctors = new ArrayList<>(getDoctors().values());
        for (Person doctor : doctors) {
            allUsers.add(doctor);
        }

        //Consultant Added
        for (Person consultant : getConsultants()) {
            allUsers.add(consultant);
        }

        //Nurses added
        for (Nurse nurs : nurses) {
            allUsers.add(nurs);
        }
        
        //TechWorker added
        for (TechnicianWorker technicianWorker : technicianWorkers) {
            allUsers.add(technicianWorker);
        }
        
        //Chief P. added
        allUsers.add(chiefPhysician);

        //Admin
        allUsers.add(admin);

        //Pharmacist add
        allUsers.add(pharmacist);
        
        System.out.println(allUsers.getSize());

    }

    /**
     * Searches by names in doctor.
     * @param name
     * @param surname
     * @return
     */
    public TreeMap<Integer, Doctor> searchByNameAndSurname(String name, String surname){
        TreeMap<Integer, Doctor> foundDoctors = new TreeMap<>();

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getName().equals(name)
            && doctors.get(i).getSurName().equals(surname)){
                foundDoctors.put(i,doctors.get(i));
            }
        }

        return foundDoctors;
    }
    
    /**
     * Finds given nurse
     * @param nurse
     * @return
     */
    public Nurse findNurse(Nurse nurse){
        for (int i = 0; i < nurses.size(); i++) {
            if (nurse.getId() == nurses.get(i).getId())
                return nurses.get(i);
        }
        return null;
    }
    
    /**
     * Finds patient by only name.
     * @param name
     * @return
     */
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

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }

    public PriorityQueue<Patient> getEmergencyPatients() {
        return emergencyPatients;
    }

    public void setEmergencyPatients(PriorityQueue<Patient> emergencyPatients) {
        this.emergencyPatients = emergencyPatients;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ArrayList<TechnicianWorker> getTechnicianWorkers() {
        return technicianWorkers;
    }

    public void setTechnicianWorkers(ArrayList<TechnicianWorker> technicianWorkers) {
        this.technicianWorkers = technicianWorkers;
    }
    
    public AVLTree<Person> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(AVLTree<Person> allUsers) {
        this.allUsers = allUsers;
    }

    public GraphADT<Block> getBlockStructureGraph() {
        return blockStructureGraph;
    }

    public void setBlockStructureGraph(GraphADT<Block> blockStructureGraph) {
        this.blockStructureGraph = blockStructureGraph;
    }

    public ArrayList<Integer> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Integer> floors) {
        this.floors = floors;
    }

    public SkipList<PatientRecord> getPatientRecords() {
        return patientRecords;
    }

    public void setPatientRecords(SkipList<PatientRecord> patientRecords) {
        this.patientRecords = patientRecords;
    }

    public AVLTree<Person> getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(AVLTree<Person> allPatients) {
        this.allPatients = allPatients;
    }
    
    public ArrayList<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(ArrayList<Nurse> nurses) {
        this.nurses = nurses;
    }
    
    public void createGraph(int blockNo,ArrayList<Integer> floor){
        blockStructureGraph.setVertex (new Block (blockNo),new Block (blockNo,floor));
    }
    
    public Person findUser(Person person){
        return allUsers.find(person);
    }
    
    public Person findPatient(Person patient){
        return allPatients.find(patient);
    }

    public void printHospital(){
        Object[] blocks = blockStructureGraph.dfs ();
        for (Object block : blocks) {
            System.out.println (block);
        }
    }

}
