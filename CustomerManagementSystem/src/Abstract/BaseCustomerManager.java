/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import customermanagementsystem.Entities.Customer;

/**
 *
 * @author samil
 */
public abstract class BaseCustomerManager implements ICustomerService{

    @Override
    public void save(Customer customer) {
        System.out.println("Saved to db : " + customer.getFirstName());
    }
    
}
