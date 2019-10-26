package modularityproject;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class ModularityProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the volume/surface area calculator");
        System.out.println("Enter the word \"home\" at any time to return to this home page, or exit to exit the program"); 
        String input = "home";
        do{
            System.out.println("What archetype of shape would you like to analyze: sphere, prism, or pyramid?");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("home")) {
            	continue;
            }
            else if (input.equalsIgnoreCase("exit")) {
            	break;
            }
            else if (input.trim().equalsIgnoreCase("sphere")){
            	double rad = 0;
                System.out.println("Do you know the radius?");
                do {
                	input = sc.nextLine();
                    if (input.equalsIgnoreCase("home")) {
                    	break;
                    }
                    else if (input.equalsIgnoreCase("exit")) {
                    	break;
                    }
                    if (input.trim().equalsIgnoreCase("yes") || input.trim().equalsIgnoreCase("y")){
                        System.out.println("What is it?");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("home")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("exit")) {
                        	break;
                        }
                        try {
                        	rad = Double.parseDouble(input);
                        }
                        catch (NumberFormatException e) {
                        	System.out.println("That's not a valid radius, are you sure you know the radius? ");
                        	continue;
                        }
                        if (rad<0) {
                            System.out.println("That's a negative radius. That's not possible. Do you really know the radius?");
                            rad = 0;
                            continue;
                        }
                        Sphere sphere1 = new Sphere(rad);
                        sphere1.printSA();
                        sphere1.printVolume();
                        System.out.println("The program has been completed.");
                        break;
                    }
                    else if (input.trim().equalsIgnoreCase("no") || input.trim().equalsIgnoreCase("n")){
                        Sphere sphere2 = new Sphere();
                        System.out.println("Well, see if you can find it somehow. If you do, type \"radius\" on the next line to enter it in.");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("home")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("exit")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("radius")) {
                        	System.out.println("What is it?");
                        	do {
	                            input = sc.nextLine();
	                            if (input.equalsIgnoreCase("home")) {
	                            	break;
	                            }
	                            else if (input.equalsIgnoreCase("exit")) {
	                            	break;
	                            }
	                            try {
	                            	rad = Double.parseDouble(input);
	                            }
	                            catch (NumberFormatException e) {
	                            	System.out.println("That's not a valid radius, please try again.");
	                            	continue;
	                            }
	                            if (rad<0) {
	                                System.out.println("That's a negative radius. That's not possible. Please enter the correct radius.");
	                                rad = 0;
	                                continue;
	                            }
	                            break;
                        	} while (!input.equalsIgnoreCase("exit"));
                        	sphere2.setRad(rad);
                        	sphere2.printSA();
                        	sphere2.printVolume();
                        	System.out.println("The program has been completed.");
                        	break;
                        }
                        else {
                        	System.out.println("That's not a valid answer. I'll assume you can't find the radius, returning to the home page. \n");
                        	input = "home";
                        	break;
                        }
                    }
                    else {
                    	System.out.println("That's not a valid answer, please answer yes or no: Do you know the radius? ");
                    	continue;
                    }
                } while(!input.equalsIgnoreCase("exit"));
                if (input.equalsIgnoreCase("home")) {
                	continue;
                }
                if (input.equalsIgnoreCase("exit")) {
                	break;
                } 
            }
            else if (input.trim().equalsIgnoreCase("prism") || input.trim().equalsIgnoreCase("pyramid")){
                String type = input.toLowerCase();
            	do {
	                System.out.println("Is the base circular, triangular, or rectangular?");
	                input = sc.nextLine();
	                if (input.equalsIgnoreCase("circular")||input.equalsIgnoreCase("c")) {
	                	double rad = 0;
	                	double height = 0;
	                	System.out.println("Do you know the dimensions?");
	                	do {
	                	input = sc.nextLine();
	                	if (input.equalsIgnoreCase("home")) {
	                    	break;
	                    }
	                    else if (input.equalsIgnoreCase("exit")) {
	                    	break;
	                    } 
	                    else if (input.trim().equalsIgnoreCase("yes") || input.trim().equalsIgnoreCase("y")){
	                    	 System.out.println("What is the radius?");
	                    	 do {
		                         input = sc.nextLine();
		                         if (input.equalsIgnoreCase("home")) {
		                         	break;
		                         }
		                         else if (input.equalsIgnoreCase("exit")) {
		                         	break;
		                         }
		                         try {
		                         	rad = Double.parseDouble(input);
		                         }
		                         catch (NumberFormatException e) {
		                         	System.out.println("That's not a valid radius, please enter the radius again: ");
		                         	continue;
		                         }
		                         if (rad<0) {
		                             System.out.println("That's a negative radius. That's not possible. Please enter the correct radius.");
		                             rad = 0;
		                             continue;
		                         }
		                         break;
	                    	 } while (!input.equalsIgnoreCase("exit"));
	                    	 if (input.equalsIgnoreCase("home")) {
		                         	break;
		                         }
		                     if (input.equalsIgnoreCase("exit")) {
		                         	break;
		                         }
		                     System.out.println("Now, what is the height?");
	                    	 do {
		                         input = sc.nextLine();
		                         if (input.equalsIgnoreCase("home")) {
		                         	break;
		                         }
		                         else if (input.equalsIgnoreCase("exit")) {
		                         	break;
		                         }
		                         try {
		                         	height = Double.parseDouble(input);
		                         }
		                         catch (NumberFormatException e) {
		                         	System.out.println("That's not a valid height, please enter the height again: ");
		                         	continue;
		                         }
		                         if (height<0) {
		                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
		                             height = 0;
		                             continue;
		                         }
		                         break;
	                    	 } while (!input.equalsIgnoreCase("exit"));
	                    	 if (input.equalsIgnoreCase("home")) {
		                         	break;
		                         }
		                     if (input.equalsIgnoreCase("exit")) {
		                         	break;
		                         }
		                     if (type.equals("prism")) {
		                 		Cylinder cylinder1 = new Cylinder(rad,height);
		                 		cylinder1.printSA();
		                 		cylinder1.printVolume();
		                 		System.out.println("The program has been completed.");
		                 		break;
		                 	}
		                 	else if(type.equals("pyramid")) {
		                 		Cone cone1 = new Cone(rad,height);
		                 		cone1.printSA();
		                 		cone1.printVolume();
		                 		System.out.println("The program has been completed.");
		                 		break;
		                 	}
	                	}
	                	else if (input.trim().equalsIgnoreCase("no") || input.trim().equalsIgnoreCase("n")){
		                 		Cylinder cylinder1 = new Cylinder();
		                 		Cone cone1 = new Cone();
	                		System.out.println("Well, see if you can find them somehow. If you do, type \"dimensions\" on the next line to enter them in.");
	                        input = sc.nextLine();
	                        if (input.equalsIgnoreCase("home")) {
	                        	break;
	                        }
	                        else if (input.equalsIgnoreCase("exit")) {
	                        	break;
	                        }
	                        else if (input.equalsIgnoreCase("dimensions")) {
	                        	System.out.println("What is the radius?");
		                    	 do {
			                         input = sc.nextLine();
			                         if (input.equalsIgnoreCase("home")) {
			                         	break;
			                         }
			                         else if (input.equalsIgnoreCase("exit")) {
			                         	break;
			                         }
			                         try {
			                         	rad = Double.parseDouble(input);
			                         }
			                         catch (NumberFormatException e) {
			                         	System.out.println("That's not a valid radius, please enter the radius again: ");
			                         	continue;
			                         }
			                         if (rad<0) {
			                             System.out.println("That's a negative radius. That's not possible. Please enter the correct radius.");
			                             rad = 0;
			                             continue;
			                         }
			                         break;
		                    	 } while (!input.equalsIgnoreCase("exit"));
		                    	 if (input.equalsIgnoreCase("home")) {
			                         	break;
			                         }
			                     if (input.equalsIgnoreCase("exit")) {
			                         	break;
			                         }
			                     System.out.println("Now, what is the height?");
		                    	 do {
			                         input = sc.nextLine();
			                         if (input.equalsIgnoreCase("home")) {
			                         	break;
			                         }
			                         else if (input.equalsIgnoreCase("exit")) {
			                         	break;
			                         }
			                         try {
			                         	height = Double.parseDouble(input);
			                         }
			                         catch (NumberFormatException e) {
			                         	System.out.println("That's not a valid height, please enter the height again: ");
			                         	continue;
			                         }
			                         if (height<0) {
			                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
			                             height = 0;
			                             continue;
			                         }
			                         break;
		                    	 } while (!input.equalsIgnoreCase("exit"));
		                    	 if (input.equalsIgnoreCase("home")) {
			                         	break;
			                         }
			                     if (input.equalsIgnoreCase("exit")) {
			                         	break;
			                         }
			                     if (type.equals("prism")) {
			                 		cylinder1.setRad(rad);
			                 		cylinder1.setHeight(height);
			                 		cylinder1.calcSA();
			                 		cylinder1.calcVolume();
			                 		System.out.println("The program has been completed.");
			                 		break;
			                 	}
			                 	else if(type.equals("pyramid")) {
			                 		cone1.setRadius(rad);
			                 		cone1.setHeight(height);
			                 		cone1.calcSA();
			                 		cone1.calcVolume();
			                 		System.out.println("The program has been completed.");
			                 		break;
			                 	}
	                        }
	                	}
	                	else {
	                    	System.out.println("That's not a valid answer, please answer yes or no: Do you know the dimensions of the shape? ");
	                    	continue;
	                    }
	                } while(!input.trim().equalsIgnoreCase("exit"));
                }
                else if (input.equalsIgnoreCase("triangular")||input.equalsIgnoreCase("t")) {
                	double bLength = 0;
                	double bHeight = 0;
                	double vHeight = 0;
                	System.out.println("Do you know the dimensions?");
                	do {
                	input = sc.nextLine();
                	if (input.equalsIgnoreCase("home")) {
                    	break;
                    }
                    else if (input.equalsIgnoreCase("exit")) {
                    	break;
                    } 
                    else if (input.trim().equalsIgnoreCase("yes") || input.trim().equalsIgnoreCase("y")){
                    	 System.out.println("What is the side length of the triangular base?");
                    	 do {
	                         input = sc.nextLine();
	                         if (input.equalsIgnoreCase("home")) {
	                         	break;
	                         }
	                         else if (input.equalsIgnoreCase("exit")) {
	                         	break;
	                         }
	                         try {
	                         	bLength = Double.parseDouble(input);
	                         }
	                         catch (NumberFormatException e) {
	                         	System.out.println("That's not a valid length, please enter the length again: ");
	                         	continue;
	                         }
	                         if (bLength<0) {
	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
	                             bLength = 0;
	                             continue;
	                         }
	                         break;
                    	 } while (!input.equalsIgnoreCase("exit"));
                    	 if (input.equalsIgnoreCase("home")) {
	                         	break;
	                         }
	                     if (input.equalsIgnoreCase("exit")) {
	                         	break;
	                         }
	                     System.out.println("Now, what is the height of the triangular base?");
                    	 do {
	                         input = sc.nextLine();
	                         if (input.equalsIgnoreCase("home")) {
	                         	break;
	                         }
	                         else if (input.equalsIgnoreCase("exit")) {
	                         	break;
	                         }
	                         try {
	                         	bHeight = Double.parseDouble(input);
	                         }
	                         catch (NumberFormatException e) {
	                         	System.out.println("That's not a valid height, please enter the height again: ");
	                         	continue;
	                         }
	                         if (bHeight<0) {
	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
	                             bHeight = 0;
	                             continue;
	                         }
	                         break;
                    	 } while (!input.equalsIgnoreCase("exit"));
                    	 if (input.equalsIgnoreCase("home")) {
	                         	break;
	                         }
	                     if (input.equalsIgnoreCase("exit")) {
	                         	break;
	                         }
	                     System.out.println("Now, what is the vertical height of the prism?");
                    	 do {
	                         input = sc.nextLine();
	                         if (input.equalsIgnoreCase("home")) {
	                         	break;
	                         }
	                         else if (input.equalsIgnoreCase("exit")) {
	                         	break;
	                         }
	                         try {
	                         	vHeight = Double.parseDouble(input);
	                         }
	                         catch (NumberFormatException e) {
	                         	System.out.println("That's not a valid height, please enter the height again: ");
	                         	continue;
	                         }
	                         if (vHeight<0) {
	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
	                             vHeight = 0;
	                             continue;
	                         }
	                         break;
                    	 } while (!input.equalsIgnoreCase("exit"));
                    	 if (input.equalsIgnoreCase("home")) {
	                         	break;
	                         }
	                     if (input.equalsIgnoreCase("exit")) {
	                         	break;
	                         }
	                     if (type.equals("prism")) {
	                 		EqTriPrism triPrism1 = new EqTriPrism(bHeight,bLength,vHeight);
	                 		triPrism1.printSA();
	                 		triPrism1.printVolume();
	                 		System.out.println("The program has been completed.");
	                 		break;
	                 	}
	                 	else if(type.equals("pyramid")) {
	                 		EqTriPyramid triPyramid1 = new EqTriPyramid(bLength,bHeight,vHeight);
	                 		triPyramid1.printSA();
	                 		triPyramid1.printVolume();
	                 		System.out.println("The program has been completed.");
	                 		break;
	                 	}
                	}
                	else if (input.trim().equalsIgnoreCase("no") || input.trim().equalsIgnoreCase("n")){
	                 		EqTriPrism triPrism1 = new EqTriPrism();
	                 		EqTriPyramid triPyramid1 = new EqTriPyramid();
                		System.out.println("Well, see if you can find them somehow. If you do, type \"dimensions\" on the next line to enter them in.");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("home")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("exit")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("dimensions")) {
                        	System.out.println("What is the side length of the triangular base?");
                       	 do {
   	                         input = sc.nextLine();
   	                         if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                         else if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                         try {
   	                         	bLength = Double.parseDouble(input);
   	                         }
   	                         catch (NumberFormatException e) {
   	                         	System.out.println("That's not a valid length, please enter the length again: ");
   	                         	continue;
   	                         }
   	                         if (bLength<0) {
   	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
   	                             bLength = 0;
   	                             continue;
   	                         }
   	                         break;
                       	 } while (!input.equalsIgnoreCase("exit"));
                       	 if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                     if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                     System.out.println("Now, what is the height of the triangular base?");
                       	 do {
   	                         input = sc.nextLine();
   	                         if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                         else if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                         try {
   	                         	bHeight = Double.parseDouble(input);
   	                         }
   	                         catch (NumberFormatException e) {
   	                         	System.out.println("That's not a valid height, please enter the height again: ");
   	                         	continue;
   	                         }
   	                         if (bHeight<0) {
   	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
   	                             bHeight = 0;
   	                             continue;
   	                         }
   	                         break;
                       	 } while (!input.equalsIgnoreCase("exit"));
                       	 if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                     if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                     System.out.println("Now, what is the vertical height of the prism?");
                       	 do {
   	                         input = sc.nextLine();
   	                         if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                         else if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                         try {
   	                         	vHeight = Double.parseDouble(input);
   	                         }
   	                         catch (NumberFormatException e) {
   	                         	System.out.println("That's not a valid height, please enter the height again: ");
   	                         	continue;
   	                         }
   	                         if (vHeight<0) {
   	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
   	                             vHeight = 0;
   	                             continue;
   	                         }
   	                         break;
                       	 } while (!input.equalsIgnoreCase("exit"));
                       	 if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                     if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                  if (type.equals("prism")) {
	                 		triPrism1.setWidth(bHeight);
	                 		triPrism1.setLength(bLength);
	                 		triPrism1.setHeight(vHeight);
	                 		triPrism1.calcSA();
	                 		triPrism1.calcVolume();
	                 		System.out.println("The program has been completed.");
	                 		break;
	                 	}
	                 	else if(type.equals("pyramid")) {
	                 		triPyramid1.setbLength(bLength);
	                 		triPyramid1.setbWidth(bHeight);
	                 		triPyramid1.setHeight(vHeight);
	                 		triPyramid1.calcSA();
	                 		triPyramid1.calcVolume();
	                 		System.out.println("The program has been completed.");
	                 		break;
	                 	}
   	                     
                        }
                	}
                	else {
                    	System.out.println("That's not a valid answer, please answer yes or no: Do you know the dimensions of the shape? ");
                    	continue;
                    }
                } while(!input.trim().equalsIgnoreCase("exit"));
                }
                else if (input.equalsIgnoreCase("rectangular")||input.equalsIgnoreCase("r")) {
                	if (type.equals("prism")){
                		System.out.println("Is the shape a cube?");
                	do {
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("home")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("exit")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")) {
                        	type = "cube";
                        	break;
                        }
                        else if (input.equalsIgnoreCase("no")||input.equalsIgnoreCase("n")) {
                        	break;
                        }
                        else {
                        	System.out.println("That's not an answer. Please answer again: Is the shape a cube?");
                        	continue;
                        }
                	
               	 } while (!input.equalsIgnoreCase("exit"));
                	}
                	 if (input.equalsIgnoreCase("home")) {
                     	break;
                     }
                     else if (input.equalsIgnoreCase("exit")) {
                     	break;
                     }
                	System.out.println("Do you know the dimensions?");
                	do {
                	input = sc.nextLine();
                	if (input.equalsIgnoreCase("home")) {
                    	break;
                    }
                    else if (input.equalsIgnoreCase("exit")) {
                    	break;
                    } 
                    else if (input.trim().equalsIgnoreCase("yes") || input.trim().equalsIgnoreCase("y")){
                    	if (type.equals("pyramid")) {
                    		double bLength = 0;
                    		double height = 0;
                    		System.out.println("What is the side length of the base?");
                       	 do {
   	                         input = sc.nextLine();
   	                         if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                         else if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                         try {
   	                         	bLength = Double.parseDouble(input);
   	                         }
   	                         catch (NumberFormatException e) {
   	                         	System.out.println("That's not a valid length, please enter the length again: ");
   	                         	continue;
   	                         }
   	                         if (bLength<0) {
   	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
   	                             bLength = 0;
   	                             continue;
   	                         }
   	                         break;
                       	 } while (!input.equalsIgnoreCase("exit"));
                       	 if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                     if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                     System.out.println("Now, what is the vertical height of the pyramid?");
                       	 do {
   	                         input = sc.nextLine();
   	                         if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                         else if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                         try {
   	                         	height = Double.parseDouble(input);
   	                         }
   	                         catch (NumberFormatException e) {
   	                         	System.out.println("That's not a valid height, please enter the height again: ");
   	                         	continue;
   	                         }
   	                         if (height<0) {
   	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
   	                             height = 0;
   	                             continue;
   	                         }
   	                         break;
                       	 } while (!input.equalsIgnoreCase("exit"));
                       	 if (input.equalsIgnoreCase("home")) {
   	                         	break;
   	                         }
   	                     if (input.equalsIgnoreCase("exit")) {
   	                         	break;
   	                         }
   	                 		SquarePyramid sqPyramid1 = new SquarePyramid(bLength, height);
   	                 		sqPyramid1.printSA();
   	                 		sqPyramid1.printVolume();
   	                 		System.out.println("The program has been completed.");
   	                 		break;
                   	}
                    	else if (type.equals("prism")) {
                    		double bLength = 0;
                    		double bWidth = 0;
                    		double vHeight = 0;
                    		System.out.println("What is the length of the base?");
                          	 do {
      	                         input = sc.nextLine();
      	                         if (input.equalsIgnoreCase("home")) {
      	                         	break;
      	                         }
      	                         else if (input.equalsIgnoreCase("exit")) {
      	                         	break;
      	                         }
      	                         try {
      	                         	bLength = Double.parseDouble(input);
      	                         }
      	                         catch (NumberFormatException e) {
      	                         	System.out.println("That's not a valid length, please enter the length again: ");
      	                         	continue;
      	                         }
      	                         if (bLength<0) {
      	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
      	                             bLength = 0;
      	                             continue;
      	                         }
      	                         break;
                          	 } while (!input.equalsIgnoreCase("exit"));
                          	 if (input.equalsIgnoreCase("home")) {
      	                         	break;
      	                         }
      	                     if (input.equalsIgnoreCase("exit")) {
      	                         	break;
      	                         }
      	                     System.out.println("Now, what is the width of the base?");
                          	 do {
      	                         input = sc.nextLine();
      	                         if (input.equalsIgnoreCase("home")) {
      	                         	break;
      	                         }
      	                         else if (input.equalsIgnoreCase("exit")) {
      	                         	break;
      	                         }
      	                         try {
      	                         	bWidth = Double.parseDouble(input);
      	                         }
      	                         catch (NumberFormatException e) {
      	                         	System.out.println("That's not a valid height, please enter the height again: ");
      	                         	continue;
      	                         }
      	                         if (bWidth<0) {
      	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
      	                             bWidth = 0;
      	                             continue;
      	                         }
      	                         break;
                          	 } while (!input.equalsIgnoreCase("exit"));
                          	 if (input.equalsIgnoreCase("home")) {
      	                         	break;
      	                         }
      	                     if (input.equalsIgnoreCase("exit")) {
      	                         	break;
      	                         }
      	                     System.out.println("Now, what is the vertical height of the prism?");
                          	 do {
      	                         input = sc.nextLine();
      	                         if (input.equalsIgnoreCase("home")) {
      	                         	break;
      	                         }
      	                         else if (input.equalsIgnoreCase("exit")) {
      	                         	break;
      	                         }
      	                         try {
      	                         	vHeight = Double.parseDouble(input);
      	                         }
      	                         catch (NumberFormatException e) {
      	                         	System.out.println("That's not a valid height, please enter the height again: ");
      	                         	continue;
      	                         }
      	                         if (vHeight<0) {
      	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
      	                             vHeight = 0;
      	                             continue;
      	                         }
      	                         break;
                          	 } while (!input.equalsIgnoreCase("exit"));
                          	 if (input.equalsIgnoreCase("home")) {
      	                         	break;
      	                         }
      	                     if (input.equalsIgnoreCase("exit")) {
      	                         	break;
      	                         }
      	                     RectangularPrism rectPrism1 = new RectangularPrism(bLength,bWidth,vHeight);
      	                     rectPrism1.printSA();
      	                     rectPrism1.printVolume();
      	                   System.out.println("The program has been completed.");
  	                 		break;
                    	}
                    	else if (type.equals("cube")) {
                    		double sLength = 0;
                    		System.out.println("What is the side length?");
                         	 do {
     	                         input = sc.nextLine();
     	                         if (input.equalsIgnoreCase("home")) {
     	                         	break;
     	                         }
     	                         else if (input.equalsIgnoreCase("exit")) {
     	                         	break;
     	                         }
     	                         try {
     	                         	sLength = Double.parseDouble(input);
     	                         }
     	                         catch (NumberFormatException e) {
     	                         	System.out.println("That's not a valid length, please enter the length again: ");
     	                         	continue;
     	                         }
     	                         if (sLength<0) {
     	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
     	                             sLength = 0;
     	                             continue;
     	                         }
     	                         break;
                         	 } while (!input.equalsIgnoreCase("exit"));
                         	 if (input.equalsIgnoreCase("home")) {
     	                         	break;
     	                         }
     	                     if (input.equalsIgnoreCase("exit")) {
     	                         	break;
     	                         }
     	                     Cube cube1 = new Cube(sLength);
     	                     cube1.printSA();
     	                     cube1.printVolume();
     	                    System.out.println("The program has been completed.");
   	                 		break;
                    	}
                	}
                	else if (input.trim().equalsIgnoreCase("no") || input.trim().equalsIgnoreCase("n")){
                		Cube cube2 = new Cube();
                		RectangularPrism rectPrism2 = new RectangularPrism();
                		SquarePyramid sqPyramid2 = new SquarePyramid();
                		System.out.println("Well, see if you can find them somehow. If you do, type \"dimensions\" on the next line to enter them in.");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("home")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("exit")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("dimensions")) {
                        	if (type.equals("pyramid")) {
                        		double bLength = 0;
                        		double height = 0;
                        		System.out.println("What is the side length of the base?");
                           	 do {
       	                         input = sc.nextLine();
       	                         if (input.equalsIgnoreCase("home")) {
       	                         	break;
       	                         }
       	                         else if (input.equalsIgnoreCase("exit")) {
       	                         	break;
       	                         }
       	                         try {
       	                         	bLength = Double.parseDouble(input);
       	                         }
       	                         catch (NumberFormatException e) {
       	                         	System.out.println("That's not a valid length, please enter the length again: ");
       	                         	continue;
       	                         }
       	                         if (bLength<0) {
       	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
       	                             bLength = 0;
       	                             continue;
       	                         }
       	                         break;
                           	 } while (!input.equalsIgnoreCase("exit"));
                           	 if (input.equalsIgnoreCase("home")) {
       	                         	break;
       	                         }
       	                     if (input.equalsIgnoreCase("exit")) {
       	                         	break;
       	                         }
       	                     System.out.println("Now, what is the vertical height of the pyramid?");
                           	 do {
       	                         input = sc.nextLine();
       	                         if (input.equalsIgnoreCase("home")) {
       	                         	break;
       	                         }
       	                         else if (input.equalsIgnoreCase("exit")) {
       	                         	break;
       	                         }
       	                         try {
       	                         	height = Double.parseDouble(input);
       	                         }
       	                         catch (NumberFormatException e) {
       	                         	System.out.println("That's not a valid height, please enter the height again: ");
       	                         	continue;
       	                         }
       	                         if (height<0) {
       	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
       	                             height = 0;
       	                             continue;
       	                         }
       	                         break;
                           	 } while (!input.equalsIgnoreCase("exit"));
                           	 if (input.equalsIgnoreCase("home")) {
       	                         	break;
       	                         }
       	                     if (input.equalsIgnoreCase("exit")) {
       	                         	break;
       	                         }
       	                 		sqPyramid2.setbLength(bLength);
       	                 		sqPyramid2.setHeight(height);
       	                 		sqPyramid2.calcSA();
       	                 		sqPyramid2.calcVolume();
       	                 		System.out.println("The program has been completed.");
       	                 		break;
                       	}
                        	else if (type.equals("prism")) {
                        		double bLength = 0;
                        		double bWidth = 0;
                        		double vHeight = 0;
                        		System.out.println("What is the length of the base?");
                              	 do {
          	                         input = sc.nextLine();
          	                         if (input.equalsIgnoreCase("home")) {
          	                         	break;
          	                         }
          	                         else if (input.equalsIgnoreCase("exit")) {
          	                         	break;
          	                         }
          	                         try {
          	                         	bLength = Double.parseDouble(input);
          	                         }
          	                         catch (NumberFormatException e) {
          	                         	System.out.println("That's not a valid length, please enter the length again: ");
          	                         	continue;
          	                         }
          	                         if (bLength<0) {
          	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
          	                             bLength = 0;
          	                             continue;
          	                         }
          	                         break;
                              	 } while (!input.equalsIgnoreCase("exit"));
                              	 if (input.equalsIgnoreCase("home")) {
          	                         	break;
          	                         }
          	                     if (input.equalsIgnoreCase("exit")) {
          	                         	break;
          	                         }
          	                     System.out.println("Now, what is the width of the base?");
                              	 do {
          	                         input = sc.nextLine();
          	                         if (input.equalsIgnoreCase("home")) {
          	                         	break;
          	                         }
          	                         else if (input.equalsIgnoreCase("exit")) {
          	                         	break;
          	                         }
          	                         try {
          	                         	bWidth = Double.parseDouble(input);
          	                         }
          	                         catch (NumberFormatException e) {
          	                         	System.out.println("That's not a valid height, please enter the height again: ");
          	                         	continue;
          	                         }
          	                         if (bWidth<0) {
          	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
          	                             bWidth = 0;
          	                             continue;
          	                         }
          	                         break;
                              	 } while (!input.equalsIgnoreCase("exit"));
                              	 if (input.equalsIgnoreCase("home")) {
          	                         	break;
          	                         }
          	                     if (input.equalsIgnoreCase("exit")) {
          	                         	break;
          	                         }
          	                     System.out.println("Now, what is the vertical height of the prism?");
                              	 do {
          	                         input = sc.nextLine();
          	                         if (input.equalsIgnoreCase("home")) {
          	                         	break;
          	                         }
          	                         else if (input.equalsIgnoreCase("exit")) {
          	                         	break;
          	                         }
          	                         try {
          	                         	vHeight = Double.parseDouble(input);
          	                         }
          	                         catch (NumberFormatException e) {
          	                         	System.out.println("That's not a valid height, please enter the height again: ");
          	                         	continue;
          	                         }
          	                         if (vHeight<0) {
          	                             System.out.println("That's a negative height. That's not possible. Please enter the correct height.");
          	                             vHeight = 0;
          	                             continue;
          	                         }
          	                         break;
                              	 } while (!input.equalsIgnoreCase("exit"));
                              	 if (input.equalsIgnoreCase("home")) {
          	                         	break;
          	                         }
          	                     if (input.equalsIgnoreCase("exit")) {
          	                         	break;
          	                         }
          	                     rectPrism2.setWidth(bWidth);
          	                     rectPrism2.setLength(bLength);
          	                     rectPrism2.setHeight(vHeight);
          	                     rectPrism2.calcSA();
          	                     rectPrism2.calcVolume();
          	                   System.out.println("The program has been completed.");
      	                 		break;
                        	}
                        	else if (type.equals("cube")) {
                        		double sLength = 0;
                        		System.out.println("What is the side length?");
                             	 do {
         	                         input = sc.nextLine();
         	                         if (input.equalsIgnoreCase("home")) {
         	                         	break;
         	                         }
         	                         else if (input.equalsIgnoreCase("exit")) {
         	                         	break;
         	                         }
         	                         try {
         	                         	sLength = Double.parseDouble(input);
         	                         }
         	                         catch (NumberFormatException e) {
         	                         	System.out.println("That's not a valid length, please enter the length again: ");
         	                         	continue;
         	                         }
         	                         if (sLength<0) {
         	                             System.out.println("That's a negative length. That's not possible. Please enter the correct length.");
         	                             sLength = 0;
         	                             continue;
         	                         }
         	                         break;
                             	 } while (!input.equalsIgnoreCase("exit"));
                             	 if (input.equalsIgnoreCase("home")) {
         	                         	break;
         	                         }
         	                     if (input.equalsIgnoreCase("exit")) {
         	                         	break;
         	                         }
         	                     cube2.setLength(sLength);
         	                     cube2.calcSA();
         	                     cube2.calcVolume();
         	                    System.out.println("The program has been completed.");
       	                 		break;
                        	}
                    	}
   	                     
                        }
                	
                	else {
                    	System.out.println("That's not a valid answer, please answer yes or no: Do you know the dimensions of the shape? ");
                    	continue;
                    }
                	} while(!input.trim().equalsIgnoreCase("exit")); 
                } 
	                break;
                } while(!input.trim().equalsIgnoreCase("exit"));
                if (input.equalsIgnoreCase("home")) {
	                	continue;
	                }
	            if (input.equalsIgnoreCase("exit")) {
	                	break;
	                } 
            	} 
            
            else {
            	System.out.println("That's not a valid shape. Is your shape a sphere, prism, or pyramid?");
            	System.out.println("If it's something else, enter the word \"exit\" to exit and go google it. \n");
            	input = "home";
            	continue;
            }
            break;
        } while(!input.trim().equalsIgnoreCase("exit"));
        System.out.println("The program is now closing, goodbye.");
        sc.close();
            } 
    }
