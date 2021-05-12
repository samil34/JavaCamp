/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercesimulation.core.utils;

/**
 *
 * @author samil
 */
public class RunRules {
    public static boolean run(boolean... things){
        for(boolean thing : things){
            if (!thing) return false;
                
            
        }
     return true;   
    }
    
}
