/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author samil
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
        
        CustomerManager customerManager = new CustomerManager(loggers); //logger verilmesi gerekli
        
        Customer engin = new Customer(1,"engin","demiroğ");
        
        customerManager.add(engin);
    }
    
}
