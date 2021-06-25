
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Responsible for analysis
 * of the patients.
 */
public class TechnicianWorker extends Person {

    private int blockNumber;

    private int layerNumber;

    static int idNo = 601;
    private Database databaseRef;

    public TechnicianWorker(int id, Database database){
        super();
        setId(id);
        databaseRef = database;
        setJobType(JobType.TechnicianWorker);
    }

    public TechnicianWorker(Database database){
        super();
        setId(idNo);
        ++idNo;
        setJobType(JobType.TechnicianWorker);
        databaseRef = database;

    }

    /**
     * Menu
     */
    public void Menu(){
        Scanner reader = new Scanner(System.in);
            String menuOpt;
            System.out.print("Welcome back ");
            char gen = getGender();
            if(gen=='f' || gen=='F') System.out.print("Mrs ");
            else if(gen=='m' || gen=='M') System.out.print("Mr ");
            else System.out.print("Their ");
            System.out.println(getName());
            do{
                System.out.println("Please select a task:(Type \"back\" to return)");
                System.out.println("1)Fill analysis results.");
                menuOpt = reader.nextLine();
                if(menuOpt.equalsIgnoreCase("back")) return;
                else if(menuOpt.equalsIgnoreCase("1")) anRes();
                else System.out.println("Unrecognized option. Try again.");
            }while(true);
        }

        /**
         * Result of the analaysis is 
         * added here.
         */
        void anRes(){
            Scanner reader = new Scanner(System.in);

            String patientn = " ";
            String line;
            Patient mypat;
            do{
                //check patient
                System.out.println("Please enter patient id:");
                int id = reader.nextInt();
                System.out.println("Please enter doctor id:");
                int d_id = reader.nextInt();
                System.out.println("Result:");
                String result = reader.nextLine();
                result = reader.nextLine();

                if(patientn.equalsIgnoreCase("back")) return;

                if( databaseRef.getPatientRecords().find(new PatientRecord(new Patient(id,databaseRef),d_id))
                        ==null) {
                    System.out.println("This patient doesn't exist.");
                    break;
                }
                else {
                    databaseRef.getPatientRecords().find(new PatientRecord(new Patient(id, databaseRef), d_id))
                            .getPatient().addAnalysisResults(result);
                    System.out.println("Added Result: "+databaseRef.getPatientRecords().find(new PatientRecord(new Patient(id, databaseRef), d_id))
                            .getPatient().getAnalysisResults().get(databaseRef.getPatientRecords().find(new PatientRecord(new Patient(id, databaseRef), d_id))
                                    .getPatient().getAnalysisResults().size()-1));
                }
                System.out.println("write back to exit:");
                patientn = reader.nextLine();
            }while (true);

        }
    /*addAnalysisResults parametresi generate edilecek!!!! */
    public void fillAnalysisResults(Patient patient, ArrayList<String> needAnalysis){
        for(int i=0;i<needAnalysis.size();++i){
            patient.addAnalysisResults(needAnalysis.get(i));
        }
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getLayerNumber() {
        return layerNumber;
    }

    public void setLayerNumber(int layerNumber) {
        this.layerNumber = layerNumber;
    }

    @Override
    public String toString() {
        return "TechnicianWorker{" +
                "blockNumber=" + blockNumber +
                ", layerNumber=" + layerNumber +
                '}';
    }
}

