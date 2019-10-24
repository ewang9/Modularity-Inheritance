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
    
    public double length;
    public double width;
    public double height;
}
