// Alexander Arteaga
// hw06 MakeSymbols
// print out a number from 0-100 and then print that number of * for even numbers and & for negative numbers
public class MakeSymbols{  // start of public class
    public static void main(String[] args){ // start of main method
        int rando = (int)(Math.random()*(100-0+1)); // to find a random number between 0 and 100
         System.out.println("Random Integer:"+rando);
         
          int test= rando%2; // to test if even
         if (test ==0){
             System.out.print("The even output pattern:");
             do {
                 System.out.print("*");
                 rando--;
             } // end of do
             while (rando>0);
             
             
         } // end of if
         else{
             System.out.print("The odd output pattern:");
             do {
                 System.out.print("&");
             } // end of do
             while(rando>0);
         } // end of else
    
        
    } // end of main method
    
}// public class