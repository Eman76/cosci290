/*
Emmanuel Maravilla
Co Sci290

Introduction to methods lab 13
*/

  public class Lab13
  {
    
    //main method
    public static void main(String[] args)
    {
      
      //declare variable
      int a = 1;
      int b = 3;
      int c = 0;
      int d = -5;
      
      //print the sum of a and b
      System.out.println("Operations on a and b: ");
      System.out.println("addition = " + add(a, b));
      System.out.println("subtraction = " + subtract(a,b));
      System.out.println("multiplication = " + multiply(a,b));
      System.out.println("Division = " + divide(a,b));
      
      
      System.out.println("Operations on c and d: ");
      System.out.println("addition = " + add(c, d));
      System.out.println("subtraction = " + subtract(c,d));
      System.out.println("multiplication = " + multiply(c,d));
      System.out.println("Division = " + divide(c,d));
       
    
    }//end of main
    
    //this custom method adds two integers
    public static int add(int num1, int num2){
      
      //declare variables
      int sum = 0;
      
      //add num1 and num2 and assign to sum
      sum = num1 + num2;
      
      //return sum of num1 and num2
      return sum;
      
     
    }//end of add
    
    public static int subtract(int num1, int num2){
      
      //declare variables
      int difference = 0;
      
      //subtract num1 by num2 and assign to difference
      difference = num1 - num2;
      
      //return difference of num1 and num2
      return difference;
      
    }//end of difference
    
   public static int multiply(int num1, int num2){
     
     //decalre variables
     int product = 0;
     
     //multiply num1 by num2 and assign to product
     product = num1 * num2;
     
     //return product
     return product;
     
   }//end of product
 
    public static int divide(int num1, int num2){
      
      //decalre variables
      int remainder = 0;
      
      //divide num1 by num2 and assign to remainder
      remainder = num1 / num2;
      
      //return remainder  
      return remainder;
        
      
        
    }//end remainder
    
       
    
    
    
    
    
    
    
  }//end of class