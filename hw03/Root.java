//Alexander Arteaga
//hw03 Root
// The user should input a number and a crude estimate of its cube root should print out
import java.util.Scanner; // needed to use scanner
public class Root {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    Scanner myScanner; // calling variable for scanner
   		 myScanner = new Scanner( System.in ); // this allows you to construct the scanner
   		System.out.print("Enter a number you wish to find the cube root of: "); // in order to ask for the variable
   		 double number = myScanner.nextInt(); // this accepts the user input
   	    double guess1 = number/3; // first guess (not sure if you wanted us to input the first guess or not)
   	    double guess2 = (guess1*guess1*guess1+number)/(3*guess1*guess1) ; // for a better estimate this will happen four more times
   	    double guess3 = (guess2*guess2*guess2+number)/(3*guess2*guess2) ; 
   	    double guess4 = (guess3*guess3*guess3+number)/(3*guess3*guess3) ;
   	    double guess5 = (guess4*guess4*guess4+number)/(3*guess4*guess4) ;
   	    double guess6 = (guess5*guess5*guess5+number)/(3*guess5*guess5) ;
  
   	    //now we can print out the answer
   	    System.out.print("The cube root estimate of "+number+" is "+guess6+" "); // this will tell you the estimate.
   	    double Crudecube= guess6*guess6*guess6;
   	       System.out.print("The cube estimate of is "+Crudecube+" "); // estimate of crude guess cubed
   	    
   	    
   	}  //end of main method   
} //end of class

   	