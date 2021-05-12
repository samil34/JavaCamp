/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.dataAccess.abstracts;

import ecommercesimulation.entities.concretes.User;

/**
 *
 * @author samil
 */
public interface UserDao {
    void save(User user);
    User listEmil(String email);
    User CheckMailPassword(String email,String password);
}
