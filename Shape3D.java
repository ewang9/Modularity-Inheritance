package modularityproject;

import java.lang.Math;

public class Shape3D {
    public double volume;
    public double SA;
    
    public void printVolume(){
        System.out.println("The volume of this 3D shape is " + Math.round(volume));
    }
    
    public void printSA(){
        System.out.println("The surface area of this 3D shape is " + Math.round(SA));
    }
}
