package modularityproject;

import java.lang.Math;
public class SquarePyramid extends Pyramid{
    protected double bLength = -1;
    
    public SquarePyramid(double b, double h){
        this.bLength = b;
        this.height = h;
        this.volume = Math.pow(bLength,2)*height/3;
        
        this.SA = (Math.pow(bLength,2)) + ((Math.sqrt(Math.pow((bLength/2),2)+Math.pow(height,2)))*bLength*2);
    }
    
    public SquarePyramid(){
        
    }
    
    public void setbLength(double b){
        this.bLength = b;
    }
    
    @Override
    public void calcVolume(){
        if (height >= 0 && bLength>=0){
            this.volume = height*(Math.pow(bLength,2))/3;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public void calcSA(){
        if (height >= 0 && bLength>=0){
            this.SA = (Math.pow(bLength,2)) + ((Math.sqrt(Math.pow((bLength/2),2)+Math.pow(height,2)))*bLength*2);
            this.printSA();
        }
        else System.out.println("Surface area is unknown");
    }
    
}
