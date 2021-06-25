import java.util.ArrayList;
import java.util.Hashtable;
import java.util.TreeMap;

public class addUsers {
    
    public void addDoctors(Database databaseRef){
        Hashtable<Integer,Doctor> doctors = new Hashtable<>();

        doctors.put(11111,new Doctor("Hayri","Tas",29,'b',new Address(),1,1,12,databaseRef));
        doctors.put(11112,new Doctor("Ali","Yilmaz",56,'b',new Address(),2,1,12,databaseRef));
        doctors.put(11113,new Doctor("Veli","Yilmaz",55,'b',new Address(),3,1,12,databaseRef));
        doctors.put(11114,new Doctor("Handan","Ser",43,'b',new Address(),4,1,12,databaseRef));
        doctors.put(11115,new Doctor("Tuba","Bak",42,'b',new Address(),5,1,12,databaseRef));
        doctors.put(11116,new Doctor("Yasemin","Serin",44,'b',new Address(),6,2,12,databaseRef));
        doctors.put(11117,new Doctor("Asiye","Kartal",46,'b',new Address(),7,2,12,databaseRef));
        doctors.put(11118,new Doctor("Esra","Serim",36,'b',new Address(),8,2,12,databaseRef));
        doctors.put(11119,new Doctor("Nevra","Merik",38,'b',new Address(),9,2,12,databaseRef));
        doctors.put(11120,new Doctor("Esranur","Soysal",35,'b',new Address(),10,2,12,databaseRef));
        doctors.put(11121,new Doctor("Fadime","Arıcan",33,'b',new Address(),12,3,12,databaseRef));
        doctors.put(11122,new Doctor("Fatih","Ak",32,'b',new Address(),11,3,12,databaseRef));
        doctors.put(11123,new Doctor("Murat","Sak",31,'b',new Address(),12,3,12,databaseRef));
        doctors.put(11124,new Doctor("Erkan","Sengul",35,'b',new Address(),13,4,12,databaseRef));
        doctors.put(11125,new Doctor("Görkem","Ayri",46,'b',new Address(),14,5,12,databaseRef));
        doctors.put(11126,new Doctor("Yusuf","Anıl",34,'b',new Address(),15,5,12,databaseRef));
        doctors.put(11127,new Doctor("Ahmet","Mert",29,'b',new Address(),16,5,12,databaseRef));
        doctors.put(11128,new Doctor("Seda","Mert",29,'b',new Address(),17,5,12,databaseRef));

        databaseRef.setDoctors(doctors);
    }

    public void addConsultant(Database database){

        ArrayList<Consultant> consultants = new ArrayList<>();
        consultants.add(new Consultant("Ayse","Alem",25,'g',new Address(),1,1,database));
        consultants.add(new Consultant("Halime","Alem",25,'g',new Address(),2,2,database));
        consultants.add(new Consultant("Servet","Ser",25,'g',new Address(),3,1,database));
        consultants.add(new Consultant("Gul","Male",25,'g',new Address(),4,1,database));

        database.setConsultants(consultants);
    }


