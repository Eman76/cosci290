/*
  Emmanuel Maravilla
  Co Sci 290
  3/13/18
  
  Lab #8: Question 2.1
*/


import java.util.Scanner;
public class Lab8{

public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter a number for celsius...");
  double celsius = input.nextDouble();
  
  double fahrenheit = (9.0/5) * celsius + 32;
  
  System.out.println("Celsius: " + celsius + " Is Fahrenheit: " + fahrenheit);
  
  
  
  
  }
}
