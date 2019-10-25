package modularityproject;

public class EqTriPyramid extends Pyramid{
    
    public EqTriPyramid(double bL, double bW, double h){
        this.bLength = bL;
        this.bWidth = bW;
        this.height = h;
        this.volume = (bLength*bWidth/2)*height/3;
        this.SA = (bLength*bWidth/2)+((Math.sqrt(Math.pow((bWidth/2),2))+Math.pow(height,2)*bLength)/2*3);
    }
    
    public EqTriPyramid(){
        
    }
    
    public void setbLength(double bL){
        this.bLength = bL;
    }
    
    public void setbWidth(double bW){
        this.bWidth = bW;
    }
    
    @Override
    public void calcVolume(){
        if (height >= 0 && bLength>=0 && bWidth>=0){
            this.volume = (bLength*bWidth/2)*height/3;
            this.printVolume();
        }
        else System.out.println("Volume is unknown");
    }
    
    public void calcSA(){
        if (height >= 0 && bLength>=0 && bWidth>=0){
            this.SA = (bLength*bWidth/2)+((Math.sqrt(Math.pow((bWidth/2),2))+Math.pow(height,2)*bLength)/2*3);
            this.printSA();
        }
        else System.out.println("Surface area is unknown");
    }
    
    protected double bLength = -1;
    protected double bWidth = -1;
}
