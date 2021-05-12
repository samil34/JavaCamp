/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation;
import ecommercesimulation.bussiness.abstracts.UserSevice;

import ecommercesimulation.bussiness.abstracts.UserVerificationService;
import ecommercesimulation.bussiness.concretes.UserManager;
import ecommercesimulation.bussiness.concretes.UserVerificaitonManager;
import ecommercesimulation.core.GoogleMailApiAdapter;
import ecommercesimulation.dataAccess.concretes.UseMemoryDao;
import ecommercesimulation.entities.concretes.User;

/**
 *
 * @author samil
 */
public class ECommerceSimulation {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        UserSevice userManager = new UserManager(new UseMemoryDao(),new UserVerificaitonManager(),new GoogleMailApiAdapter());
		UserVerificationService userVerificationService = new UserVerificaitonManager();
		User okan = new User(1,"Okan","Yazlı","okanyazli@gmail.com","12345x");
		User serkan = new User(2,"Serkan","Yazlı","serkanyazli@gmail.com","asdasfx");//Serkan Yazlı kullanıcısı veri tabanına eklendi.
		User x1 = new User(3,"Ali","Yazlı","serkanyazli@gmail.com","asdasfx");//Bu mail adresi daha önce kullanılmıştır.
		User x2 = new User(4,"Veli","Yazlı","ssserkanyazli@gmail.com","asdas");//Ad ve soyad kısmı 2 karakterden fazla,parolanız ise 6 karakterden fazla olmalıdır.
		User x3 = new User(5,"TelAli","Yazlı","telali@mail.com","asdasfx");//Mail adresiniz google tarafından doğrulanamadı.
		System.out.println("");
		System.out.println("|____________<Veri Tabanı>_____________|");
		System.out.println("|                                      |");
		userManager.add(okan);
		userManager.add(serkan);
		userManager.add(x1);
		userManager.add(x2);
		userManager.add(x3);
		System.out.println("");
		System.out.println("|__________<Hesap Doğrulama>___________|");
		System.out.println("|                                      |");
		userVerificationService.verificate(okan);
		userVerificationService.verificate(serkan);
		userVerificationService.verificate(x3);
		System.out.println("");
		System.out.println("|____<Giriş ve Bilgilendirme Ekranı>___|");
		System.out.println("|                                      |");
		userManager.login("okanyazli@gmail.com","12345x");//Okan Yazlı kullanıcısı için giriş başarılı.
		userManager.login("","");//Giriş başarısız email ve şifre alanı boş olamaz.
		userManager.login("s","ss");//Hatalı giriş veya doğrulanmamış mail adresi.
		userManager.login("serkanyazli@gmail.com", "asdasfx");
    }
    
}
