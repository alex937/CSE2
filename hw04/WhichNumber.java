// Alexander Arteaga
// Hw04 WhichNumber
//  This program will ask for the user to guess a number between 1-10
// and then attempt to guess the number using a series of questions 

import java.util.Scanner; // need for scanner 
public class WhichNumber { 
     // main method for every java program
     public static void main(String[] args) {
         Scanner myScanner; // calling variable for scanner
         System.out.println("Guess a number between 1-10.");
         System.out.println("Now answer the following questions with a Y for yes and a N for no.");
          myScanner = new Scanner( System.in ); // this allows you to construct the scanner
           System.out.println("Is the number even? "); // in order to ask for the variable
   		   String answer1 = myScanner.next();
   		   String Y="Y"; // string for typing in yes
   		   String N="N"; // string for typing in no
          if(answer1.equals(Y)){ // for comparing strings
              
              System.out.println("Is it divisible by 3?");
              String answer2 = myScanner.next();
              if(answer2.equals(Y)){
                  System.out.println("Your number is 6!");
                  
                }
                else if(answer2.equals(N)){
                    System.out.println("Is it divisible by 4?");
                   String answer3 = myScanner.next();
                     if(answer3.equals(Y)){ // for comparing strings
              
                      System.out.println("Is the number divided by 4 greater than 1?");
                         String answer4 = myScanner.next();
                           if(answer4.equals(Y)){
                               System.out.println("Your number is 8!"); 
                           }
                           else if(answer4.equals(N)){
                               System.out.println("Your number is 4!");
                           }
                           else{
                            System.out.println("You did not enter a Y or N"); // have to enter Y or N
                                return;    //leaves the program
                               }
                               
                           }
                         
                         else if(answer3.equals(N)){
                             System.out.println("Is it divisble by 5?");
                             String answer5 = myScanner.next();
                           if(answer5.equals(Y)){
                               System.out.println("Your number is 10!"); 
                           }
                           else if(answer5.equals(N)){
                               System.out.println("Your number is 2!");
                           }
                           else{
                            System.out.println("You did not enter a Y or N"); // have to enter Y or N
                                return;    //leaves the program
                               }
                             
                         }
                         
                         else{
                            System.out.println("You did not enter a Y or N"); // have to enter Y or N
                                return;    //leaves the program
                               }
                     }
                     
                     
                     else{
                            System.out.println("You did not enter a Y or N"); // have to enter Y or N
                                return;    //leaves the program
                               }
                    
                    
                }
                
                
              
              
              
              
              
              
            
            
            
            else if(answer1.equals(N)){
                System.out.println("Is it divisible by 3?");
              String answer6 = myScanner.next();
                if(answer6.equals(Y)){
                 System.out.println("When divided by 3 is the result greater than 1?");   
                 String answer7 = myScanner.next();
                    if(answer7.equals(Y)){
                  System.out.println("Your number is 9!");
                  
                       }
                    else if(answer7.equals(N)){
                  System.out.println("Your number is 3!");
                  
                     }
                    else{
                      System.out.println("You did not enter a Y or N"); // have to enter Y or N
                      return;    //leaves the program
                       }
                }
                
                else if(answer6.equals(N)){
                    System.out.println("Is it greater than 6?");   
                 String answer8 = myScanner.next();
                          if(answer8.equals(Y)){
                  System.out.println("Your number is 7!");
                  
                       }
                       
                       
                       
                         else if(answer8.equals(N)){
                             System.out.println("Is it less than 3?");   
                             String answer9 = myScanner.next();
                               if(answer9.equals(Y)){
                              System.out.println("Your number is 1!");
                  
                                 }
                                else if (answer9.equals(N)){
                                  System.out.println("Your number is 5!");
                  
                                      }
                                else{
                                   System.out.println("You did not enter a Y or N"); // have to enter Y or N
                                   return;    //leaves the program
                                 }
                               
                         }
                         
                         
                         
                         
                          else{
                      System.out.println("You did not enter a Y or N"); // have to enter Y or N
                      return;    //leaves the program
                    }
                }
                else{
                      System.out.println("You did not enter a Y or N"); // have to enter Y or N
                      return;    //leaves the program
                    }
            }
            
            
            
         else{
         System.out.println("You did not enter a Y or N"); // have to enter Y or N
         return;    //leaves the program
         }
     } //end of main method   
  } //end of class
