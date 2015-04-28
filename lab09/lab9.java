// Alexander Arteaga
//lab9
import java.util.Scanner;
import java.util.Random;
public class lab9{
    public static void main(String[] args){
        int i =0;
        while(i==0){
            Scanner scan = new Scanner(System.in);
            String a = "The";
            String b = adjective();
            String c = adjective();
            String d = subject();
            String e = pastverb();
            String f ="the";
            String g = adjective();
            String h = object();
            System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+".");
            System.out.println("Enter 1 for another really random sentence:");
            if(scan.hasNextInt()){
                int number =scan.nextInt();
                if(number ==1){
                    i=0;
                }
                else {
                    i=1;
                }
            }
            else{
                i=1;
            }
        } // end of while loop
    } // end main method
    public static String adjective(){
        Random randomGenerator = new Random();
        String adj = " ";
      int randomInt = randomGenerator.nextInt(10);
     switch(randomInt) {
         case 0: adj = "awesome";
              break;
         case 1: adj = "lazy";
              break;
         case 2:adj = "purple";
         break;
         case 3: adj = "cool";
          break;
         case 4:adj = "quick";
           break;
         case 5:adj = "red";
           break;
         case 6: adj = "annoying";
           break;
         case 7: adj = "adventrous";
            break;
         case 8: adj = "strong";
           break;
         case 9: adj = "small";
          break;
     } // end of switch
     return adj;
    } // end adjective
    
    public static String subject(){
        Random randomGenerator = new Random();
        String sub = " ";
      int randomInt = randomGenerator.nextInt(10);
     switch(randomInt) {
         case 0: sub = "pirate";
              break;
         case 1: sub = "dog";
              break;
         case 2:sub = "crab";
         break;
         case 3: sub = "ninja";
          break;
         case 4: sub = "bear";
           break;
         case 5: sub = "spartan";
           break;
         case 6: sub = "cat";
           break;
         case 7: sub= "lobster";
            break;
         case 8: sub = "sponge";
           break;
         case 9: sub = "president";
          break;
     } // end of switch
     return sub;
    }// end subject
    public static String object(){
        Random randomGenerator = new Random();
        String ob = " ";
      int randomInt = randomGenerator.nextInt(10);
     switch(randomInt) {
         case 0: ob = "rock";
              break;
         case 1: ob = "squirrel";
              break;
         case 2:ob = "dancer";
         break;
         case 3: ob = "computer";
          break;
         case 4: ob = "ship";
           break;
         case 5: ob = "knight";
           break;
         case 6: ob = "windmill";
           break;
         case 7: ob= "snake";
            break;
         case 8: ob = "alligator";
           break;
         case 9: ob = "shark";
          break;
     } // end of switch
     return ob;
    }// end object
    
    public static String pastverb(){
        Random randomGenerator = new Random();
        String verb = " ";
      int randomInt = randomGenerator.nextInt(10);
     switch(randomInt) {
         case 0: verb = "defeated";
              break;
         case 1: verb = "passed";
              break;
         case 2:verb = "hugged";
         break;
         case 3: verb = "fenced";
          break;
         case 4: verb = "pushed";
           break;
         case 5: verb = "punched";
           break;
         case 6: verb = "kissed";
           break;
         case 7: verb= "defenestrated";
            break;
         case 8: verb = "fought";
           break;
         case 9: verb = "loved";
          break;
     } // end of switch
     return verb;
    }// end verb
    
    
    
} // end of class