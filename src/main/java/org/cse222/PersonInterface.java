package org.cse222;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samet
 */
public interface PersonInterface {
    public void setName(String name);
    public void setSurName(String surName);
    public void setAge(int age);
    public void setGender(char gender);
    public void setAddress(Address address);
    public void setId(int id);
    public String getName();
    public String getSurName();
    public int getAge();
    public char getGender();
    public Address getAddress();
    public int getId();
}
