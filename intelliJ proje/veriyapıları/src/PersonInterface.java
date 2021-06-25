/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samet
 */
public interface PersonInterface {
    void setName(String name);
    void setSurName(String surName);
    void setAge(int age);
    void setGender(char gender);
    void setAddress(Address address);
    void setId(int id);
    String getName();
    String getSurName();
    int getAge();
    char getGender();
    Address getAddress();
    int getId();
}
