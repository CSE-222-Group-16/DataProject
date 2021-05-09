package org.cse222;

import java.util.ArrayList;

public class Floor {

    private int blockNumber;

    private int floorNumber;

    private ArrayList<Integer> nursesId;

    private ArrayList<Integer> officeIdList;

    private int consultantId;

    public Floor(){
        this.blockNumber=0;

        this.floorNumber=0;

        this.nursesId = new ArrayList<Integer>();

        this.officeIdList = new ArrayList<Integer>();

        this.consultantId=0;
    }

    public Floor(int blockNumber, int floorNumber, ArrayList<Integer> nursesId, ArrayList<Integer> officeIdList, int consultantId){

        this.blockNumber=blockNumber;

        this.floorNumber = floorNumber;

        this.nursesId=nursesId;

        this.officeIdList=officeIdList;

        this.consultantId=consultantId;
    }

    //SETTER AND GETTER ADD


}
