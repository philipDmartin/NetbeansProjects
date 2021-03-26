/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phili
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int number){
        this.number = number;
    }
    
    // which returns the value number 
    // passed to it multiplied by the number 
    // provided to the constructor.
    public int multiply(int number){
        return this.number * number;
    }
}
