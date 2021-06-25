
public class Office {

    private int blockNumber;

    private int floorNumber;

    private int doctorId;

    private int officeNumber;

    public Office(){
        blockNumber=0;

        floorNumber=0;

        doctorId=0;

        officeNumber=0;
    }

    public Office(int blockNumber, int floorNumber, int doctorId, int officeNumber){
        this.blockNumber=blockNumber;

        this.floorNumber=floorNumber;

        this.doctorId=doctorId;

        this.officeNumber=officeNumber;
    }

    public void setBlockNumber(int blockNumber){
        this.blockNumber=blockNumber;
    }

    public void setFloorNumber(int floorNumber){
        this.floorNumber=floorNumber;
    }

    public void setDoctorId(int doctorId){
        this.doctorId=doctorId;
    }

    public void setOfficeNumber(int officeNumber){
        this.officeNumber=officeNumber;
    }

    public int getBlockNumber(){
        return blockNumber;
    }

    public int getFloorNumber(){
        return floorNumber;
    }

    public int getDoctorId(){
        return doctorId;
    }

    public int getOfficeNumber(){
        return officeNumber;
    }

}
