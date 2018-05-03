/* Chapter 5 Loops Demo
    Emmanuel Maravilla
    Co Sci 290
*/

public class DemoLoops{
  
public static void main(String[] args){
    
    int counter = 0;
    
    for(int i = 1; i <= 100; i++){ //i++ is the same as i = i + 1
      //i+= same as i = i + 2
      
    if(i % 3 == 0){
      counter++;
      System.out.println(i + " ");
      }
      
     if(counter % 5 == 0){
       System.out.println();
    }
  
  
  
  
}
  
  
}  
}