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
public class Utils {
    
    public static void runLoggers(Logger[] loggers, String message){
        for(Logger logger: loggers){
            logger.log(message);
        }
    }
}
