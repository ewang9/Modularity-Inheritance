package modularityproject;

public class Cylinder extends Prism{
    
    public Cylinder(double rad, double height){
        this.rad = rad;
        this.height = height;
        this.volume = Math.pow(rad,2)*height*Math.PI;
        this.SA = (Math.pow(rad,2)*Math.PI*2)+(2*Math.PI*rad*height);
    }
    public Cylinder(){
        
    }
    public void setRad(double r){
        this.rad = r;
    }

    @Override
    public void calcVolume(){
        if (rad >= 0 && height>=0){
            this.volume = Math.pow(rad,2)*height*Math.PI;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public void calcSA(){
        if (rad >= 0 && height>=0){
            this.SA = (Math.pow(rad,2)*Math.PI*2)+(2*Math.PI*rad*height);
            this.printSA();
        }
        else System.out.println("Surface area is unknown");
    }
    
    protected double rad = -1;
}
