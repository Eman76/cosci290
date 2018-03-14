/*
  Emmanuel Maravilla
  Co Sci 290
  3/13/18
  
  Lab #8: 2.2
  
 Comments: The following code will get the length and the radius that the user inputs
           and use the formula given by the question to solve the volume and area of the cylinder.
*/

import java.util.Scanner;
public class Lab8b{

public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
 
  System.out.println("Enter a radius and length for the cylinder...");
  double radius = input.nextDouble();
  
  double length = input.nextDouble();
  
  
  double area = radius * radius * Math.PI;
  
  
  double volume = area * length;
  
    
 System.out.println("The area is..." + area); 
  
 System.out.println("The volume is..." + volume); 
  }
}