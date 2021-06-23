package org.cse222;
import java.util.ArrayList;
import java.util.Hashtable;

public class addUsers {
    public void addDoctors(Database databaseRef){
        Hashtable<Integer, Doctor> doctors = new Hashtable<>();

        doctors.put(11111,new Doctor("Hayri","Tas",29,'b',new Address(),11111,1,1,12));
        doctors.put(11112,new Doctor("Ali","Yilmaz",56,'b',new Address(),11112,2,1,12));
        doctors.put(11113,new Doctor("Veli","Yilmaz",55,'b',new Address(),11113,3,1,12));
        doctors.put(11114,new Doctor("Handan","Ser",43,'b',new Address(),11114,4,1,12));
        doctors.put(11115,new Doctor("Tuba","Bak",42,'b',new Address(),11115,5,1,12));
        doctors.put(11116,new Doctor("Yasemin","Serin",44,'b',new Address(),11116,6,2,12));
        doctors.put(11117,new Doctor("Asiye","Kartal",46,'b',new Address(),11117,7,2,12));
        doctors.put(11118,new Doctor("Esra","Serim",36,'b',new Address(),11118,8,2,12));
        doctors.put(11119,new Doctor("Nevra","Merik",38,'b',new Address(),11119,9,2,12));
        doctors.put(11120,new Doctor("Esranur","Soysal",35,'b',new Address(),11120,10,2,12));
        doctors.put(11121,new Doctor("Fadime","Arıcan",33,'b',new Address(),111121,12,3,12));
        doctors.put(11122,new Doctor("Fatih","Ak",32,'b',new Address(),11122,11,3,12));
        doctors.put(11123,new Doctor("Murat","Sak",31,'b',new Address(),11123,12,3,12));
        doctors.put(11124,new Doctor("Erkan","Sengul",35,'b',new Address(),11124,13,4,12));
        doctors.put(11125,new Doctor("Görkem","Ayri",46,'b',new Address(),11125,14,5,12));
        doctors.put(11126,new Doctor("Yusuf","Anıl",34,'b',new Address(),11126,15,5,12));
        doctors.put(11127,new Doctor("Ahmet","Mert",29,'b',new Address(),11127,16,5,12));
        doctors.put(11128,new Doctor("Seda","Mert",29,'b',new Address(),11128,17,5,12));

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
}
