package modularityproject;

import java.lang.Math;

public class Shape3D {
    protected double volume = -1;
    protected double SA = -1;
    
    public Shape3D(double v, double sa){
        this.volume = v;
        this.SA = sa;
    }
    
    public Shape3D(){
        
    }
    
    public void setVolume(double v){
        this.volume = v;
    }
    
    public void setSA(double SA){
        this.SA = SA;
    }
    
    public void printVolume(){
        if (volume>=0){
        System.out.println("The volume of this 3D shape is " + Math.round(volume));
        }
        else System.out.println("The volume of this 3D shape is unknown");
    }
    
    public void printSA(){
        if (SA>=0){
        System.out.println("The surface area of this 3D shape is " + Math.round(SA));
        }
        else System.out.println("The surface area of this 3D shape is unknown");
    }
}