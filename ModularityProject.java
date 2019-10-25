package modularityproject;

import java.util.Scanner;

public class ModularityProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the volume/surface area calculator");
        System.out.println("Enter the word \"home\" at any time to return to this home page"); //add in this too
        String input = "home";
        do{
            System.out.println("What archetype of shape would you like to analyze: sphere, prism, or pyramid?");
            String type = sc.nextLine();
            if (type.trim().equalsIgnoreCase("sphere")){
                System.out.println("Do you know the radius?");
                String radAnswer = "";
                boolean notDone = true;
                do {
                    radAnswer = sc.nextLine();
                    if (type.trim().equalsIgnoreCase("yes") || type.trim().equalsIgnoreCase("y")){
                        System.out.println("What is it?");
                        double rad = sc.nextDouble();
                        if (rad<0) {
                            System.out.println("That's a negative radius. That's not possible. Do you really know the radius?");
                        }
                    }
                    else if (type.trim().equalsIgnoreCase("no") || type.trim().equalsIgnoreCase("n")){
                        Sphere sphere1 = new Sphere();
                        System.out.println("Well, see if you can find it somehow. If you do, type \"radius\" on the next line to enter it in.");
                        //Add this feature in
                    }

                } while(notDone);
            }
            else if (type.trim().equalsIgnoreCase("prism") || type.trim().equalsIgnoreCase("pyramid")){
                System.out.println("Is the base circular, triangular, or rectangular?");
                String base = sc.nextLine();
        }} while (input.trim().equalsIgnoreCase("home"));
        System.out.println("The program is now closing, goodbye.");
    }
    
}
