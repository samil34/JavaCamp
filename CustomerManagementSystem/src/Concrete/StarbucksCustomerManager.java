/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import customermanagementsystem.Entities.Customer;

/**
 *
 * @author samil
 */
public class StarbucksCustomerManager extends BaseCustomerManager {
    
    private ICustomerCheckService _cusCheckService;
    
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        _cusCheckService = customerCheckService;
    }
    
   @Override
   public void save(Customer customer) {
       
       if (_cusCheckService.CheckIfRealPerson(customer)) {
           super.save(customer);
       }else{
           System.out.println("Not a valid person");
       }
       
       
       
    }

  
    
   
}
