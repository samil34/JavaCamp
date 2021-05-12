/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.bussiness.abstracts;

import ecommercesimulation.entities.concretes.User;

/**
 *
 * @author samil
 */
public interface UserVerificationService {
   
    boolean checkIfEmailExist(String email);
		
    boolean checkFirstName(String firstName);
		
    boolean checkLastName(String lastName);
		
    boolean checkPassword(String password);
	
    boolean checkPerson(User user);
	
    void sendMail(String email);
	
    void verificate(User user);
	
    boolean checkEmailPassword(String email,String password);
}
