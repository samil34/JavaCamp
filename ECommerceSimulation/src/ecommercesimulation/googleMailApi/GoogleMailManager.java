/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.googleMailApi;

import ecommercesimulation.entities.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author samil
 */
public class GoogleMailManager {
    public boolean CheckIfTrueMail(User user){
        Pattern pattern = Pattern.compile("@gmail.com",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getEmail());
        return matcher.find();
    }
}
