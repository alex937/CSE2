// Alexander Arteaga
// hw06 GetIntegers
// Ask the user for 5 non-negative integers and then print out the sum of the 5 integer
import java.util.Scanner; // gotta import scanner!
public class GetIntegers { // class
    public static void main(String[] args){ // main method
        Scanner myScanner; // calling variable for scanner
        myScanner = new Scanner( System.in ); // this allows you to construct the scanner
        int sum = 0; // starting value for sum
        System.out.println("Please enter a non-negative integers to add up together:");
        for(int i=0; i<5;){ // for loop to make sure it stops after 5
        
        // starting off with an if statement to insure the user inputs an integer
         

         if(myScanner.hasNextInt()){ // making sure there is an integer
              int integer1= myScanner.nextInt(); // giving the integer a value
              if(integer1>=0){ // making sure the integer is positive
             sum = sum + integer1; // adding them together
              i++; // to stop at 5
              }
              else {System.out.println(" You didn't input a positive integer, try again"); //to force the user to enter a positive integer
              }
         }
        
        else{System.out.println("You didn't enter an integer, try again"); // to force the user to enter an integer
            
        }
        
        }
        System.out.println("Your sum is "+sum); // print out sum
        
        
        
    } // end of main method 
    
    
} // end of class