    public void addPatients(Database database){
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ali","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Veli","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Sengul","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Amine","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Veysel","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),true,1,true,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Hasan","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("İsmail","Alem",25,'g',new Address(),true,1,false,false));
        database.getAllPatients().add(new Patient("Yakup","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),true,1,true,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Saniye","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Berkcan","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Hatice","Alem",25,'g',new Address(),true,1,false,true));
        database.getAllPatients().add(new Patient("Seyri","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Fadime","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Secda","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Gözde","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Yaren","Alem",25,'g',new Address(),true,1,false,true));
        database.getAllPatients().add(new Patient("Erkan","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Fatih","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ayhan","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),false,1,false,false));

    }

    public void addPatientRecords(Database database){
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11112));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11113));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1120)),11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1111)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11118));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11116));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11115));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1135)), 11114));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1130)), 11111));

        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1116)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1116)), 11112));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1117)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1121)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1122)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1123)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1124)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1125)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1125)), 11113));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1129)), 11111));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1125)), 11115));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1125)), 11116));
        database.getPatientRecords().add(new PatientRecord(database.getAllPatients().find(new Person(1125)), 11117));

    }

    public void addNurse(Database database){
        database.getNurses().add(new Nurse("Amine","Alem",25,'g',new Address(),1,1,database));
        database.getNurses().add(new Nurse("Ayse","Alem",25,'g',new Address(),1,1,database));
        database.getNurses().add(new Nurse("Veli","Alem",25,'g',new Address(),1,1,database));
        database.getNurses().add(new Nurse("Amine","Alem",25,'g',new Address(),1,1,database));
        database.getNurses().add(new Nurse("Gozde","Alem",27,'g',new Address(),1,1,database));
        database.getNurses().add(new Nurse("Selcuk","Alem",25,'g',new Address(),2,1,database));
        database.getNurses().add(new Nurse("Selim","Alem",25,'g',new Address(),2,1,database));
        database.getNurses().add(new Nurse("Amine","Alem",22,'g',new Address(),1,1,database));
        database.getNurses().add(new Nurse("Gerek","Alem",25,'g',new Address(),2,1,database));
        database.getNurses().add(new Nurse("Halim","Alem",27,'g',new Address(),2,1,database));
        database.getNurses().add(new Nurse("Selcuk","Alem",33,'g',new Address(),1,1,database));

    }

    public void addTech(Database database){
        database.getTechnicianWorkers().add(new TechnicianWorker(database));
        database.getTechnicianWorkers().add(new TechnicianWorker(database));
        database.getTechnicianWorkers().add(new TechnicianWorker(database));
        database.getTechnicianWorkers().add(new TechnicianWorker(database));
        database.getTechnicianWorkers().add(new TechnicianWorker(database));
        database.getTechnicianWorkers().add(new TechnicianWorker(database));
        database.getTechnicianWorkers().add(new TechnicianWorker(database));


    }
   

    public void addMedicinePharmacy(Database database){
        ArrayList<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine(1, "Parol", 0, null, 100, database));
        medicines.add(new Medicine(2, "Calpol", 0, null, 10, database));
        medicines.add(new Medicine(3, "Aspirin", 0, null, 5, database));
        medicines.add(new Medicine(4, "Majezik", 0, null, 8, database));
        medicines.add(new Medicine(5, "Dikloron", 0, null, 45, database));
        medicines.add(new Medicine(6, "Akineton", 0, null, 40, database));
        medicines.add(new Medicine(7, "Mestobran", 0, null, 3, database));
        medicines.add(new Medicine(8, "Sotarmen", 0, null, 1, database));
        medicines.add(new Medicine(9, "Metamil", 0, null, 6, database));
        medicines.add(new Medicine(10, "Flagyl", 0, null, 7, database));

        database.setMedicinePharmacy(medicines);
    }

    public void addMedicinePatient(Database database){
        ArrayList<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine(1, "Parol", 2, "Sabah Akşam Aç Karnı", 0, database));
        medicines.add(new Medicine(2, "Calpol", 3, "Günde 3 Öğün Tok Karnı", 0, database));
        medicines.add(new Medicine(3, "Aspirin", 1, "Sabahları Aç Karnı", 0, database));
        medicines.add(new Medicine(4, "Majezik", 1, "Sabah Akşam Tok Karnı", 0, database));
        medicines.add(new Medicine(5, "Dikloron", 2, "Günde 3 Öğün Aç Karnı", 0, database));
        medicines.add(new Medicine(6, "Akineton", 3, "Günde 1 Tok Karnı", 0, database));
        medicines.add(new Medicine(7, "Mestobran", 2, "Günde 1 Aç Karnı", 0, database));
        medicines.add(new Medicine(8, "Sotarmen", 1, "Sabahları Tok Karnı", 0, database));
        medicines.add(new Medicine(9, "Metamil", 2, "Akşam Tok Karnı", 0, database));
        medicines.add(new Medicine(10, "Flagyl", 1, "Akşam Aç Karnı", 0, database));

        database.setMedicinePatient(medicines);
    }
    
    

    public void addChiefPhysician(Database database){
        database.setChiefPhysician(new ChiefPhysician("Merve", "Gürler", 55, 'g', new Address(), database));
    }

    public void addAdmin(Database database){
        database.setAdmin(new Admin(database));
    }

    public void addPharmacist(Database database){
        database.setPharmacist(new Pharmacist(database));
    }
}
