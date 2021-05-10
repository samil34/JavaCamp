/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Entities;

import gameprojecthomework.Abstract.Entity;

/**
 *
 * @author samil
 */
public class Sale implements Entity{
        private Game[] games;
	private User user;
	
	public Sale() {

	}
	
	public Sale(Game[] games, User user) {
		super();
		this.games = games;
		this.user = user;
	}
	
	public Game[] getGames() {
		return games;
	}
	public void setGames(Game[] games) {
		this.games = games;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
