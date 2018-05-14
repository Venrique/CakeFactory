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
public class CakeFactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cake cake = CakeFactory.getCake(CakeType.PEQUENIO);
        cake.partir();
        
        cake = CakeFactory.getCake(CakeType.MEDIANO);
        cake.partir();
        
        cake = CakeFactory.getCake(CakeType.GRANDE);
        cake.partir();
        
        
    }
    
}
