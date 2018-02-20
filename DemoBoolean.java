/* Emmanuel Maravilla
  Co Sci 290
  2/15/18
  
 */




public class DemoBoolean{
   
 
 
    public static void main(String[] args){
      
      int num = 1;
      num = num + 1; //increment num by 1
      num++; //post-increment
      ++num; //pre-increment
      
      num = 1;
      int count = ++num; //pre-increment, count 2, num 2
      System.out.println("count " + count + " num " + num);
      num = 1;
      count = num++; //post-increment, count 1, num 2
      System.out.println("count " + count + " num " + num);
      
      count = num--; //post-decrement
      count = --num; //pre-drecrement
      
      
      //examples of augmented assignment operators
      
      num += 2; //equivalent to => num = num + 2;
      num *= 2; //num = num * 2;
      num /= 2; //num = num / 2;
      num -= 2; //num = num - 2;
      
      
      num = 2;
      double num2 = 3.0;
      
        System.out.println("Double wins: " + num * num2);
        System.out.println("Casting a double to int: " + (int) num2);
        System.out.println("Casting an int to a double " + (double) num); //turns the 2 into 2.0
        System.out.println("Casting a char to an int " + (int) 'c'); //turns the c into 99 because of AS
      
      int numberofzombies = 3;
      int actualnumofzombies = 100;
      
      if(numberofzombies == actualnumofzombies){ //evaluates true
       System.out.println("You might survive this apocalypse. ");
      
      }
      
      else{
        System.out.println("You might NOT survice this apocolypse. ");
      }
      
      //generating a random number 
      //Math.pow(3, 2) 3^2
      System.out.println(Math.random()); //random number between 0 and 100
     
      
      // formula for any range ise ==> minimum + (Math.random() * (max - min))
      System.out.println(5 + (int)(Math.random() * (10 - 5)));
      
      //
      int chanceofsurviving = 1 + (int)(Math.random() * (10-1));
      
      //random number
      System.out.println("Random num: " + chanceofsurviving);
      
      // you have a 30% chance of surviving, else you lose the game
      if (chanceofsurviving <= 3){
        System.out.println("You made it alive!");
        
      }
      
      else{
        System.out.println("Game over!");
      }
      
        
 
     }
 
 }