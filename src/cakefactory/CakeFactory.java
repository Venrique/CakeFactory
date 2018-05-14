/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakefactory;

/**
 *
 * @author Administrator
 */
public class CakeFactory {
    
    public static Cake getCake(CakeType criterio){
        switch(criterio){
            case PEQUENIO:
                return new Pequenio();
            case MEDIANO:
                return new Mediano();
            case GRANDE:
                return new Grande();
        }
        return null;
    }
    
}
