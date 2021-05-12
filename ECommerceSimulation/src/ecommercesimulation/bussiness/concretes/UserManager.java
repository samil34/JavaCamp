/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.bussiness.concretes;

import ecommercesimulation.bussiness.abstracts.MailService;
import ecommercesimulation.bussiness.abstracts.UserSevice;
import ecommercesimulation.bussiness.abstracts.UserVerificationService;
import ecommercesimulation.dataAccess.abstracts.UserDao;
import ecommercesimulation.entities.concretes.User;



/**
 *
 * @author samil
 */
public class UserManager implements UserSevice{
    
        UserDao userDao;
	UserVerificationService userVerificationService;
	MailService mailCheckService;
	
	
	public UserManager(UserDao userDao,UserVerificationService userVerificationService,MailService mailCheckService) {
		super();
		this.userDao = userDao;
		this.userVerificationService=userVerificationService;
		this.mailCheckService = mailCheckService;
	}

	@Override
	public void add(User user) {
		if(!checkIfUserExists(user.getEmail())){
			System.out.println("Bu mail adresi daha önce kullanılmıştır.");
			return;
		}
		
		if(!mailCheckService.checkIfTrueMail(user)) {
			System.out.println("Mail adresiniz google tarafından  doğrulanamadı.");
			return;
		}
		
		if(!userVerificationService.checkPerson(user)) {
			System.out.println("Ad ve soyad kısmı 2 karakterden fazla,parolanız  6 karakterden fazla olmalıdır.");
			return;
		}
		
		userDao.save(user);
		userVerificationService.sendMail(user.getEmail());
	}
	
	@Override
	public void login(String email, String password) {
		if(!userVerificationService.checkEmailPassword(email, password)) {
			System.out.println("Giris başarisiz email ve sifre alanı bos olamaz.");
			
		}
		
		User loginUser= userDao.CheckMailPassword(email, password);
		if(loginUser != null && loginUser.isUserVerification()) {
			System.out.println(loginUser.getFirstName() + " " + loginUser.getLastName() + " kullanıcısı için giriş basarili." );
		}else {
			System.out.println("Hatali giris veya doðrulanmamis mail adresi.");
		}
	}
	
	private boolean checkIfUserExists(String email) {
		return userDao.listEmil(email) == null;
	}
   
    
}
