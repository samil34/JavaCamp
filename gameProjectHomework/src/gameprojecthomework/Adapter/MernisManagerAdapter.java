/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Adapter;

import gameprojecthomework.Abstract.UserCheckService;
import gameprojecthomework.Entities.User;

/**
 *
 * @author samil
 */
public class MernisManagerAdapter implements UserCheckService{

    @Override
    public boolean ChechIfRealPerson(User user) {
        //Mernis TC doğrulaması yapılır
        return true;
    }
    
}
