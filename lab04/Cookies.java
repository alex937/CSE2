// Alexander Arteaga
// Lab04 Cookies
//  This program will ask for the amount of people 
// and the number of cookies you are buying. It will then ask for 
// the amount of cookies you plan on giving to each person and tell you
// if everyone is given their fair share of cookies. 
import java.util.Scanner; // need for scanner 
public class Cookies { 
     // main method for every java program
     public static void main(String[] args) {
         Scanner myScanner; // calling variable for scanner
          myScanner = new Scanner( System.in ); // this allows you to construct the scanner
           System.out.println("Enter the number of people: "); // in order to ask for the variable
   		  
          if(myScanner.hasNextInt()){ // to insure that an integer is entered
              int people = myScanner.nextInt(); // this accepts the user input
              if ( people > 0 ){ // must have actual people to buy the cookies for
                  System.out.println("Enter the number of cookies you are buying: "); // in order to ask for the variable
   		          
   		           if ( myScanner.hasNextInt()) {
   		                int cookie= myScanner.nextInt(); // this accepts the user input
   		               if (cookie>0){
                          System.out.println(" Enter the number of cookies for each person:");
                            
                            if (myScanner.hasNextInt()) {
                                 int each= myScanner.nextInt(); // this accepts the user input
                              if ( each >= 0 ){ // must have actual people to buy the cookies for
                                   if( (cookie-(people*each))>= 0) {
                                       double cookie1= (double)cookie; // need to get multiple di
                                       double each1= (double) each;
                                       int cookiedivide = (int)((cookie1/each1)*10)%10; // so we can see if there is a remainder for the cookie division
                                       if (cookiedivide==0){
                                           System.out.println("You have enough cookies and they divide evenly.");
                                           
                                       }
                                       else { 
                                           System.out.println("You have enough cookies but they do not divide evenly.");
                                           
                                       }
                                    }
                                   else{
                                       int amountneeded;
                                       amountneeded= ((people*each)-cookie);
                                       System.out.println("You don't have enough cookies, you need at least "+amountneeded+" more.");
                                      return;
                                    }
                                   }
                                  else{System.out.println("The int must be greater than 0");
                                      return; //leaves the program
   		                              }
   		                   }
   		                   else{
                               System.out.println("You did not enter an int");
                                return;    //leaves the program
                                 
   		                          		                   }
   		               }
   		               else{System.out.println("The int must be greater than 0");
                  return; //leaves the program
   		               }
   		           }
   		           else {
   		               System.out.println("You did not enter an int");
   		               return;
   		           }
              }
              
              else{
                  System.out.println("The int must be greater than 0");
                  return; //leaves the program
              }
          }
              
          
          
    
         else{
         System.out.println("You did not enter an int");
         return;    //leaves the program
         }
     } //end of main method   
  } //end of class
