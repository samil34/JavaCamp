/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermanagementsystem.Entities;

import Abstract.IEntity;
import java.time.LocalDate;
import java.util.Date;



public class Customer implements IEntity{

    
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String natioanltyId;
    
    public Customer(String firtName, String lastName, LocalDate dateOfBirth, String nationaltyId){
        this.firstName = firtName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.natioanltyId = nationaltyId;
    }
    
    
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNatioanltyId() {
        return natioanltyId;
    }

    public void setNatioanltyId(String natioanltyId) {
        this.natioanltyId = natioanltyId;
    }
    
}
