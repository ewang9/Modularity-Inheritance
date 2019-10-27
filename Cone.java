package modularityproject;

public class Cone extends Pyramid{
    
    public Cone(double r, double h){
        this.radius = r;
        this.height = h;
        this.volume = Math.PI*Math.pow(radius,2)*height/3;
        this.SA = (Math.sqrt(Math.pow(height,2)+Math.pow(radius,2))+radius)*Math.PI*radius;
    }
    
    public Cone(){
        
    }
    
    public void setRadius(double r){
        this.radius = r;
    }
    
    @Override
    public void calcVolume(){
        if (height >= 0 && radius>=0){
            this.volume = Math.PI*Math.pow(radius,2)*height/3;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public void calcSA(){
        if (height >= 0 && radius>=0){
            this.SA = (Math.sqrt(Math.pow(height,2)+Math.pow(radius,2))+radius)*Math.PI*radius;
            this.printSA();
        }
        else System.out.println("Surface area is unknown");
    }
    
    protected double radius = -1;
    
    
}
