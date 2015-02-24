// Alexander Arteaga
// hw05 ToHex
// In this program we will convert from decimal to hexadecimal values.
// Mainly RGB values which are the colors Pixels are based on
import java.util.Scanner; // gotta import scanner
public class ToHex {
     //main method all the programs
     public static void main(String[] args){
        Scanner myScanner; // calling variable for scanner
        myScanner = new Scanner( System.in ); // this allows you to construct the scanner
        System.out.println("Please enter three numbers representing RGB values:");
        
        String red1; // string to print out
        String red2; // string to print out
        String green1; 
        String green2;
        String blue1; 
        String blue2;
        if(myScanner.hasNextInt()){
            int red = myScanner.nextInt(); // to make variables for red 
        int green = myScanner.nextInt(); // for green
        int blue = myScanner.nextInt(); // for blue
         if ((0<=red) || (red<256)){
                int reddivided = red/16; // finding how many times the value can be divided by 16
                int redremain= red%16; // finding the remainder 
               
                switch(reddivided){
                    
                    case 10:
                         red1 = "A"; // case for 10
                         break;
                    case 11:
                     red1="B"; //etc
                       break;
                    case 12:
                     red1="C"; 
                       break;
                    case 13:
                    red1="D"; 
                       break;
                    case 14:
                      red1="E";
                     break;
                     case 15:
                       red1="F"; 
                       break;
                    default:
                       red1=""+reddivided;
                        break;  // have to break case
                }
                switch(redremain){
                   
                       
                    case 10:
                         red2 = "A"; // case for 10
                         break;
                    case 11:
                     red2="B"; //etc
                       break;
                    case 12:
                      red2="C"; 
                       break;
                    case 13:
                      red2="D"; 
                       break;
                    case 14:
                        red2="E";
                     break;
                     case 15:
                       red2="F"; 
                       break;
                    default:
                       red2= ""+redremain;
                        break;  // have to break case
                }
                if(0<=green || green<256){
                    
                int greendivided = green/16; // finding how many times the value can be divided by 16
                int greenremain= green%16; // finding the remainder 
                
                switch(greendivided){
                    
                    case 10:
                          green1 = "A"; // case for 10
                         break;
                    case 11:
                      green1="B"; //etc
                       break;
                    case 12:
                      green1="C"; 
                       break;
                    case 13:
                      green1="D"; 
                       break;
                    case 14:
                       green1="E";
                     break;
                     case 15:
                       green1="F"; 
                       break;
                     default:
                        green1 =""+greendivided;
                      break;
                }
                switch(greenremain){
                   
                    case 10:
                         green2 = "A"; // case for 10
                         break;
                    case 11:
                       green2="B"; //etc
                       break;
                    case 12:
                      green2="C"; 
                       break;
                    case 13:
                      green2="D"; 
                       break;
                    case 14:
                       green2="E";
                     break;
                     case 15:
                       green2="F"; 
                       break;
                     default:
                         green2=""+greenremain;
                        break;  // have to break case
                }
                if(0<=blue || blue<256){
                    
                int bluedivided = blue/16; // finding how many times the value can be divided by 16
                int blueremain= blue%16; // finding the remainder 
                
                switch(bluedivided){
                    
                    case 10:
                         blue1 = "A"; // case for 10
                         break;
                    case 11:
                     blue1="B"; //etc
                       break;
                    case 12:
                     blue1="C"; 
                       break;
                    case 13:
                     blue1="D"; 
                       break;
                    case 14:
                      blue1="E";
                     break;
                     case 15:
                     blue1="F"; 
                       break;
                      default:
                       blue1=""+bluedivided;
                        break;  // have to break case
                }
                switch(blueremain){
                    
                    case 10:
                         blue2 = "A"; // case for 10
                         break;
                    case 11:
                      blue2="B"; //etc
                       break;
                    case 12:
                      blue2="C"; 
                       break;
                    case 13:
                      blue2="D"; 
                       break;
                    case 14:
                       blue2="E";
                     break;
                     case 15:
                      blue2="F"; 
                       break;
                    default:
                      blue2=""+blueremain;
                        break;  // have to break case
                }
                System.out.println("The decimal numbers R:"+red+", G:"+green+", B:"+blue+", is represented in hexadecimal as:"+red1+red2+green1+green2+blue1+blue2);
                
                
                
                }
                
               
            else if (blue>255){
            System.out.println("You cannot input an integer higher than 255"); // for values to high
            return;
            }
            
            
            else if (blue<0){
            System.out.println("You cannot input an integer lower than 0"); //for values to low
            return;
            }
            
            
            else{
            System.out.println("You didn't enter a valid integer"); // for values that are not integers
            return;
            }
              
                    
                    
                }
                
                
                
                
                
                
            else if( green>255){
            System.out.println("You cannot input an integer higher than 255"); // for values to high
            }
            
            
            else if (green<0){
            System.out.println("You cannot input an integer lower than 0"); //for values to low
            }
            
            
            else{
            System.out.println("You didn't enter a valid integer"); // for values that are not integers
            }
              
                    
                    
                    
                
         }      
                
                
                
                
               
            else if(red>255){
            System.out.println("You cannot input an integer higher than 255"); // for values to high
            }
            
            
            else if ( red<0){
            System.out.println("You cannot input an integer lower than 0"); //for values to low
            }
            
            
            else{
            System.out.println("You didn't enter a valid integer"); // for values that are not integers
            }
                
        
         
         
        }
        else{
            System.out.println("You didn't enter a valid integer"); // for values that are not integers
            
        }
     } // end main method
} // end class
