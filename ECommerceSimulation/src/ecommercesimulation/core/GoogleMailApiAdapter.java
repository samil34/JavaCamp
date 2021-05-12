/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.core;

import ecommercesimulation.bussiness.abstracts.MailService;
import ecommercesimulation.entities.concretes.User;
import ecommercesimulation.googleMailApi.GoogleMailManager;

/**
 *
 * @author samil
 */
public class GoogleMailApiAdapter implements MailService{

    @Override
    public boolean checkIfTrueMail(User user) {
        GoogleMailManager googleMailManager = new GoogleMailManager();
        return googleMailManager.CheckIfTrueMail(user);
    }
    
}
