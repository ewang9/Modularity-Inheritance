package modularityproject;

public class Prism extends Shape3D{
    
    public Prism(double base, double h){
        this.height = h;
        this.baseArea = base;
        this.volume = height*baseArea;
    }
    
    public Prism(){
        
    }
    
    public void setHeight(double h){
        this.height = h;
    }
    
    public void setBase(double b){
        this.baseArea = b;
    }
    
    public void calcVolume(){
        if (height >= 0 && baseArea>=0){
            this.volume = height*baseArea;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    protected double height = -1;
    protected double baseArea = -1;
}
