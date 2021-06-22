package org.cse222;

import java.util.List;

/**
 *
 * @author Samet
 */
public class Person implements PersonInterface{

    /**
     * person name
     */
    protected String name;

    /**
     * this is unique id for person
     */
    protected int id;

    /**
     * person surname
     */
    protected String surName;

    /**
     * person age
     */
    protected int age;

    /**
     * person gender like male or female
     */
    protected char gender;

    /**
     * person address
     */
    protected Address address;

    protected boolean dayOff;

    /**
     * no parameter constructor
     */
     
    public Person(){
        this.name = null;
        this.surName = null;
        this.age = 0;
        this.gender = 'u';
        this.address = null;
        this.id=0;
    }

    /**
     *
     * @param name person name
     * @param surName person surname
     * @param age person age
     * @param gender person gender like male or female
     * @param address person address
     */
    public Person(String name, String surName, int age, char gender, Address address, int id){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.id=id;
        this.address = new Address();
        this.address.setCountry(address.getCountry());
        this.address.setCity(address.getCity());
        this.address.setDistrict(address.getDistrict());
        this.address.setStreet(address.getStreet());
        this.address.setNumber(address.getNumber());
    }

     public void setDayOff(boolean dayOff) {
        this.dayOff = dayOff;
    }

    public boolean getDayOff(){
        return this.dayOff;
    }

    /**
     *
     * @param name new person name
     */
    @Override
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @param surName new person surname
     */
    @Override
    public void setSurName(String surName){
        this.surName = surName;
    }

    /**
     *
     * @param age new person age
     */
    @Override
    public void setAge(int age){
        this.age = age;
    }

    /**
     *
     * @param gender new person gender
     */
    @Override
    public void setGender(char gender){
        this.gender = gender;
    }

    /**
     *
     * @param address new person address
     */
    @Override
    public void setAddress(Address address){
        this.address = new Address();
        this.address.setCountry(address.getCountry());
        this.address.setCity(address.getCity());
        this.address.setDistrict(address.getDistrict());
        this.address.setStreet(address.getStreet());
        this.address.setNumber(address.getNumber());
    }

    /**
     *
     * @param id this is uniqu id for person
     */
    @Override
    public void setId(int id){
        this.id=id;

    }


    /**
     *
     * @return person name
     */
    @Override
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return person surname
     */
    @Override
    public String getSurName(){
        return this.surName;
    }

    /**
     *
     * @return person age
     */
    @Override
    public int getAge(){
        return this.age;
    }

    /**
     *
     * @return person gender
     */
    @Override
    public char getGender(){
        return this.gender;
    }

    /**
     *
     * @return person address
     */
    @Override
    public Address getAddress(){
        return this.address;
    }

    /**
     *
     * @return id
     */
    @Override
    public int getId(){return this.id;}

}
