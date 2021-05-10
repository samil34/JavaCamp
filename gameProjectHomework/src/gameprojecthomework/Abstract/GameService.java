/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Abstract;

import gameprojecthomework.Entities.Game;

/**
 *
 * @author samil
 */
public interface GameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    void addMultiple(Game[] game);
}
