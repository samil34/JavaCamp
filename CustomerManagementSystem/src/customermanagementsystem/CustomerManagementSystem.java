/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermanagementsystem;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import customermanagementsystem.Entities.Customer;
import java.time.LocalDate;

/**
 *
 * @author samil
 */
public class CustomerManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer("samil","akpınar",LocalDate.of(2003,1,1),"44228074177"));
       
       // System.out.println("");
     
    }
    
}
