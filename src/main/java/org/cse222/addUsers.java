package org.cse222;
import java.util.ArrayList;
import java.util.Hashtable;

public class addUsers {
    public void addDoctors(Database databaseRef){
        Hashtable<Integer, Doctor> doctors = new Hashtable<>();

        doctors.put(11111,new Doctor("Hayri","Tas",29,'b',new Address(),11111,1,1,12,databaseRef));
        doctors.put(11112,new Doctor("Ali","Yilmaz",56,'b',new Address(),11112,2,1,12,databaseRef));
        doctors.put(11113,new Doctor("Veli","Yilmaz",55,'b',new Address(),11113,3,1,12,databaseRef));
        doctors.put(11114,new Doctor("Handan","Ser",43,'b',new Address(),11114,4,1,12,databaseRef));
        doctors.put(11115,new Doctor("Tuba","Bak",42,'b',new Address(),11115,5,1,12,databaseRef));
        doctors.put(11116,new Doctor("Yasemin","Serin",44,'b',new Address(),11116,6,2,12,databaseRef));
        doctors.put(11117,new Doctor("Asiye","Kartal",46,'b',new Address(),11117,7,2,12,databaseRef));
        doctors.put(11118,new Doctor("Esra","Serim",36,'b',new Address(),11118,8,2,12,databaseRef));
        doctors.put(11119,new Doctor("Nevra","Merik",38,'b',new Address(),11119,9,2,12,databaseRef));
        doctors.put(11120,new Doctor("Esranur","Soysal",35,'b',new Address(),11120,10,2,12,databaseRef));
        doctors.put(11121,new Doctor("Fadime","Arıcan",33,'b',new Address(),111121,12,3,12,databaseRef));
        doctors.put(11122,new Doctor("Fatih","Ak",32,'b',new Address(),11122,11,3,12,databaseRef));
        doctors.put(11123,new Doctor("Murat","Sak",31,'b',new Address(),11123,12,3,12,databaseRef));
        doctors.put(11124,new Doctor("Erkan","Sengul",35,'b',new Address(),11124,13,4,12,databaseRef));
        doctors.put(11125,new Doctor("Görkem","Ayri",46,'b',new Address(),11125,14,5,12,databaseRef));
        doctors.put(11126,new Doctor("Yusuf","Anıl",34,'b',new Address(),11126,15,5,12,databaseRef));
        doctors.put(11127,new Doctor("Ahmet","Mert",29,'b',new Address(),11127,16,5,12,databaseRef));
        doctors.put(11128,new Doctor("Seda","Mert",29,'b',new Address(),11128,17,5,12,databaseRef));

        databaseRef.setDoctors(doctors);
    }

    public void addConsultant(Database database){

        ArrayList<Consultant> consultants = new ArrayList<>();
        consultants.add(new Consultant("Ayse","Alem",25,'g',new Address(),1111,1,1,database));
        consultants.add(new Consultant("Halime","Alem",25,'g',new Address(),1112,2,2,database));
        consultants.add(new Consultant("Servet","Ser",25,'g',new Address(),1113,3,1,database));
        consultants.add(new Consultant("Gul","Male",25,'g',new Address(),1114,4,1,database));

        database.setConsultants(consultants);
    }

    /**
     * For pharmacist and pharmacy
     * @param databaseRef
     */
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

    /**
     * For Patient
     * @param databaseRef
     */
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
}
