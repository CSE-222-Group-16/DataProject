import java.lang.reflect.Parameter;
import java.util.*;

/**
 * Treats patients.
 */
public class Doctor extends Person {

    private int countHolidayDays;

    private boolean dayOff;
    /**
     * this is office number or name for working who doctor
     */
    private int officeNumber;

    /**
     * this value for doctor investigating who patient
     */
    private int investigatePatient;

    /**
     * this list for doctor surgery list in a day
     */
    private ArrayList<Integer> surgeryList;

    /**
     * this is doctor working this day or not
     */
    private Queue<Patient> patientList;

    private int blockNumber;

    private int layerNumber;

    public static int idNo =201;


    Database databaseRef;
    public Doctor(Database database){
        super();
        this.officeNumber=0;
        this.surgeryList = null;
        this.dayOff=false;
        this.blockNumber=0;
        this.layerNumber=0;
        patientList = new LinkedList<>();
        this.surgeryList = new ArrayList<>();

        databaseRef = database;
        this.setJobType(JobType.Doctor);
        setId(idNo);
        ++idNo;
    }

    public Doctor(int id, Database database){
        super();
        this.officeNumber=0;
        this.surgeryList = new ArrayList<>();
        this.dayOff=false;
        this.blockNumber=0;
        this.layerNumber=0;
        patientList = new LinkedList<>();
        databaseRef = database;
        this.setJobType(JobType.Doctor);
        setId(id);
    }


    public Doctor(String name, String surName, int age, char gender, Address address,
                  int officeName,int blockNumber, int layerNumber, Database database){
        super(name, surName, age, gender, address, idNo);
        this.officeNumber=officeName;
        patientList = new LinkedList<>();
        this.surgeryList = new ArrayList<>();
        this.dayOff=false;
        this.blockNumber=blockNumber;
        this.layerNumber=layerNumber;
        this.setJobType(JobType.Doctor);
        databaseRef = database;
        ++idNo;
    }

    public Doctor(String name, String surname, int age, char gender, Address address, int id) {
        super(name, surname, age, gender, address, id);
    }

    public void setOfficeNumber(int officeNumber){
        this.officeNumber=officeNumber;
    }

    public void setBlockNumber(int blockNumber){
        this.blockNumber=blockNumber;
    }

    public void setLayerNumber(int layerNumber){
        this.layerNumber=layerNumber;
    }

    public void treatNextPatient(int id){
        databaseRef.getPatientRecords().add(new PatientRecord(databaseRef.getDoctors().get(id).patientList.poll(),id,"12-12-2002"));
    }

    public void makeRecipe(Patient patient, ArrayList<Medicine> recipeList){

        for(int i=0;i<recipeList.size();++i){
            patient.addRecipe(recipeList.get(i));
        }
    }

    /**
     * Makes analysis to the patient given
     * @param patient
     * @param analysisList
     */
    public void makeAnalysis(Patient patient, ArrayList<String> analysisList){
        for(int i=0;i<analysisList.size();++i){
            patient.addAnalysis(analysisList.get(i));
            patient.addAnalysisResults(analysisList.get(i));
        }
    }

    public ArrayList<String> seeTestResults(Patient patient){
        return patient.getAnalysisResults();
    }

    public void addSurgery(Operation op){
        this.surgeryList.add(op.getId());
    }

    public int getBlockNumber(){
        return this.blockNumber;
    }

    public int getLayerNumber(){
        return this.layerNumber;
    }

    public int getOfficeNumber(){
        return this.officeNumber;
    }

    public int getCurrentPatient(){
        return this.investigatePatient;
    }

    public Queue<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(Queue<Patient> patientList) {
        this.patientList = patientList;
    }

    public boolean getDayOff() {
        return dayOff;
    }

    @Override
    public void setDayOff(boolean dayOff) {
        this.dayOff = dayOff;
    }

