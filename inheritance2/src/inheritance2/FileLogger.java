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
public class FileLogger extends Logger {
    
    @Override
    public void log() {
        System.out.println("Dosya loglandı");
    }
}
