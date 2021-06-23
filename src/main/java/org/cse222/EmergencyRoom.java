import java.util.PriorityQueue;

public class EmergencyRoom{
	
	private PriorityQueue<Patient> pt=null;
	private Consultant cs= null;
	
	public EmergencyRoom() {
		pt = new PriortiyQueue<Patient>();
		cs = new Consultant();
	}
	
	public PriorityQueue getPatient() {
		return pt;
	}
	
	public Consultant getConsultant() {
		return cs;
	}
	
	
}