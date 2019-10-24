package modularityproject;

public class Prism extends Shape3D{
    
    public Prism(double base, double h){
        this.height = h;
        this.baseArea = base;
        this.volume = height*baseArea;
    }
    
    public Prism(){
        
    }
    
    public void calcVolume(){
        if (height >= 0 && baseArea>=0){
            this.volume = height*baseArea;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public double height = -1;
    public double baseArea = -1;
}
