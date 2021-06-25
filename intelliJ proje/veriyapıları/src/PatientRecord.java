import java.util.Objects;

public class PatientRecord implements Comparable<PatientRecord>{

    /**
     * Id of the doctor that treats
     * patient
     */
    private int doctorId;

    static int recordId = 0;

    private int id;

    private String date = null;

    private Patient patient;


    public PatientRecord(){
        patient = new Patient();
        ++recordId;
        id = recordId;
    }

    public PatientRecord(int doctorId){
        patient = new Patient();
        this.doctorId = doctorId;
        ++recordId;
        id = recordId;
    }

    public PatientRecord(Patient patient, int doctorId){
        this.patient = patient;
        this.doctorId = doctorId;
        ++recordId;
        id = recordId;

    }

    public PatientRecord(Patient patient, int doctorId, String date){
        this.patient = patient;
        this.doctorId = doctorId;
        ++recordId;
        id = recordId;
        this.date = date;
    }

    public PatientRecord(Person person, int doctorId) {

    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public static int getRecordId() {
        return recordId;
    }

    public static void setRecordId(int recordId) {
        PatientRecord.recordId = recordId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public int compareTo(PatientRecord o) {
        return this.id - o.getId();
    }

    @Override
    public String toString() {
        int k;
        StringBuilder stringBuilder = new StringBuilder ();
        for ( k = 0; k < 45; k++) stringBuilder.append ("-");
        stringBuilder.append ("\n");
        stringBuilder.append ("PatientRecord No: "+id+"\n");
        stringBuilder.append ("Patient ID: " + patient.getId()+"\n");
        stringBuilder.append ("Patient Name: " + patient.getName()+" "+ patient.getSurName() +"\n");
        stringBuilder.append ("Doctor ID: " + patient.getId()+"\n");
        if (date != null){
            stringBuilder.append ("Date: " + date+"\n");
        } else {
            stringBuilder.append ("Date: NO INFO \n");
        }
        stringBuilder.append ("\n");
        for ( k = 0; k < 45; k++) stringBuilder.append ("-");
        stringBuilder.append ("\n");
        return stringBuilder.toString ();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientRecord that = (PatientRecord) o;
        return doctorId == that.doctorId && Objects.equals(patient, that.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, patient);
    }
}
