package org.cse222;

import java.util.ArrayList;

public class Block {

    private int blockNumber;

    private ArrayList<Integer> floorIdList;


    public Block(){

        this.blockNumber=0;

        this.floorIdList = new ArrayList<Integer>();
    }

    public Block(int blockNumber, ArrayList<Integer> floorIdList){

        this.blockNumber=blockNumber;

        this.floorIdList = floorIdList;
    }

    public int getBlockNumber(){
        return blockNumber;
    }

    public int setBlockNumber(int newBlockNumber){
        this.blockNumber = blockNumber;

        return blockNumber;
    }
    public ArrayList<Integer> getFloorList(){
        return floorIdList;
    }
}
