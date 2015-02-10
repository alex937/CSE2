// Alexander Arteaga
// Lab03 BigMac
//  This program will computes the cost of buying a some Big Macs. 
// We will use the scanner class to decipher how many Big Macs, the cost per 
//Big Mac, and the percentage tax (dependent on state).
//It will then displays the total cost.
import java.util.Scanner; // needed to use scanner
public class BigMac {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			       Scanner myScanner; // calling variable for scanner
   			       myScanner = new Scanner( System.in ); // this allows you to construct the scanner
   			       System.out.print("Enter the number of Big Macs(an integer > 0): "); // in order to ask for the variable
   			       int nBigMacs = myScanner.nextInt(); // this accepts the user input
   			       System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): "); // input for price
                   double bigMac$ = myScanner.nextDouble(); // accepts user input
                	System.out.print("Enter the percent tax as a whole number (xx): "); // enters your state tax
                   double taxRate = myScanner.nextDouble(); // accepts user input
                    taxRate/=100; //user enters percent, but I want the proportion is needed
                    double cost$;
                   int dollars, dimes, pennies; ////whole dollar amount of cost for storing digits to the right of the decimal point for the cost$ 
                    cost$ = nBigMacs*bigMac$*(1+taxRate);//get the whole amount, dropping decimal fraction
                   dollars=(int)cost$;
                   //get dimes amount, e.g., 
                    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                    //  where the % (mod) operator returns the remainder
                    //  after the division:   583%100 -> 83, 27%5 -> 2 
                    dimes=(int)(cost$*10)%10;
                    pennies=(int)(cost$*100)%10;
                    System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a " + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);


         		  }  //end of main method   
  } //end of class

