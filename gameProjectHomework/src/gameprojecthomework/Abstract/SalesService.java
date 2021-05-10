/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Abstract;

import gameprojecthomework.Entities.Discount;
import gameprojecthomework.Entities.Game;
import gameprojecthomework.Entities.User;

/**
 *
 * @author samil
 */
public interface SalesService {
    void sale(Game[] games, User user, Discount discount);
    void addToList(Game[] gamess, User user);
}
