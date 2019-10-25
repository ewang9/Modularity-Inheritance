package modularityproject;

public class Pyramid extends Shape3D{
    protected double baseArea = -1;
    protected double height = -1;
    
    public Pyramid(double base, double h){
        this.baseArea = base;
        this.height = h;
        this.volume = baseArea*height/3;
    }
    
    public Pyramid(){
        
    }
    
    public void setBase(double b){
        this.baseArea = b;
    }
    
    public void setHeight(double h){
        this.height = h;
    }
    
    public void calcVolume(){
        if (height >= 0 && baseArea>=0){
            this.volume = height*baseArea/3;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
}
