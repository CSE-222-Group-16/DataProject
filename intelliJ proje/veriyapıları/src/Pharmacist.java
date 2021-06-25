
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Responsible for the medicine 
 * process of the patient.
 */
public class Pharmacist extends Person {

    private Database databaseRef;

    private JobType jobType;

    private ArrayList<Medicine> recipeList;

    private ArrayList<Medicine> medicines;

    public static int idNo = 501;

    public Pharmacist(Database database) {
        super();
        databaseRef = database;
        setJobType(JobType.Pharmacist);
        this.recipeList = new ArrayList<>();
        this.medicines = new ArrayList<>();
        setId(idNo);
        ++idNo;
    }

    public Pharmacist(String name, String surname, int age, char gender, Address address, Database database) {
        super(name, surname, age, gender, address, idNo);
        this.setJobType(JobType.Pharmacist);
        databaseRef = database;
        ++idNo;
    }

    /**
     * See prescription of the medicine
     * @param recipeList
     */
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

    /**
     * If stocks are done, updates.
     * @param newMedicines
     */
    public void updateStocks(ArrayList<Medicine> newMedicines) {
        for(int i = 0; i < newMedicines.size(); i++){
            for (int j = 0; j < medicines.size(); j++) {
                if (medicines.get(j).equals(newMedicines.get(i))) {
                    medicines.get(j).setStock(newMedicines.get(j).getStock() + medicines.get(i).getStock());
                }
            }
        }
    }

    /**
     * Used for find the cheapest product.
     * @return
     */
    public Medicine findCheapestProduct(){
        for(int i = 0; i < databaseRef.getMedicinePharmacy().size(); i++){
            for(int j = 0; j < databaseRef.getMedicinePharmacy().size()-i-1; j++){
                if(databaseRef.getMedicinePharmacy().get(j).getTakeCount() > databaseRef.getMedicinePharmacy().get(j+1).getTakeCount()){
                    // swap
                    Medicine medicine = databaseRef.getMedicinePharmacy().get(j);
                    databaseRef.getMedicinePharmacy().set(j, databaseRef.getMedicinePharmacy().get(j+1));
                    databaseRef.getMedicinePharmacy().set(j+1, medicine);
                }
            }
        }
        return databaseRef.getMedicinePharmacy().get(0);
    }

    /**
     * Menu
     */
    public void menu(){
        String menuOpt = "notBack";

        while(!menuOpt.equals("back")){
            System.out.println("-------------------------");
            System.out.println("-----Pharmacist Menu-----");
            System.out.println("-------------------------");
            System.out.println("--1) See Prescription of the Patient ---");
            System.out.println("-------------------------");
     
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();


            if(menuOpt.equalsIgnoreCase("1")) {

                System.out.println("Add Patient ID::");
                int id  = reader.nextInt();

                
                System.out.println("Added!");

            

            } else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Pharmacist{" +
                "recipeList=" + recipeList +
                ", medicines=" + medicines +
                '}';
    }
    
    @Override
    public JobType getJobType() {
        return JobType.Pharmacist;
    }
}
