package modularityproject;

import java.lang.Math;

public class Cube extends RectangularPrism{
   
    public Cube(double l){
        this.sLength = l;
        this.volume = Math.pow(sLength,3);
        this.SA = Math.pow(sLength,2)*6;
    }
    public Cube(){
        
    }
    
    public void setLength(double l){
        this.sLength = l;
        this.volume = Math.pow(sLength,3);
        this.SA = Math.pow(sLength,2)*6;
    }
    
    public double sLength;
}
