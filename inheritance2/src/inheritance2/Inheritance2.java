/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author samil
 */
public class Inheritance2 {

    
    public static void main(String[] args) {
        
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new DatabaseLogger());
    }
    
}
