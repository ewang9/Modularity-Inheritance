package modularityproject;

import java.lang.Math;

public class Cube extends RectangularPrism{
   
    public Cube(double l){
        this.length = l;
        this.volume = Math.pow(length,3);
        this.SA = Math.pow(length,2)*6;
    }
    public Cube(){
        
    }
    
    public void setLength(double l){
        this.length = l;
        this.volume = Math.pow(length,3);
        this.SA = Math.pow(length,2)*6;
    }
}
