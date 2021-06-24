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
    
    
    public void addPatients(Database database){
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1111,false,1,false,false));
        database.getAllPatients().add(new Patient("Ali","Alem",25,'g',new Address(),1112,false,1,false,false));
        database.getAllPatients().add(new Patient("Veli","Alem",25,'g',new Address(),1113,false,1,false,false));
        database.getAllPatients().add(new Patient("Sengul","Alem",25,'g',new Address(),1114,false,1,false,false));
        database.getAllPatients().add(new Patient("Amine","Alem",25,'g',new Address(),1115,false,1,false,false));
        database.getAllPatients().add(new Patient("Veysel","Alem",25,'g',new Address(),1116,false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1117,true,1,true,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1118,false,1,false,false));
        database.getAllPatients().add(new Patient("Hasan","Alem",25,'g',new Address(),1119,false,1,false,false));
        database.getAllPatients().add(new Patient("İsmail","Alem",25,'g',new Address(),1120,true,1,false,false));
        database.getAllPatients().add(new Patient("Yakup","Alem",25,'g',new Address(),1121,false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1122,true,1,true,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1123,false,1,false,false));
        database.getAllPatients().add(new Patient("Saniye","Alem",25,'g',new Address(),1124,false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1125,false,1,false,false));
        database.getAllPatients().add(new Patient("Berkcan","Alem",25,'g',new Address(),1126,false,1,false,false));
        database.getAllPatients().add(new Patient("Hatice","Alem",25,'g',new Address(),1127,true,1,false,true));
        database.getAllPatients().add(new Patient("Seyri","Alem",25,'g',new Address(),1128,false,1,false,false));
        database.getAllPatients().add(new Patient("Fadime","Alem",25,'g',new Address(),1129,false,1,false,false));
        database.getAllPatients().add(new Patient("Secda","Alem",25,'g',new Address(),1130,false,1,false,false));
        database.getAllPatients().add(new Patient("Gözde","Alem",25,'g',new Address(),1131,false,1,false,false));
        database.getAllPatients().add(new Patient("Yaren","Alem",25,'g',new Address(),1132,true,1,false,true));
        database.getAllPatients().add(new Patient("Erkan","Alem",25,'g',new Address(),1133,false,1,false,false));
        database.getAllPatients().add(new Patient("Fatih","Alem",25,'g',new Address(),1134,false,1,false,false));
        database.getAllPatients().add(new Patient("Ayhan","Alem",25,'g',new Address(),1135,false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1136,false,1,false,false));
        database.getAllPatients().add(new Patient("Ayse","Alem",25,'g',new Address(),1137,false,1,false,false));

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
}
