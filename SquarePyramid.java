package modularityproject;

import java.lang.Math;
public class SquarePyramid extends Pyramid{
    public double bLength = -1;
    
    public SquarePyramid(double b, double h){
        this.bLength = b;
        this.height = h;
        this.volume = bLength*bLength*height/3;
        
        this.SA = (Math.pow(bLength,2)) + ((Math.sqrt(Math.pow((bLength/2),2)+Math.pow(height,2)))*bLength*2);
    }
    
    public SquarePyramid(){
        
    }
    
    
    
}
