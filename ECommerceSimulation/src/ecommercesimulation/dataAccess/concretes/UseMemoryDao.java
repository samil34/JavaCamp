/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.dataAccess.concretes;

import ecommercesimulation.dataAccess.abstracts.UserDao;
import ecommercesimulation.entities.concretes.User;
import java.util.ArrayList;

/**
 *
 * @author samil
 */
public class UseMemoryDao implements UserDao{

    ArrayList<User> users = new ArrayList<User>();
    
    @Override
    public void save(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcı veritabanına eklendi");
                
    }

    @Override
    public User listEmil(String email) {
        for(User user : users) {
            if(user.getEmail() == email)
                return user;
        }
        return null;
    }

    @Override
    public User CheckMailPassword(String email, String password) {
        for(User user : users) {
                if(user.getEmail() == email && user.getPassword() == password)
                        return user;
            }
            return null;
    }
    
}
