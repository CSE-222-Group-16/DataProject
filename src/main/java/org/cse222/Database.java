import java.util.ArrayList;

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
    private ArrayList<Doctor> doctors;

    /**
     * Needed objects will be added.
     */
    public Database(){
        doctors = new ArrayList<>();
    }

    public ArrayList<Integer> searchByNameAndSurname(String name, String surname){
        ArrayList<Integer> foundDoctors = new ArrayList<>();

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getName().equals(name)
            && doctors.get(i).getSurName().equals(surname)){
                foundDoctors.add(i);
            }
        }

        return foundDoctors;
    }


    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
}
