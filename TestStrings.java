/* 
  Emmanuel Maravilla
  Co Sci 290
  
  Notes on strings
  
*/


import java.util.Scanner;
public class TestStrings
{

public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  System.out.println("Are you rich? Yes or No?");
  
  
  //answer = answer.toLowerCase();
  
  /* 
  Impose some rules on user input
  */
  
  //example of a while loop
  int nameLength = 0;
  
 while(nameLength < 2){
   
    System.out.println("What is your name?");
 
  
  
  
  //get answer from console
  String answer = input.next();
  answer = input.next();
  
  if(answer.length() < 2){
    System.out.println("Please eneter in a name that is atleast "
                      + "two characters long");
    
    else{ //name is atleast 2 characters
      //check if name contains letters
      
      //for example, go through each letters in the name "Lo!gan"
      //name.charAt(0) to look at the character in index 0
      
      //use a for-loop because we know how many letters it has
      for(int index = 0; index < name.lenght(); index++){
        
        //check if the character is a letter or number
        if(!isLetter(name.charAt(index))){//if its not a letter
          
        }
      }
      
    }
    
    
    
    }
     nameLength = answer.length();

  }//end while loop
 
  
  
  
  /*
    Example below is to test for specific responses
    
    
    answer.toLowerCase() - makes all letters lowercase
    answer.toUpperCase() - makes al letters uppercase
    answer.equals("Some other string") - checks if two strings are
      exactly the same
    answer.equalsIgnoreCase("no") - checks if two Strings are equal regardless of case
  */
  
 /* 
  if(answer.equalsIgnoreCase("no")){ //"No" != "No" != NO !=nO
    System.out.println("That sucks!");
  }
  
  else{
    System.out.println("Cool.");
  }
  */
  
  }
}