package org.cse222;

import java.util.ArrayList;

public class Block {

    private int blockNumber;

    private ArrayList<Integer> floorIdList;


    public Block(){

        this.blockNumber=0;

        this.floorIdList = new ArrayList<Integer>();
    }

    public Block(int blockNumber){

        this.blockNumber=blockNumber;

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
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return blockNumber == block.blockNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockNumber);
    }

    @Override
    public String toString() {
        int k;
        StringBuilder stringBuilder = new StringBuilder ();
        for ( k = 0; k < 45; k++) stringBuilder.append ("-");
        stringBuilder.append ("\n");
        stringBuilder.append ("Block Name: "+blockNumber+"\n");
        stringBuilder.append ("Floors in the Block: ");
        for (Integer floor: floorIdList) {
            stringBuilder.append (floor+",");
        }
        stringBuilder.deleteCharAt (stringBuilder.length ()-1);

        stringBuilder.append ("\n");
        for ( k = 0; k < 45; k++) stringBuilder.append ("-");
        stringBuilder.append ("\n");
        return stringBuilder.toString ();
    }
}
