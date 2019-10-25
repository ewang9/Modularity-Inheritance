package modularityproject;

public class RectangularPrism extends Prism{
    
    public RectangularPrism(double l, double w, double h){
        this.length = l;
        this.width = w;
        this.height = h;
        this.volume = length*width*height;
        this.SA = (length*width*2)+(length*height*2)+(width*height*2);
    }
    
    public RectangularPrism(){
        
    }
    
    public void setLength(double l){
        this.length = l;
    }
    public void setWidth(double w){
        this.width = w;
    }
    
    @Override
    public void calcVolume(){
        if (height >= 0 && length>=0 && width >=0){
            this.volume = height*length*width;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public void calcSA(){
        if (length >= 0 && height>=0 && width >=0){
            this.SA = (length*width*2)+(length*height*2)+(width*height*2);
            this.printSA();
        }
        else System.out.println("Surface area is unknown");
    }
    
    protected double length = -1;
    protected double width=-1;
}
