/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlayereddemo.dataAccess.concretes;

import java.util.List;
import nlayereddemo.dataAccess.abstracts.ProductDao;
import nlayereddemo.entities.concretes.Product;

/**
 *
 * @author samil
 */
public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi " + product.getName());
    }

    @Override
    public void update(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
