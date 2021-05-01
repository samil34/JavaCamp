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
public class AbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();
        
        GameCalculator gameCalculator = new WomenGameCalculator();
    }
    
}
