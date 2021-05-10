/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlayereddemo.business.abstracts;

import java.util.List;
import nlayereddemo.entities.concretes.Product;

/**
 *
 * @author samil
 */
public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
