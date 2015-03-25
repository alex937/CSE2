//Alexander Arteaga
// hw08
// In this lab we are making a video game!
// we will do this by using different methods.
import java.util.Scanner; // need to import scanner to use it
public class HW8 { // class used for every program
    public static void main(String[] args) { // main method given 
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }// end of main method given
    
    
     
    
    
    
    
    
    
    
    
    
    

    public static void giant(){ // start of giant method
    
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    
        
    }//end of giant picture method
    
    
    public static void cave() { // start of cave method
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    } // end of cave method
    
    
     public static void box(){ // start of box method
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    } // end of box method
    
    
   
    
    public static String getInput(Scanner scan, String string){// method for game progression
      String cont = scan.nextLine();
     if((cont.equals("C"))||(cont.equals("c"))){ // start of if to check for C or c
         
         return string;
     }// end of if for continuing 
     else{ // start of else statement for losers
        
       System.out.println("Yea right LOSER!");
        System.exit(0);
        
     } // end of else statement
      return ""; // java wants a return
    } // end of method for game progression
    
    
    
    
    
    
    
    
    
    
    
    public static String getInput(Scanner scan, String string, int trial) { // method for fighting the giant!\
    trial =10;
      while(trial>0){ // while loop
      
        String fight = scan.nextLine();
         
        if((fight.equals("A"))||(fight.equals("a"))){ // if for attacking
          int dmg = (int)(Math.random()*1);
          if(dmg==1){// start of critical
            System.out.println("Critical hit");  
            trial-= dmg;
          }  // end of critil
          
          
        } // end of if for attacking
       else if((fight.equals("E"))||(fight.equals("e"))){ // if for escaping
            int escap = (int)(Math.random()*9)+1;
            if(escap==10){ // if escape to matter
                trial-=escap;
            } // escaping if end
        }// end if for escaping
        else{ 
            System.out.println("Executed by the GIANT! Game Over! ");
            System.exit(0);
        }// end of player death
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
      }  // end of while loop
        return ("hi");
    } // end of method for fighting
    
    
    
    public static String getInput(Scanner scan){ // method of getting treasure
       int treasures = scan.nextInt();
       switch(treasures) {
           case 1: 
               System.out.println("You get free cookies!");
               break;
            case 2:
                System.out.println("You get a free A on the next exam!");
                break;
            case 3:
                System.out.println("You get a pencil?!");
                break;
            default:
              System.out.println("You got nothing for choosing nothing");
              break;
       }
        return("hi");
    } // end of getting treasure
    
    
    
} // end of class
