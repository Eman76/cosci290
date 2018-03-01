/*
  Emmanuel Maravilla
  Co Sci 290
  Lab 5
  - Fix the logic and make this code check if each character is a letter
*/
import java.util.Scanner;
public class Lab5{

public static void main(String[] args){

  int nameLength = 0;
  String answer = "";
  boolean flag = false; //flag is optional
  
  //example of while loop
  while(nameLength < 2){
    System.out.println("What is your name?");
    
    answer = input.next();
    
    if(answer.length() < 2){
      System.out.println("Please enter in a name that is at least "
                        +"two letters long and no numbers");
      
      flag = false;
    }
    else{ //name is atleast 2 characters
          //check if name contains letter
          //use a for-loop because we know how many letters it has
      for(int index = 0; index < answer.length(); index++){
        
          System.out.println(answer.charAt(index));
        
        if(!Character.isLetter(answer.charAt(index))){
          System.out.println("Please enter in a name that is alteast "
                            + "two letters long and no numbers");
          break; //gets out of current loop
        }
      }//end of loop
      
    }
    nameLength= answer.length();
  }//end while loop
  
  }//end main method
  
}//end of class