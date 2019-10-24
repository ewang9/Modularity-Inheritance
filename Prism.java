package modularityproject;

public class Prism extends Shape3D{
    
    public Prism(double base, double l){
        this.length = l;
        this.baseArea = base;
        this.volume = length*baseArea;
    }
    
    public Prism(){
        
    }
    
    public void calcVolume(){
        if (length != 0 && baseArea!=0){
            this.volume = length*baseArea;
            this.printVolume();
        }
        else System.out.println("Volume is 0 or unknown");
    }
    
    public double length;
    public double baseArea;
}
