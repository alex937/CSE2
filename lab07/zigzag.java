//Alexander Arteaga
//lab 7
import java.util.Scanner;
public class zigzag{
    public static void main(String[] args){
        while(true){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number betwen 3 and 33 to make a zigzag:");
        if(scan.hasNextInt()){
            
        int nStarts= scan.nextInt();
        if((nStarts<=33) && (nStarts>=3)){
        for(int a=0; a<nStarts;a++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int i =0; i<(nStarts-2); i++){
            for(int j=0; j<(i+1);j++){
                System.out.print(" ");
            }
        System.out.println("*");
        }
       
        for(int b=0; b<nStarts;b++){
            System.out.print("*");
        }
        System.out.println();
        }
        else{
            System.out.println("You didn't enter an integer between 3 and 33!");
        }
        }
        
        
        else{
            System.out.println("Try again, you didn't enter an integer!");
        }
         System.out.println("Enter y or Y to go again: ");
         if((scan.hasNext("Y"))||(scan.hasNext("y"))){
         
         }
         else{
             System.exit(0);
         }
        }
    }
}