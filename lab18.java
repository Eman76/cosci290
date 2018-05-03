/*
  Emmanuel Maravilla
  Lab 18 5.10
*/

public class lab18{

public static void main(String[] args){
  
  int i;
  int counter = 0;
    
  for(i = 100; i <= 1000; i++){
    
    if(i % 5 == 0 && i % 6 == 0){
      counter++;
      System.out.print( i + " ");
    
    if(counter % 10 == 0){
      System.out.println();}
                         
             }//end if statement
    
        }//end loop

    }//end main method

 }//end class