    /**
     * Menu
     */
    public void DoctorMenu(){
        String menuOpt = "notBack";

        while(!menuOpt.equals("back")){
            System.out.println("-------------------------");
            System.out.println("-----Doctor Menu-----");
            System.out.println("-------------------------");
            System.out.println("--1) Treat Next Patient---");
            System.out.println("-------------------------");
            System.out.println("--2) Request Day Off---");
            System.out.println("-------------------------");
            System.out.println("--Type 'back' to quit---");
            System.out.println("-------------------------");
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();

            if(menuOpt.equalsIgnoreCase("1")) treat();
            else if(menuOpt.equalsIgnoreCase("2")) DayOff();
            else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }

    /**
     * Dayy of request
     */
    private void DayOff() {
        System.out.println("Requesting day off from chief physician...\nPlease wait!");

        this.requestDayOff();

        ChiefPhysician chiefPhysician = databaseRef.getChiefPhysician();

        chiefPhysician.ChiefPhysicianMenu(this);
    }

    /**
     * Prepare recipe
     */
    private void recipe(int id) {
        System.out.println("Preparing recipe...\nPlease wait!");

        ArrayList<Medicine> recipe = databaseRef.getMedicinePatient();

        this.makeRecipe(databaseRef.getDoctors().get(id).patientList.peek(), recipe);

        System.out.println("Recipe prepared.");
    }

    /**
     * Prepare anaylsis
     */
    private void analysis(int id) {
        System.out.println("Preparing analysis...\nPlease wait!");

        ArrayList<String> analysis = new ArrayList();
        analysis.add("add analysis");

        this.makeAnalysis(databaseRef.getDoctors().get(id).patientList.peek(), analysis);

        System.out.println("Analysis is done.");

    }

    /**
     * Perepare Test results
     */
    private void testResults(int id) {
        System.out.println("Preparing test results...\nPlease wait!");

        int count = 0;
        for(int i = 0; i < Objects.requireNonNull(databaseRef.getDoctors().get(id).patientList.peek()).getAnalysisResults().size(); i++){
            System.out.println( Objects.requireNonNull(databaseRef.getDoctors().get(id).patientList.peek()).getAnalysisResults().get(i));
            ++count;
        }

        if (count == 0){
            System.out.println("No analysis found!");
        }else {
            System.out.println("All test results printed.");
        }
    }

    /**
     * Treating sub menu, and choosing.
     */
    private void treat() {
        System.out.println("Enter doctor ID:");
        Scanner read = new Scanner(System.in);
        int doctor = read.nextInt();
        if(databaseRef.getDoctors().get(doctor).getPatientList().peek() == null){
            System.out.println("There is no patient. You can go home or have a rest.");
            return;
        }

        System.out.println("Patient list size before treat next patient: " +
                databaseRef.getDoctors().get(doctor).getPatientList().size());

        this.treatNextPatient(doctor);
        System.out.println("Patient list size after treat next patient: " +
                databaseRef.getDoctors().get(doctor).getPatientList().size());

        String menuOpt = "notBack";
        while(!menuOpt.equals("back")) {
            System.out.println("--1) Make Recipe---");
            System.out.println("-------------------------");
            System.out.println("--2) Make Analysis---");
            System.out.println("-------------------------");
            System.out.println("--3) See Test Results---");
            System.out.println("-------------------------");
            System.out.println("--Type 'back' to quit---");
            System.out.println("-------------------------");
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();

            if (menuOpt.equalsIgnoreCase("1")) recipe(doctor);
            else if (menuOpt.equalsIgnoreCase("2")) analysis(doctor);
            else if (menuOpt.equalsIgnoreCase("3")) testResults(doctor);
            else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }

        //removed patient added to the system
        databaseRef.getPatientRecords().add(new PatientRecord(this.patientList.remove(),this.getId(),"10-10-2020") );
    }

    public void requestDayOff(){
        this.dayOff = true;
    }

    public int getCountHolidayDays() {
        return countHolidayDays;
    }

    public void setCountHolidayDays(int countHolidayDays) {
        this.countHolidayDays = countHolidayDays;
    }

    @Override
    public String toString() {
        return super.toString() +" Doctor{" +
                "dayOff=" + dayOff +
                ", officeNumber=" + officeNumber +
                ", surgeryList=" + surgeryList +
                ", patientList=" + patientList +
                ", blockNumber=" + blockNumber +
                ", layerNumber=" + layerNumber +
                '}';
    }
}
