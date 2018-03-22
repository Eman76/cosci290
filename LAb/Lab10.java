/* Emmanuel Maravilla
   Co Sci 290
   March 20, 2018
   Lab 10
   
   Comments: First part of the code up to line 20 are asking for user input
             Second part of the code line 22 to 41 is sorting the numbers
             Last line of code 44 is putting the code on display to ascend.
             
   COLLABERATED WITH STEVEN LU
*/


import java.util.Scanner;
  
  public class Lab10{
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Input three integers: ");
    
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();
  
      int alt;
    if (number2 < number1 || number3 < number1){
      if (number2 < number1){
        alt = number1;
        number1 = number2;
        number2 = alt;
      }
      if (number3 < number1){
        alt = number1;
        number1  = number3;
        number3 = alt;
      }
    }
    
    if (number3 < number2){
      alt = number2;
      number2 = number3;
      number3 = alt;
    }
    
    System.out.println(number1 + " " + number2 + " " + number3);
  
    }
  }