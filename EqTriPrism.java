package modularityproject;

public class EqTriPrism extends Prism{
    
    public EqTriPrism(double w, double l, double h){
        this.altitude = w;
        this.height = h;
        this.sideLength = l;
        this.volume = (altitude*sideLength/2)*height;
    }
    
    public EqTriPrism(){
        
    }
    
    public void setLength(double l){
        this.sideLength = l;
    }
    public void setWidth(double w){
        this.altitude = w;
    }
    public void setHeight(double h){
        this.height = h;
    }
    
    @Override
    public void calcVolume(){
        if (height >= 0 && sideLength>=0 && altitude >=0){
            this.volume = height*(sideLength*altitude/2);
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public void calcSA(){
        if (height >= 0 && sideLength>=0 && altitude >=0){
            this.SA = (sideLength*altitude)+(height*sideLength*3);
            this.printSA();
        }
        else System.out.println("Surface area is unknown");
    }
    
    public double altitude = -1;
    public double sideLength = -1;
}
