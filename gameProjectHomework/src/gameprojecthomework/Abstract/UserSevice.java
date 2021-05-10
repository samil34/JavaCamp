/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Abstract;

import gameprojecthomework.Entities.User;

/**
 *
 * @author samil
 */
public interface UserSevice {
    void add(User user);
    void update(User user);
    void delete(User user);
}
