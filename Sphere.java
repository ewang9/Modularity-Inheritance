package modularityproject;

import java.lang.Math;

public class Sphere extends Shape3D{
    public double rad;
    
    public Sphere(double radius){
        this.rad = radius;
        this.SA = Math.pow(rad,2)*Math.PI*4;
        this.volume = Math.pow(rad,3)*Math.PI*4/3;
    }
}
