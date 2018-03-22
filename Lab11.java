/* 
  Emmanuel Maravilla
  Co Sci290
  3/22/18
  
  Comments: The following code will ask the user for a 3 digit number then
            will determine whether the number inputed is a palindrome.
  
 */
 
 
  import java.util.Scanner;
    
    public class Lab11{
      
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a three digit integer: ");
        
      int palin = input.nextInt();
        
        int palin1 = (int)(palin / 100);
        int remaining = palin % 100;
        int palin3 = (int)(remaining % 10);
        
      
      System.out.println(palin + ((palin1 == palin3) ? " is a " : " is not a ") + "palindrome");
      }
    }