//Alexander Arteaga
//hw03 FourDigits
// The user should input a number and the program should print out the first four digits to the right of the decimal point.
import java.util.Scanner; // needed to use scanner
public class FourDigits {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    Scanner myScanner; // calling variable for scanner
   		 myScanner = new Scanner( System.in ); // this allows you to construct the scanner
   		 System.out.print("Enter a number you wish to find the first four digits to the right of its decimal point: "); // in order to ask for the variable
   		 double digit = myScanner.nextDouble(); // this accepts the user input
   		 //next we must print out each digit seperatly
   		 int digit1=(int) (digit*10)%10; // this is the first digit 
   		 int digit2=(int) (digit*100)%10; // this is the second digit
   		 int digit3=(int) (digit*1000)%10; // this is the third digit
   		 int digit4=(int) (digit*10000)%10; // lastly tihs is the fourth digit
   		 
   		 
   	  		 // this is so we only get the digits and not decimals
   		   		 System.out.println("Your digits are "+digit1+digit2+digit3+digit4+" ");
   	}  //end of main method   
} //end of class
