/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojecthomework.Concrate;

import gameprojecthomework.Abstract.UserCheckService;
import gameprojecthomework.Abstract.UserSevice;
import gameprojecthomework.Entities.User;

/**
 *
 * @author samil
 */
public class UserManager implements UserSevice{
    private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.ChechIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " kullanıcı eklendi.");
		} else {
			System.out.println("Hatalı kullanıcı.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý güncellendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý silindi.");
	}

   
}
