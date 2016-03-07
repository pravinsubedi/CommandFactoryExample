/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandfactoryexample.commands;

/**
 *
 * @author pravin
 */
public class AddCommand extends Commands {

    @Override
    public double execute(double x, double y) {
       return x+y;        
    
    }
}