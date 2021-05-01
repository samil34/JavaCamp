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
public class CustomerManager {
    
    //tasarım desenidir
    //birsen fazla log gönderme
    private Logger[] loggers;
    
    public CustomerManager(Logger[] loggers){
        this.loggers = loggers;
    }
    
    //loosly coupled - gevşek bağlı
    //tightly coupled - katı bağlı
    
    public void add(Customer customer){
        System.out.println("Müşteri eklendi " + customer.getFirstName());
        
        //veritabanına ekleme işlemi yapılır
        //sadece interface'e bağımlıyız
        //direk database yazılmadı
        
        //static kavramı ile çağırdık
        Utils.runLoggers(loggers, customer.getFirstName());
    }
    
    public void delete(Customer customer){
        System.out.println("müşteri silindi " + customer.getFirstName());
        
        Utils.runLoggers(loggers, customer.getFirstName());

    }
}
