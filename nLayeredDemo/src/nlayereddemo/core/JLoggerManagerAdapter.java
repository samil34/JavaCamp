/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlayereddemo.core;

import nlayereddemo.jLogger.JLoggerManager;

/**
 *
 * @author samil
 */
public class JLoggerManagerAdapter implements LoggerService{

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
    
}
