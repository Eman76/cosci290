/*
  Emmanuel Maravilla 
  Cosci 290
  3/15/18: Lab9
  Comments: The following code will ask the user to input 3 numbers
            the code will then get the numbers and one by one seperate them
            in order to add them at the end.
*/

import java.util.Scanner;
public class Lab9{

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter a number between 0 and 1000: ");
    int number = input.nextInt();
    
    int lessThan10 = number % 10;
    number /= 10;
  
    int tens = number % 10;
    number /= 10;
  
    int hundreds = number % 10;
    number /=10;
    
    int sum = (lessThan10 + tens + hundreds);
  
    System.out.println("The sum of the digits is: " + sum);
    


  }
}