/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phili
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public void increase(){
        this.value = this.value +1;
        
        if(this.value > 5) {
            this.value = this.value = 5;
        }
    }
    
    public void decrease(){
        this.value = this.value -1;
        
        if(this.value < 0) {
            this.value = this.value = 0;
        }
    }
    
    public int value(){
        return value;
    }
    
    public boolean full(){
        while(true) {
            if(this.value == 5) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
