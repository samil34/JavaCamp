/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import Abstract.ICustomerCheckService;
import customermanagementsystem.Entities.Customer;

/**
 *
 * @author samil
 */
public class MernisServiceAdapter implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        
        //Mernis doğrulması yapılmalı
        
        if (customer.getNatioanltyId().length() == 11) {
            return true;
        }else{
            return false;
        }
    }
    
    
}
