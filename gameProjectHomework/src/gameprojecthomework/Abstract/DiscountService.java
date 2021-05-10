/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Abstract;

import gameprojecthomework.Entities.Discount;

/**
 *
 * @author samil
 */
public interface DiscountService {
    void add(Discount discount);
    void update(Discount discount);
    void delete(Discount discount);
}
