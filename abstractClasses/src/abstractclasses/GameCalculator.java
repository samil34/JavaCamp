/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author samil
 */
public abstract class GameCalculator {
    public abstract void hesapla();
    
    public final void gameOver(){ //final ifadesi ile override edilmez
        System.out.println("oyun bitti");
    }
}
