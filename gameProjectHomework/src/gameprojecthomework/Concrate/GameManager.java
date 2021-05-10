/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Concrate;

import gameprojecthomework.Abstract.GameService;
import gameprojecthomework.Entities.Game;

/**
 *
 * @author samil
 */
public class GameManager implements GameService{

    @Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu markete eklenmiştir.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu güncellenmiþtir.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu marketten kaldırılmıştır.");
	}

	@Override
	public void addMultiple(Game[] games) {
		for(Game game:games) {
			System.out.println(game.getGameName() + " oyunu markete eklenmiştir.");
		}
	}
    
}
