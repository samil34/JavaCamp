/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework3;

/**
 *
 * @author samil
 */
public class Instructor extends User {

    
    private String certificate;
    private String instructorNumber;
    
    
    public Instructor(){
        
    }
    
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
    
    
   
    
}
