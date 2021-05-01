/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author samil
 */
public class CustomerManager {
    //Add, delete, update
    
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " kaydedildi");
    }
    
    //bulk insert
    public void addMultiple(Customer[] customers) {
        for(Customer customer : customers) {
            add(customer);
        }
    }
    
    
}
