/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author samil
 */
public class LogManager {
    
    public void log(int logType) {
        if (logType == 1) {
            System.out.println("Veritananına loglandı");
            
        }else if(logType == 2){
            System.out.println("Dosyaya loglandı");
            
        }else {
            System.out.println("Email Gönderildi");

        }
    }
}


//1 - Database
//2 - File
//3 - Email
