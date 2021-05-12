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
public interface MailService {
    boolean checkIfTrueMail(User user);
}
