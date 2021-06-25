
import java.util.ArrayList;

public class Operation {

    /*this is unique id for operation*/
    private Integer id;

    /*which patient join this operation*/
    private int patientId;

    /*which doctors do this operations*/
    private ArrayList<Integer> doctorsList;

    /*which nurses join this operations*/
    private ArrayList<Integer> nursesList;

    private boolean operationStatus;
    public Operation(){
        this.id=0;
        this.patientId=0;
        this.doctorsList= new ArrayList<Integer>();
        this.nursesList= new ArrayList<Integer>();
    }

    public Operation(int id, int patientId, ArrayList<Integer> doctorList, ArrayList<Integer> nursesList){
        this.id=id;
        this.patientId=patientId;
        this.doctorsList= new ArrayList<Integer>();
        this.nursesList= new ArrayList<Integer>();

        for(int i=0;i<doctorList.size();++i){
            this.doctorsList.add(doctorList.get(i));
        }

        for(int i=0;i<nursesList.size();++i){
            this.nursesList.add(nursesList.get(i));
        }
    }
    public boolean getOperationStatus(){
        return operationStatus;
    }
    public void setOperationStatus(boolean newStatus){
        this.operationStatus=newStatus;
    }
    public void addNewDoctorToTheList(Integer newDoctorId){
        doctorsList.add(newDoctorId);
    }

    public void addNewNurseToTheList(Integer newNurseId){
        nursesList.add(newNurseId);
    }

    public void assignPatientId(int patientId){
        this.patientId=patientId;
    }

    public void assignGeneretedOperationId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }

    public int getPatientId(){
        return this.patientId;
    }

    public ArrayList<Integer> getDoctorsList(){
        return this.doctorsList;
    }

    public ArrayList<Integer> getNursesList(){
        return this.nursesList;
    }
}
