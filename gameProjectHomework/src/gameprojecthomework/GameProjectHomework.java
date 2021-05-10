/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework;

import gameprojecthomework.Adapter.MernisManagerAdapter;
import gameprojecthomework.Concrate.DiscountManager;
import gameprojecthomework.Concrate.GameManager;
import gameprojecthomework.Concrate.SalesManager;
import gameprojecthomework.Concrate.UserManager;
import gameprojecthomework.Entities.Discount;
import gameprojecthomework.Entities.Game;
import gameprojecthomework.Entities.User;

/**
 *
 * @author samil
 */
public class GameProjectHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserManager userManager = new UserManager(new MernisManagerAdapter());
        User serkan = new User(1,"Serkan","Yazlı","11111111111",2002);
        User samil = new User(2,"Samil","Akpınar","22222222222",19994);
        
        userManager.add(serkan);
        userManager.add(samil);
        userManager.delete(serkan);
        
        
        GameManager gameManager = new GameManager();
        Game rust = new Game(1,"RUST",59.50);
        Game cs = new Game(2,"CS",60.50);
        Game[] games = {rust,cs};
        
        gameManager.addMultiple(games);
        gameManager.delete(cs);
        
        
        DiscountManager discountManager = new DiscountManager();
 	Discount yaz = new Discount(30,"Yaz Indimi");
        Discount kis = new Discount(10,"Kis Indirimi");
 	discountManager.add(yaz);
 	discountManager.add(kis);  
        discountManager.delete(kis);
        
        SalesManager salesManager = new SalesManager();
	salesManager.addToList(games, serkan);
	System.out.println("");
	salesManager.sale(games, serkan,yaz);
        
    }
    
}
