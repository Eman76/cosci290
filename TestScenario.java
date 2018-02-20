/* 
  Emmanuel Maravilla
  Lab 3 - 2/20/18
  Co Sci 290
 
*/

public class TestScenario{


  public static void main(String[] args){
  
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum >= 90){
      System.out.println("You've been eaten by a cougar!");
    }
    else if(randomNum <= 80 && randomNum >= 70){
      System.out.println("You've stepped on a landmine");
    }
  
    else if(randomNum <= 60 && randomNum >= 50){
      System.out.println("You found a map on the ground");
    }
    
    else if(randomNum == 1){
      System.out.println("You've been saved!");
    }
    
    else{
      System.out.println("You move foward towards the noise and it turns out to be nothing!");
    }
  }
}