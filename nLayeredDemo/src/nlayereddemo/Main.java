/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlayereddemo;

import nlayereddemo.business.abstracts.ProductService;
import nlayereddemo.business.concretes.ProductManager;
import nlayereddemo.core.JLoggerManagerAdapter;
import nlayereddemo.dataAccess.concretes.AbcProductDao;
import nlayereddemo.dataAccess.concretes.HibernateProductDao;
import nlayereddemo.entities.concretes.Product;

/**
 *
 * @author samil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //test ortamımız
        //bir projede entitler haric new yazmayın
        
        //ToDo: String IoC ile çözülecek
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);
                
    }
    
}
