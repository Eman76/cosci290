/* Emmanuel Maravilla
   Co Sci 290
   Hw
   
   REMEMBER TO ACCESS INSTRUCTIONS github.com/agenttuy/cosci290
 */

//importing the java scanner
 import java.util.Scanner;
//creates the class
 public class GameDriver{
 
   //main method start of app
   public static void main(String[] args){
     
     //intitializing the scanner
     Scanner input = new Scanner(System.in);
     //stating the variable for number of passengers
     int numberofpassengers = 0;
     //stating the variable for age
     int age = 0;
     //stating direction of explosion
     String directionofexplosion = "";
     //stating name
     String name = "";
     //stating country
     String country = "";
     //stating dog breed
     String dogbreed = "";
     //stating variable for randomNum
     int randomNum = 0;
     //stating the minimum for variable
     int minimum = 1;
     //stating the maximum for variable
     int maximum = 100;
     
     //System will pring out following ACII
     System.out.println(" ___________.__             ___________                            __      \n"
                     +  "  \\__    ___/|  |__   ____   \\_   _____/__________   ____   _______/  |_   \n"
                     +  "    |    |   |  |  \\_/ __ \\   |    __)/  _ \\_  __ \\_/ __ \\ /  ___/\\   __\\  \n"
                     +  "    |    |   |   Y  \\  ___/   |     \\(  <_> )  | \\/\\  ___/ \\___ \\  |  |    \n"
                     +  "    |____|   |___|  /\\___  >  \\___  / \\____/|__|    \\___  >____  > |__|    \n"
                     +  "                  \\/     \\/       \\/                    \\/     \\/          ");
     //System will print out following statement
     System.out.println("You wake up cold and filled with bruises,the last thing you remember you were on an airplane and the engine blew out... \n");
     //System will print out following statement
     System.out.println("You're deep in a forest, in the middle of nowhere, and its pitch dark...\n");
     //System will print out following statement
     System.out.println("You're not hurt seriously, but you start to wonder what happend to everyone else on the flight... \n");
     //System will print out following statement
     System.out.println("How many about how many people were on that flight with you?");
     
     //System asking for user to input varible
     numberofpassengers = input.nextInt();
     
     //System will print out following statement
     System.out.println("You see a man walk towards you...");
     //System will print out following statement
     System.out.println("'whats your name?'");
     
     //System waiting for user to input age
     name = input.next();
     
     //System will print out following statement
     System.out.println("'What country are you from " + name + "?'");
     
     //System asking for user input for country
     country = input.next();
     
     //System will ask following question
     System.out.println("'How old are you?'");
      
     //System waiting for user input for age
     age = input.nextInt();
     
     //system will ask following question
     System.out.println("You and the man are talking when you spot a dog. What breed is it?");
     
     //System will wait for user input
     dogbreed = input.next();
     
     //System will print out following statement
     System.out.print("The dog looks terrified and starts to run as fast as it can.");
     //System will print out following statement
     System.out.print("You have no idea where you are and start to get anxious...");
     
     //System will print out following statement
     System.out.println("\nBut if there were " + numberofpassengers + " passengers, where are they all? And the wreckage from the flight?");
     //System will print out following statement
     System.out.println("You hear a loud explosion in the distance, which direction is it in?");
     
     //system waiting for response
     directionofexplosion = input.next();
     
     //System will print out following statement
     System.out.println("\nBecareful! Theres a giant piece of the airplane hurling towards you from the " + directionofexplosion);
     
     //following code will get a random number between 1 and 100
     randomNum = minimum + (int)(Math.random() * maximum);
     
     //if the number is greater than 50 a piece of debris will hit user in head
     if(randomNum > 50){
       System.out.println("\nThe piece of debris hits you in the head!");
     }
     
     //else statement, if number is less than 50 the piece will miss
     else{
       System.out.println("The piece of debris slightly misses you and leaves you unscathed...");
     }
     
     
     
     //system will print out following ACII
     System.out.println("      ________                        ________                       \n"
                 +  "     /  _____/_____    _____   ____   \\_____  \\___  __ ___________  \n"
                 +  "    /   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\  \n"
                 +  "    \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/  \n"
                 +  "     \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|     \n"
                 +  "            \\/     \\/      \\/     \\/          \\/          \\/        ");
     
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   } //end app
 
 } //end class