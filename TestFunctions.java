public class TestFunctions{

  public static void main(String[] args){
  
    /*
      access modifiers
      public - anything can see/access
      private - only functions within a class can access
      defaul - same thing as no written/declared modifiers
      
      return types
      -int
      -double
      -String
      -char
      -boolean
      -void - doesn't return anything
      - also can return different object types
      
      function names
      -follows the same rules as any identifier
      -use the name of the function to call it
      
      function parameters
      -input that the function uses inside somewhere
      in the function body
      -seperate multiple parameters with commas
      
     */
    
    //testing custom function called findSum()
    
    System.out.println("The sum of 2 and 3 is: " + findSum(2, 3));
    
    //test printHello()
    printHello("Emmanuel");
     
  }
  
  //this function finds the sum of two given numbers
  public static int findSum(int num1, int num2){
    int sum = num1 + num2;
    return sum;
    
  }
  
  public static void printHello(String name){
    System.out.println("Hello " + name);
  }
}