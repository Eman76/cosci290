/* Emmanuel Maravilla
   Co Sci 290
   Hw
   
   REMEMBER TO ACCESS INSTRUCTIONS github.com/agenttuy/cosci290
 */
 import java.util.Scanner;
 public class GameDriver{
 
   public static void main(String[] args){
     
     
     Scanner input = new Scanner(System.in);
     int numberofpassengers = 0;
     String directionofexplosion = "";
     int randomNum = 0;
     int minimum = 1;
     int maximum = 100;
     
     
     System.out.println(" ___________.__             ___________                            __      \n"
                     +  "  \\__    ___/|  |__   ____   \\_   _____/__________   ____   _______/  |_   \n"
                     +  "    |    |   |  |  \\_/ __ \\   |    __)/  _ \\_  __ \\_/ __ \\ /  ___/\\   __\\  \n"
                     +  "    |    |   |   Y  \\  ___/   |     \\(  <_> )  | \\/\\  ___/ \\___ \\  |  |    \n"
                     +  "    |____|   |___|  /\\___  >  \\___  / \\____/|__|    \\___  >____  > |__|    \n"
                     +  "                  \\/     \\/       \\/                    \\/     \\/          ");
     
     System.out.println("You wake up cold and filled with bruises,the last thing you remember you were on an airplane and the engine blew out... \n");
     System.out.println("You're deep in a forest, in the middle of nowhere, and its pitch dark...\n");
     System.out.println("You're not hurt seriously, but you start to wonder what happend to everyone else on the flight... \n");
     System.out.println("How many about how many people were on that flight with you?");
     
     numberofpassengers = input.nextInt();
     
     System.out.println("\nBut if there was " + numberofpassengers + " passengers, where are they all? And the wreckage from the flight?");
     System.out.println("You hear a loud explosion in the distance, which direction is it in?");
     
     directionofexplosion = input.next();
     
     System.out.println("\nBecareful! Theres a giant piece of the airplane hurling towards you from the " + directionofexplosion);
     
     randomNum = minimum + (int)(Math.random() * maximum);
     
     if(randomNum > 50){
       System.out.println("\nThe piece of debris hits you in the head!");
     }
     
     else{
       System.out.println("The piece of debris slightly misses you and leaves you unscathed...");
     }
     
     
     
     System.out.println();
     System.out.println("      ________                        ________                       \n"
                 +  "     /  _____/_____    _____   ____   \\_____  \\___  __ ___________  \n"
                 +  "    /   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\  \n"
                 +  "    \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/  \n"
                 +  "     \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|     \n"
                 +  "            \\/     \\/      \\/     \\/          \\/          \\/        ");
     
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   }
 
 }