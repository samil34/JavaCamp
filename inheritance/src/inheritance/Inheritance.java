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
public class Inheritance {

    
    
    public static void main(String[] args) {
        
        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "12345";
        
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "78910";
        
        
        CustomerManager customerManager = new CustomerManager();
        
        Customer[] customers = {engin, hepsiBurada};
        //polimofizim, çoklu kayıt etme
        //argüman olarak liste gönderildi
        customerManager.addMultiple(customers);
        
    }
    
}
