/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author samil
 */
public class Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java uygulamalarının başlangıçı
        
        //camelCase
        //Dont repeat yourself
        String internetSubeButonu = "Giris";
        
        System.out.println("Hello world " + internetSubeButonu);
        
        int vade = 36;
        
        Boolean yukariDegisim = true;//şartlı ifadeleri tutar
        
        double dolarBugun = 8.15;
        
        if (dolarBugun < 10) {
            System.out.println("dolar düştü");
        }else{
            System.out.println("dolar aynı");
                 
        }
        
        //diziler ve array kullanımı
        //veri setleri ve liste görünümündeler
        String kredi1 = "hızlı kredi";
        String kredi2 = "konut kredisi";
        
        //ekraanda tekrarlayan şeklinde kullanılır
        
        String[] krediler = //döngü yapısı ile yazılır
        {
            "hizlı kresi",
            "konur kredisi",
            "emekli kresisi"
        };
        
        for(String kredi: krediler){
            System.out.println(kredi);
        }
        
        for(int i = 0; i< krediler.length;i++){
         System.out.println(krediler[i]);

        }
        
        
        
        
    }
    
}
