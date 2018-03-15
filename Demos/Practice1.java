/* 
  Emmanuel Maravilla
  Co Sci 290
  - In class notes/ adding own comments
  
  Lab - Comment every single line of code
  
  Input: 5 and 2 
  
  Output: The system added, multiplied, divided, and subtracted 5 and 2. 
          Although you cannot divide 5 and 2 evenly the system did not give
          a decimal rather a whole number.
  
*/

//java object that allows user input
import java.util.Scanner;
//Start of every single class
public class Practice1{
  
  //entry pont of application
  public static void main(String[] args){
    
    //input the scanner to the application
    Scanner input = new Scanner(System.in);
    //allows user to input a variable for operand1
    int operand1;
    //allows user to input a variable for operand2
    int operand2;
    
    //System will show the following message telling user to input a whole number
    System.out.println("Please enter whole number...");
   
    //lets user input variable
   operand1 = input.nextInt();
    
   //System will show the following message telling user to enter another whole number
    System.out.println("Please enter in another whole number...");
    
   //lets user input variable
   operand2 = input.nextInt();
    
   //system will show the following messages after variables are inputted
   System.out.println("Let's do some basic math! \n "
                     + "Here are the numbers you chose.");
   //system will show the following messages
   System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2);
    
   //system will add operand1 and operand2
   System.out.println(operand1 + operand2);
    
   //syytem will multiply operand1 and operand2
   System.out.println(operand1 * operand2);
    
   //system will divide operand1 and operand2
   System.out.println(operand1 / operand2);
    
   //system will subtract operand1 and operand2
   System.out.println(operand1 - operand2);
   
  } //end app
}//end class