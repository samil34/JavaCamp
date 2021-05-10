/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Concrate;

import gameprojecthomework.Abstract.DiscountService;
import gameprojecthomework.Entities.Discount;

/**
 *
 * @author samil
 */
public class DiscountManager implements DiscountService{

    @Override
	public void add(Discount discount) {
		System.out.println(discount.getInfo() + " sisteme %" + discount.getDiscountPercent() + " indirim oranýyla " + "eklenmiþtir.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getInfo() + " güncellenmiþtir.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getInfo() + " sistemden kaldýrýlmýþtýr");
		
	}
    
}
