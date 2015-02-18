//Alexander Arteaga
//Hw04 Banking
// This program should all the user to see their total amount,
//deposit, and withdraw money.

import java.util.Scanner; // for scanner
public class Banking {
    //main method for every program
    public static void main(String[] args) {
         int totalamount =1000 +  (int)(Math.random()*(5000-1000+1)); // random number between 1000 and 5000
         double totalamount3$= (double) totalamount;
         System.out.println("The total balance in your bank account is $"+totalamount3$+".");
          Scanner myScanner; // calling variable for scanner
           myScanner = new Scanner( System.in ); // this allows you to construct the scanner
           System.out.println("Enter 1 for depositing, Enter 2 for withdrawing, and enter 3 to view your balance again: "); // in order to ask for the variable
             int input = myScanner.nextInt();
             switch (input){
                 case 1: // first case
                     System.out.println("Enter how much you want to deposit?");
                     double deposit;
                       deposit= myScanner.nextDouble();
                       if (deposit>0){ //must have a positive amount to deposit
                          double totalamount1$= deposit+ totalamount3$;
                          System.out.println(" Your new total is $"+totalamount1$+".");
                       } 
                       else { 
                           System.out.println ("You didn't give a number or gave a number less than 0"); // to make sure they enter a positive number to deposit
                           return; // returns
                       }
                       break;
                 case 2: // second withdraw case 
                     System.out.println("Enter how much you want to withdraw?"); 
                      double withdraw;
                        withdraw= myScanner.nextDouble();      
                         if ((withdraw>0)&&(totalamount3$-withdraw>=0)){ // to insure they don't over draw or give a negative number
                             double totalamount2$= totalamount3$-withdraw;
                             System.out.println("Your new total is $"+totalamount2$+".");
                         }
                         else { 
                           System.out.println ("You didn't give a number or gave a number less than 0 or you withdraw past your total balance"); // to make sure they enter a positive number to deposit
                           return; // returns
                       }
                       break;
                 case 3: 
                     System.out.println("The total balance in your bank account is $"+totalamount3$+".");
                     break;
                     
                 default:
                  System.out.println("You did not enter a 1 for depositing, 2 for withdrawing, or a 3 for viewing your balance");
                  break;
                 
                 
             } // end of switch
             
             
             
             
             
        
        
        
        
    
        
        
        
        
        
        
        
        
    } //end of main method
} // end of class