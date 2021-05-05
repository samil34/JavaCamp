/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import customermanagementsystem.Entities.Customer;

/**
 *
 * @author samil
 */
public class CustomerCheckManager implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }

   
    
}
