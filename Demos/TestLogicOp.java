/* 
  Emmanuel Maravilla
  - multiway if-else
  - logical operators
  - symbolic figures
  
 */


import java.util.Scanner;
public class TestLogicOp{
  
  public static void main(String[] args){
    
    //setting up scannner for user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter in a grade: ");
    
    int grade = input.nextInt();
    
    //simple if
    if(grade >= 90){
      System.out.println("A");
    }
    
   
    //two way if-else
    if(grade < 90){
      System.out.println("grade is not A");
    }
    
    else{
      System.out.println("grade is an A");
      
    }
    
    //multi if - else if - else
    if(grade >= 90){
      System.out.println("A");
    }
    
    else if(grade >= 80){
      System.out.println("B");
    }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F")
    }
    
    /*
    
    Logical Operators
    
    ! - NOT
    ! = - Not Equal to
    == - is equal to?
    && - AND
    || - OR
    
    
    
    
    */ 
    
    //using visuals-else, write code that checks whether
    //a student grade is good, average, or bad
    if(grade >= 80){
      System.out.println("This is a good grade.");
    }
    
    //nested-if
    if(grade >= 90)
   
    else if(grade < 80 %% grade >= 70){
      System.out.println("This grade is average.");
    }
    
    else{
      System.out.println("This is a bad grade.");
    }
    
    
  }
}