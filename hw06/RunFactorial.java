// Alexander Arteaga
// hw06 RunFactorial
// Ask the user for an integer between and including 9 and 16. Then find the factorial!
import java.util.Scanner; // gotta import scanner!
    public class RunFactorial { // class for every program
        public static void main(String[] args){ // main method
            Scanner myScanner; // calling variable for scanner
            myScanner = new Scanner( System.in ); // this allows you to construct the scanner
            System.out.println("Enter a number between 9 and 16 inclusively:");
           
            
            while(true){
                
             int factorial =1;
                double number = myScanner.nextDouble();
            double remainder = number%1;
            int number1 = (int) number;
              if((remainder==0)&& (number1>=9)&&(number1<=16)){
              for (int i=1; i<=number1; i++) {
                
                       
                           
                       factorial = factorial*i;
                       }
                       
        
                  System.out.println("The factorial of "+number1+" is "+factorial); 
                }
                
                else{
                    
                System.out.println("Invalid input. Try again!");
                 
                }
             }
             
                
            
            
            
            
            
            
        } // end of main method
              
    
} // end of class