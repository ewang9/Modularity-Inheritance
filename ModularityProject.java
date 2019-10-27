package modularityproject;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class ModularityProject {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the volume/surface area calculator");
        System.out.println("Enter the word \"home\" at any time to return to this home page, or exit to exit the program"); 
        //Initial welcome - only prints once ever
        String input = "home";
        //To tell when user wants to return to home page or exit program
        do{
            System.out.println("What archetype of shape would you like to analyze: sphere, prism, or pyramid?"); //Home page
            input = sc.nextLine();
            if (input.equalsIgnoreCase("home")) {
            	continue;
            }
            //Breaks all loops except largest one, and goes back to start of that one - returns to home page 
            //Is repeated often throughout code, I'll only explain it this once
            else if (input.equalsIgnoreCase("exit")) {
            	break;
            }
            //Breaks all the loops and exits the program - same deal as above, only one explanation
            else if (input.trim().equalsIgnoreCase("sphere")){ 			//Sphere section
            	double rad = 0; //Initialize radius - self explanatory
                System.out.println("Do you know the radius?");
                do {
                	input = sc.nextLine();
                	//User inputs if they know the radius
                    if (input.equalsIgnoreCase("home")) {
                    	break;
                    }
                    else if (input.equalsIgnoreCase("exit")) {
                    	break;
                    } 
                    //Home page, exit
                    if (input.trim().equalsIgnoreCase("yes") || input.trim().equalsIgnoreCase("y")){
                        System.out.println("What is it?");
                        //If yes, ask for radius
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
                        //Bulletproofing to ensure an actual possible radius
                        Sphere sphere1 = new Sphere(rad);
                        sphere1.printSA();
                        sphere1.printVolume();
                        System.out.println("The program has been completed.");
                        break;
                        //Print out results, exit program
                    }
                    else if (input.trim().equalsIgnoreCase("no") || input.trim().equalsIgnoreCase("n")){
                    	//If radius is unknown, program waits and asks user to find it
                        Sphere sphere2 = new Sphere();
                        System.out.println("Well, see if you can find it somehow. If you do, type \"radius\" on the next line to enter it in.");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("home")) {
                        	break;
                        }
                        else if (input.equalsIgnoreCase("exit")) {
                        	break;
                        }
                        //Home page/exit
                        else if (input.equalsIgnoreCase("radius")) {
                        	System.out.println("What is it?");
                        	rad = getValue("radius"); 
                        	//Method at bottom of code - basically ensures valid input, while accounting for user going to home page/exiting
                        	if (rad == -1) {
                        		input = "home";
                        		break;
                        	}
                        	else if (rad == -2) {
                        		input = "exit";
                        		break;
                        	}
                        	//Home page/exit, modified to work with getValue method
                        	sphere2.setRad(rad);
                        	sphere2.printSA();
                        	sphere2.printVolume();
                        	System.out.println("The program has been completed.");
                        	break;
                        	//Print results, exit
                        }
                        else {
                        	System.out.println("That's not a valid answer. I'll assume you can't find the radius, returning to the home page. \n");
                        	input = "home";
                        	break;
                        	//Does exactly what it says.
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
                //Home page/exit
            }
            else if (input.trim().equalsIgnoreCase("prism") || input.trim().equalsIgnoreCase("pyramid")){
                String type = input.toLowerCase();
                //Keeps track of whether it's a prism/pyramid for later calculations
            	do {
	                System.out.println("Is the base circular, triangular, or rectangular?");
	                input = sc.nextLine();
	                //Gets input for this question
	                if (input.equalsIgnoreCase("circular")||input.equalsIgnoreCase("c")) {
	                	double rad = 0;
	                	double height = 0;
	                	//Initialize radius/height
	                	System.out.println("Do you know the dimensions?");
	                	//From here to next comment, same deal as sphere - user input for dimensions, bulletproofing, home page/exit, etc.
	                	//Just different calculations at the end for volume/surface area
	                	do {
	                	input = sc.nextLine();
	                	if (input.equalsIgnoreCase("home")) {
	                    	break;
	                    }
	                    else if (input.equalsIgnoreCase("exit")) {
	                    	break;
	                    } 
	                    else if (input.trim().equalsIgnoreCase("yes") || input.trim().equalsIgnoreCase("y")){
	                    	 rad = getValue("radius");
	                    	 if (rad == -1) {
		                         input = "home";	
	                    		 break;
		                         }
		                     if (rad == -2) {
		                         input = "exit";	
		                    	 break;
		                         }
		                     height = getValue("height");
		                     if (height == -1) {
		                         input = "home";	
	                    		 break;
		                         }
		                     if (height == -2) {
		                         input = "exit";	
		                    	 break;
		                         }
		                   //Uses that type we saved earlier to differentiate cylinder/cone, prints results
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
	                	//Again, same as before - program waits for user to find dimensions, has them enter it, 
	                	//calculates/prints results while accounting for home page/exit
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
	                        	rad = getValue("radius");
			                     if (rad == -1) {
			                         input = "home";	
		                    		 break;
			                         }
			                     if (rad == -2) {
			                         input = "exit";	
			                    	 break;
			                         }
			                     height = getValue("height");
			                     if (height == -1) {
			                         input = "home";	
		                    		 break;
			                         }
			                     if (height == -2) {
			                         input = "exit";	
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
	                	//If the user enters an invalid answer to this question, program says so and asks them to try again
	                	else {
	                    	System.out.println("That's not a valid answer, please answer yes or no: Do you know the dimensions of the shape? ");
	                    	continue;
	                    }
	                } while(!input.trim().equalsIgnoreCase("exit"));
                }
	                //Basically same thing as circular base above, just with different dimensions because triangular base
	                //No need to repeat all those comments again - skipping to next part
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
                	 bLength = getValue("side length of the triangular base");
                     if (bLength == -1) {
                         input = "home";	
                		 break;
                         }
                     if (bLength == -2) {
                         input = "exit";	
                    	 break;
                         }
                     bHeight = getValue("height");
                     if (bHeight == -1) {
                         input = "home";	
                		 break;
                         }
                     if (bHeight == -2) {
                         input = "exit";	
                    	 break;
                         }
                     vHeight = getValue("height");
                     if (vHeight == -1) {
                         input = "home";	
                		 break;
                         }
                     if (vHeight == -2) {
                         input = "exit";	
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
                        	bLength = getValue("side length of the triangular base");
                            if (bLength == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (bLength == -2) {
                                input = "exit";	
                           	 break;
                            }
                           	bHeight = getValue("height of the triangular base");
                            if (bHeight == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (bHeight == -2) {
                                input = "exit";	
                           	 break;
                                }
                            vHeight = getValue("vertical height");
                            if (vHeight == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (vHeight == -2) {
                                input = "exit";	
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
                //Rectangular base - mostly same as above, but with slight differences
                else if (input.equalsIgnoreCase("rectangular")||input.equalsIgnoreCase("r")) {
                	if (type.equals("prism")){
                		//Asks if shape is a cube (bulletproofed) - if yes, goes to a separate case than 
                		//if it's a rectangular prism or square pyramid
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
                	 //More of the same
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
                    	//If square base pyramid - corresponding dimensions/calculations
                    	if (type.equals("pyramid")) {
                    		double bLength = 0;
                    		double height = 0;
                    		bLength = getValue("side length of the base");
                            if (bLength == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (bLength == -2) {
                                input = "exit";	
                           	 break;
                                }
                            height = getValue("vertical height");
                            if (height == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (height == -2) {
                                input = "exit";	
                           	 break;
                                }
   	                 		SquarePyramid sqPyramid1 = new SquarePyramid(bLength, height);
   	                 		sqPyramid1.printSA();
   	                 		sqPyramid1.printVolume();
   	                 		System.out.println("The program has been completed.");
   	                 		break;
                   	}
                    	//If rectangular prism, but not a cube
                    	else if (type.equals("prism")) {
                    		double bLength = 0;
                    		double bWidth = 0;
                    		double vHeight = 0;
                    		bLength = getValue("length of the base");
                            if (bLength == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (bLength == -2) {
                                input = "exit";	
                           	 break;
                                }
      	                   bWidth = getValue("width of the base");
                           if (bWidth == -1) {
                               input = "home";	
                      		 break;
                               }
                           if (bWidth == -2) {
                               input = "exit";	
                          	 break;
                               }
                           vHeight = getValue("vertical height");
                           if (vHeight == -1) {
                               input = "home";	
                      		 break;
                               }
                           if (vHeight == -2) {
                               input = "exit";	
                          	 break;
                               }
      	                     RectangularPrism rectPrism1 = new RectangularPrism(bLength,bWidth,vHeight);
      	                     rectPrism1.printSA();
      	                     rectPrism1.printVolume();
      	                   System.out.println("The program has been completed.");
  	                 		break;
                    	}
                    	//If shape is a cube
                    	else if (type.equals("cube")) {
                    		double sLength = 0;
                    		sLength = getValue("side length");
                            if (sLength == -1) {
                                input = "home";	
                       		 break;
                                }
                            if (sLength == -2) {
                                input = "exit";	
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
                		//If dimensions unknown - object created now, for dimensions to be 
                		//added into later
                		Cube cube2 = new Cube();
                		RectangularPrism rectPrism2 = new RectangularPrism();
                		SquarePyramid sqPyramid2 = new SquarePyramid();
                		//Same as before, no need to explain this again
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
                        		bLength = getValue("side length of the base");
                                if (bLength == -1) {
                                    input = "home";	
                           		 break;
                                    }
                                if (bLength == -2) {
                                    input = "exit";	
                               	 break;
                                    }
                                height = getValue("vertical height");
                                if (height == -1) {
                                    input = "home";	
                           		 break;
                                    }
                                if (height == -2) {
                                    input = "exit";	
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
                        		bLength = getValue("length of the base");
                                if (bLength == -1) {
                                    input = "home";	
                           		 break;
                                    }
                                if (bLength == -2) {
                                    input = "exit";	
                               	 break;
                                    }
                                bWidth = getValue("width of the base");
                                if (bWidth == -1) {
                                    input = "home";	
                           		 break;
                                    }
                                if (bWidth == -2) {
                                    input = "exit";	
                               	 break;
                                    }
                                vHeight = getValue("vertical height");
                                if (vHeight == -1) {
                                    input = "home";	
                           		 break;
                                    }
                                if (vHeight == -2) {
                                    input = "exit";	
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
                        		sLength = getValue("side length");
                                if (sLength == -1) {
                                    input = "home";	
                           		 break;
                                    }
                                if (sLength == -2) {
                                    input = "exit";	
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
            //If user enters something other than sphere, prism, pyramid - ex. different shape, grammar error, not a shape
            //Program only measures these 3 shapes, so anything else is outside its scope
            else {
            	System.out.println("That's not a valid shape. Is your shape a sphere, prism, or pyramid?");
            	System.out.println("If it's something else, enter the word \"exit\" to exit and go google it, this program doesn't cover it. \n");
            	input = "home";
            	continue;
            }
            break;
        } while(!input.trim().equalsIgnoreCase("exit"));
        //Goodbye message
        System.out.println("The program is now closing, goodbye.");
        sc.close();
            }

	//For taking user input for measurements
	public static double getValue(String measurement) { 
		//Takes parameter specifying what measurement is being asked - used for clarity
		double value = 0;
		//Final value to be returned
		String input = "";
		//Stores user input
		Scanner sc = new Scanner(System.in);
		//Initialize scanner
		System.out.println("What is the " + measurement + "?");
		//Asks for measurement
		do {
			input = sc.nextLine();		//Gets input
			if (input.equalsIgnoreCase("home")) {
				return -1;
			} else if (input.equalsIgnoreCase("exit")) {
				return -2;
			}
			//Home page/exit
			try {
				value = Double.parseDouble(input);
			} catch (NumberFormatException e) {
				System.out.println("That's not a valid measurement, please enter the " + measurement + " again: ");
				continue;
			}
			//If input is not actually a double, or home/exit, user is asked to try again
			if (value < 0) {
				System.out.println(
						"That's a negative value. That's not possible. Please enter the correct measurement.");
				value = 0;
				continue;
			}
			//Negative measurements are impossible, user is asked to try again
			break;
		} while (!input.equalsIgnoreCase("exit"));
		//By this point value variable is guaranteed an actual plausible measurement
		//Or the instruction to return to home page/exit program
		//Value is returned accordingly
		return value;
	}

}