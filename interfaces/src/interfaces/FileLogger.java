/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author samil
 */
public class FileLogger implements Logger{

    @Override
    public void log(String message) {

        System.out.println("Dosyaya loglandı " + message);
    }
    
}
