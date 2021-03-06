

import java.util.Iterator;
import java.util.Scanner;

/**
 * There is only one chief phy. in
 * system. It is also a doctor.
 */
public class ChiefPhysician extends Person {
    private int MAX_HOLIDAY_DAY = 5;

    private int MAX_DAY_OFF = 3;

    private KWQueue<Doctor> doctors;

    private Database databaseRef;

    private int countDayOff;

    public static int idNo = 701;

    public ChiefPhysician(){
        super();
        this.doctors = new KWQueue<>();
        setJobType(JobType.ChiefPhysician);
        setId(idNo);
        ++idNo;
    }

    public ChiefPhysician(String name, String surName, int age, char gender, Address address, Database database){
        super(name, surName, age, gender, address, idNo);
        databaseRef = database;
        setJobType(JobType.ChiefPhysician);
        ++idNo;
    }

    public ChiefPhysician(Database database){
        databaseRef = database;
        setId(idNo);
        ++idNo;
        setJobType(JobType.ChiefPhysician);

    }

    /**
     * confirms given operation
     * @param newOp
     * @return
     */
    public boolean confirmOperation(Operation newOp){

        return true;
    }

    /**
     * Rejects given operation
     * @param newOp
     * @return
     */
    public boolean rejectOperation(Operation newOp){

        return false;
    }

    /**
     * Answers day off requests of the
     * doctors.
     * @param newPerson
     * @return
     */
    public boolean dayOff(Person newPerson){
        /**
         * first check if newPerson request a day off
         */

        if(newPerson.getDayOff()){
            /**
             * If requested, add doctor to queue of doctors that are in holiday now.
             */
            doctors.add((Doctor) newPerson);

            /**
             * Initialize the doctors holiday day count
             */
            ((Doctor) newPerson).setCountHolidayDays(0);

            /**
             * Update the count of doctors that are requested day off
             */
            this.countDayOff++;

            /**
             * If maximum number of doctors in holiday, wait for a doctor to come back
             */
            if(this.countDayOff < MAX_DAY_OFF)
                return true;
            else {
                /**
                 * Check doctors that are in vacation
                 */
                for(int i = 0; i < doctors.size(); i++){
                    Iterator<Doctor> iter = doctors.iterator();
                    while(iter.hasNext()){
                        Doctor doctor = iter.next();
                        /**
                         * if they achieve the maximum number of day that can be spent in holiday
                         */
                        if(doctor.getCountHolidayDays() == this.MAX_HOLIDAY_DAY){
                            /**
                             * Remove from queue and decrement the number of count that counts the doctors that are in vacation
                             * Set holiday day count of doctor to 0
                             */
                            doctor.setCountHolidayDays(0);
                            doctors.remove();
                            this.countDayOff--;
                        }
                        /**
                         * Increment holiday day count of doctor by 1
                         */
                        doctor.setCountHolidayDays(doctor.getCountHolidayDays()+1);
                    }
                }
                return false;
            }
        }
        else return false;
    }

    /**
     * Menu
     * @param person
     */
    public void ChiefPhysicianMenu(Person person){
        String menuOpt = "notBack";

        while(!menuOpt.equals("back")){
            System.out.println("-------------------------");
            System.out.println("-----Chief Physician Menu-----");
            System.out.println("-------------------------");
            System.out.println("--1) Day Off Request---");
            System.out.println("-------------------------");
            System.out.println("--Type 'back' to quit---");
            System.out.println("-------------------------");
            Scanner reader = new Scanner(System.in);

            menuOpt = reader.nextLine();

            if(menuOpt.equalsIgnoreCase("1")) DayOff(person);
            else if(menuOpt.equalsIgnoreCase("back")) break;
            else System.out.println("Unrecognized option. Try again.");
        }
    }

    /**
     * Prints dayy of agree.
     * @param person
     */
    public void DayOff(Person person){
        if(this.dayOff(this)) System.out.println("You can go travel!!!");
        else System.out.println("You can not go travel, wait for available days!!!");
    }
    
     @Override
    public JobType getJobType() {
        return JobType.ChiefPhysician;
    }
}
