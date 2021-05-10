/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlayereddemo.dataAccess.abstracts;

import java.util.List;
import nlayereddemo.entities.concretes.Product;

/**
 *
 * @author samil
 */
public interface ProductDao { //veri erişim interface'si
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);
    List<Product> getAll(); 
    
}
