/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlayereddemo.business.concretes;

import java.util.List;
import nlayereddemo.business.abstracts.ProductService;
import nlayereddemo.core.LoggerService;
import nlayereddemo.dataAccess.abstracts.ProductDao;
import nlayereddemo.entities.concretes.Product;

/**
 *
 * @author samil
 */
public class ProductManager implements ProductService { //iş kodlarını yapan sınıftır
    
    //dependency injection
    private ProductDao productDao;
    private LoggerService loggerService;
    
    public ProductManager(ProductDao productDao, LoggerService loggerService){
        super();
        this.productDao = productDao;
        this.loggerService = loggerService;
    }
    
    @Override
    public void add(Product product) {
        //iş kodları yazılır
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride ürün kabül edilmiyor");
            return;
        }
        
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi " + product.getName());
                
    }

    @Override
    public List<Product> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
