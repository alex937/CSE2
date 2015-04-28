//Alexander Arteaga
// lab 06
// in this lab we will generate a max of 30 smilies in an increaseing order
// ex 
// :)
// :))
public class SmileGenerator {
    public static void main(String[] args){ // start of main method
    System.out.println("For part 1 of the lab:");
    for(int i=0;i<5;i++){
        System.out.print(":)");
    }// for loop to print 5 smilies
    System.out.println(""); // just to go to next line for organizational purposes
    int j =0;
    while(j<5){
        System.out.print(":)");
        j++;
    } // while loop to print 5 smilies
    System.out.println("");
    int k=0;
    do{
        System.out.print(":)");
        k++;
    } while(k<5); // do while loop to print 5 smilies
    
    System.out.println("");
    
    System.out.println("For part 2 of the lab:");
    
        int rando = (int)(Math.random()*(100-0+1)); // to find a random number between 0 and 100
         for(int a=0; a<rando;a++){
             System.out.print(":)");
         } // for printing random amount of smilies on one line
         System.out.println("");
    System.out.println("For part 3 of the lab:");
      if(rando>30){
          for(int c=0; c<30;c++){
             System.out.print(":)");
         } 
      } // end if to limit to 30
      else{        for(int b=0; b<rando;b++){
             System.out.print(":)");
         } 
      } // end else  to limit to 30
      System.out.println("");
      
      System.out.println("For part 4:");
      for(int d=0;d<rando;d++){
          for(int t=0;t<=d;t++){
          System.out.print(":)");
          }
          System.out.println();
      }
         
    
        
    } // end of main method
    
    
    
}// end of class