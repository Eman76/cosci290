/*
	Emmanuel Maravilla
	
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code and/or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	NOTE: Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/



import java.util.Scanner; //following code will import the Scanner into the code
public class Lab12{ //execute the class starting the code
	
	
	public static void main(String[] args){ //main method to start code

    	     Scanner input = new Scanner(System.in); //Scanner is initialized into this part of the code

     	     Double num; //Declaring num

	         System.out.println("This program will check if a number"
                       	+  "is even or odd..."); //System will show the following statement to user
	
   	       System.out.println("Please enter in a whole number..."); //System will show the following statement to user
	
	         num = input.nextDouble(); //sytem will ask for user input
	
	   if(num % 2 == 0){ //if statement used to show that if the number given by the user is divisible by 2 then it is even
	
	         System.out.println("The number " + num + " is even..."); //System will show the following statement and add the users number into the statement
	                   } 
	   else{ //else stament for every other number
	         System.out.println("The number" + num + " is odd..."); //System will show the following statement and add the users number into the statement
	       }
	                                    }
	            }
